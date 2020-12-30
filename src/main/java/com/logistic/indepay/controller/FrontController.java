package com.logistic.indepay.controller;

import com.logistic.indepay.model.*;
import com.logistic.indepay.service.CaptureDetails;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/")
@Slf4j
public class FrontController {

    @Autowired
    CaptureDetails captureDetails;

    @PutMapping("list/")
    public List<CustomDetails> listUsers(@RequestBody List<Long> lists)
    {
        return captureDetails.fetchCustomDetails(lists);
    }

    @GetMapping("fetch")
    public List<Merchant> fetchAgentInfo()
    {
        List<Merchant> response = captureDetails.fetchAgentInfo();
        log.info("number of responses received for agent info is {}",response.size());
        return response;
    }

    @GetMapping("customer/{custid}")
    public List<ClTxnBo> customerTransactionDetails(@PathVariable("custid") String custId)
    {
        List<ClTxnBo> response = captureDetails.fetchCustomerTransactionInfo(custId);
        log.info("number of responses received for the transaction Details are {}",response.size());
        return response;
    }

    //TODO while working on securing api's should be adding two more api's
    // 1. to create a user with password
    // 2. to update the password with specified id, where id and old password is given, if it matches
    // will update the password with new one

    @PostMapping("createuser")
    public Long createUser(@RequestBody User user)
    {
        return captureDetails.createUser(user);
    }
}
