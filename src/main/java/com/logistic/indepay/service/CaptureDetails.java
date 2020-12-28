package com.logistic.indepay.service;

import com.logistic.indepay.model.ClTxnBo;
import com.logistic.indepay.model.ClUserDetails;
import com.logistic.indepay.model.Merchant;
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

    public List<Merchant> fetchAgentInfo()
    {
        Query q = entityManager.createNativeQuery("select * from themis.merchant", Merchant.class);
        List<Merchant> list = q.getResultList();
        return list;
    }

    public List<ClTxnBo> fetchCustomerTransactionInfo(BigInteger custId)
    {
        BigInteger b = new BigInteger(String.valueOf(custId));
        Query q = entityManager.createNativeQuery("select * from clogistic.cl_txn_bo where cust_ref_id=:custId", ClTxnBo.class);
        q.setParameter("custId",b);
        List<ClTxnBo> list = q.getResultList();
        return list;
    }

    public List<ClUserDetails> fetchUserDetails(List<Long> ids)
    {
        /*Long id = 289l;
        List<ClUserDetails> result;

        Query q = entityManager.createNativeQuery("select * from clogistic.cl_user_details where user_id=:id", ClUserDetails.class);
        q.setParameter("id",id);
        ClUserDetails lists = (ClUserDetails) q.getResultList().get(0);
        System.out.println(lists.toString());
        return new ArrayList<String>();*/

        Function<Long,ClUserDetails> function = idp -> {
            Query q = entityManager.createNativeQuery("select * from clogistic.cl_user_details where user_id=:id", ClUserDetails.class);
            q.setParameter("id",idp);
            return (ClUserDetails) q.getResultList().get(0);
        };
        //List<Long> conversion = ids.stream().map(val -> val.getUserId()).collect(Collectors.toList());
        List<ClUserDetails> result = ids.stream().map(function).collect(Collectors.toList());

        return result;
    }
}
