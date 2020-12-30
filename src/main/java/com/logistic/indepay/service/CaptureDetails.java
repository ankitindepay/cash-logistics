package com.logistic.indepay.service;

import com.logistic.indepay.model.*;
import com.logistic.indepay.repository.MerchantRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import java.math.BigInteger;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

@Service
public class CaptureDetails {

    @Autowired
    EntityManager entityManager;

    @Autowired
    MerchantRepository merchantRepository;
    @Autowired
    UserServiceImpl userService;

    public List<Merchant> fetchAgentInfo()
    {
        Query q = entityManager.createNativeQuery("select * from themis.merchant", Merchant.class);
        List<Merchant> list = q.getResultList();
        return list;
    }

    public List<ClTxnBo> fetchCustomerTransactionInfo(String custId)
    {
        Query q = entityManager.createNativeQuery("select * from clogistic.cl_txn_bo where cust_ref_id=:custId", ClTxnBo.class);
        q.setParameter("custId",custId);
        List<ClTxnBo> list = q.getResultList();
        return list;
    }

    public List<CustomDetails> fetchCustomDetails(List<Long> id)
    {

        Function<Long,CustomDetails> result = val->{
               Query q = entityManager.createNativeQuery("select a.user_id,a.customer_type,a.first_name,a.last_name,a.shop_name,a.shop_category_code,a.shop_landmark,a.email_id,a.address,a.area_code,a.date_of_birth,a.gender,a.store_type_id,a.locale,a.area_name,a.city_name,a.shop_no,a.block_name,b.doc_id,b.doc_type,b.document_name,b.account_id,c.pmtinstrument_type,c.vpa,c.account_number,c.account_holder_name,c.ifsc,c.status,c.outlet_id from clogistic.cl_user_details as a,clogistic.cl_user_doc_details as b,clogistic.cl_user_pmtinstrument_details as c where a.user_id=:id", CustomDetails.class);
               q.setParameter("id",val);
               CustomDetails c = (CustomDetails) q.getResultList().get(0);
               if(c.getUserId()!=null) {
                   return c;
               }
               else return new CustomDetails();
        };
        List<CustomDetails> o = id.stream().map(result).collect(Collectors.toList());
        return o;
    }

    public Long createUser(User user)
    {
        User response = userService.saveOrUpdate(user);
        if(response.getId()!=null)
        {
            return response.getId();
        }
        return 0l;
    }
}
