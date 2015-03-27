package com.levelup.spring.model.dto;

import java.io.Serializable;

/**
 * Created by SMULL on 3/25/2015.
 */
public class StockPriceMine implements Serializable {

    private String companyName;
    private Double price;
    private Double volume;

    public StockPriceMine() {
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}
