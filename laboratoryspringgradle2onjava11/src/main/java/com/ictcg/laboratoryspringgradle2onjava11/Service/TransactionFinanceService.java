package com.ictcg.laboratoryspringgradle2onjava11.Service;

import com.ictcg.laboratoryspringgradle2onjava11.model.MarketValue;
import org.springframework.stereotype.Component;

import java.util.List;


public interface  TransactionFinanceService {


    List<MarketValue> findAllTransact();
    MarketValue getFirstTransaction ();
}
