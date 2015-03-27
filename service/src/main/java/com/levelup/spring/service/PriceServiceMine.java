package com.levelup.spring.service;

import com.levelup.spring.model.dto.StockPriceMine;

/**
 * Created by SMULL on 3/25/2015.
 */
public interface PriceServiceMine {

    public StockPriceMine getStockPriceMine(String company);
}
