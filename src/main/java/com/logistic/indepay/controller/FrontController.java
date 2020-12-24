package com.logistic.indepay.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("")
public class FrontController {

    @GetMapping
    public void listUsers(List<String> list)
    {
        //implement to get the list of user details
        /*
         * select * from clogistic.cl_user_details; (1)
            select * from clogistic.cl_user_doc_details; (1)
            select * from clogistic.cl_user_pmtinstrument_details; (1)
         */
    }

    @GetMapping
    public void fetchAgentInfo()
    {
        //for now fetch all the agent's information
        //select * from themis.merchant;
    }

    @GetMapping
    public void customerTransactionDetails(String custId)
    {
        //select * from clogistic.cl_txn_bo;
    }
}
