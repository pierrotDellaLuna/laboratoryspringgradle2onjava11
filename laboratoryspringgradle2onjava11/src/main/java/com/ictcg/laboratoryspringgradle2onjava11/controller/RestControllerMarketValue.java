package com.ictcg.laboratoryspringgradle2onjava11.controller;


import com.ictcg.laboratoryspringgradle2onjava11.Service.TransactionFinanceService;
import com.ictcg.laboratoryspringgradle2onjava11.model.MarketValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/date")
public class RestControllerMarketValue {

    @Autowired
    private TransactionFinanceService service ;


    @GetMapping("/getdate")
    public MarketValue getdate() {
        return service.getFirstTransaction();


    }


}
