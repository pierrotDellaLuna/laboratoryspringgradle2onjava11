package com.ictcg.laboratoryspringgradle2onjava11.Service;

import com.ictcg.laboratoryspringgradle2onjava11.model.MarketValue;
import org.springframework.stereotype.Component;

import java.time.LocalTime;
import java.util.Date;
import java.util.List;


@Component
public class TransactionFinanceServiceImpl implements TransactionFinanceService {
    @Override
    public List<MarketValue> findAllTransact() {
        return null;
    }

    @Override
    public MarketValue getFirstTransaction() {
        MarketValue transac = new MarketValue() ;
        transac.setTime(LocalTime.now());
        transac.setDate(new Date());
        return transac ;
    }
}
