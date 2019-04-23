package com.ictcg.laboratoryspringgradle2onjava11.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;

import java.time.LocalTime;
import java.util.Date;

public class MarketValue {

    @Id
    @JsonIgnore
    private String idTransaction;
    @JsonFormat(pattern = "HH:mm")
    private LocalTime time;
    @JsonIgnore
    private double price;
    @JsonFormat(pattern = "dd/MM/yyyy")
    private Date date;

    public MarketValue() {

    }

    public MarketValue(String idTransaction, LocalTime time, double price) {
        this.idTransaction = idTransaction;
        this.time = time;
        this.price = price;
    }

    public String getIdTransaction() {
        return idTransaction;
    }

    public void setIdTransaction(String idTransaction) {
        this.idTransaction = idTransaction;
    }

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
}
