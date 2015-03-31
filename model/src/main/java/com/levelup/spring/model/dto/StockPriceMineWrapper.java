package com.levelup.spring.model.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import sun.org.mozilla.javascript.internal.json.JsonParser;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by SMULL on 3/27/2015.
 */
public class StockPriceMineWrapper{


//    public StockPriceMineWrapper(){
//        super();
//    }

    List<StockPriceMine> stockPriceMines;



    public List<StockPriceMine> getStockPriceMines() {
        return stockPriceMines;
    }

    public void setStockPriceMines(List<StockPriceMine> stockPriceMines) {
        this.stockPriceMines = stockPriceMines;
    }
}
