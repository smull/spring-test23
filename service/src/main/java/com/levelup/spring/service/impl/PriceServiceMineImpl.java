package com.levelup.spring.service.impl;

import com.levelup.spring.model.dto.StockPriceMine;
import com.levelup.spring.service.PriceServiceMine;
import org.springframework.stereotype.Service;

import java.util.Random;

/**
 * Created by SMULL on 3/25/2015.
 */
@Service("priceServiceMine")
public class PriceServiceMineImpl implements PriceServiceMine {

    private final static String APPLE = "APPLE";
    private final static String EPAM = "EPAM";
    private final static String FACEBOOK = "FB";
    private final static int minRage = 100;
    private final static int maxRage = 500;


    public PriceServiceMineImpl() {
    }

    @Override
    public StockPriceMine getStockPriceMine(String company) {

        StockPriceMine stockPriceMine = new StockPriceMine();
        Random random = new Random();

        if (APPLE.equals(company)) {

            stockPriceMine.setPrice(minRage + (maxRage - minRage) * random.nextDouble());
            stockPriceMine.setVolume(minRage + (maxRage - minRage) * random.nextDouble());
        }
        if (EPAM.equals(company)) {

                stockPriceMine.setPrice(minRage + (maxRage - minRage) * random.nextDouble());
                stockPriceMine.setVolume(minRage + (maxRage - minRage) * random.nextDouble());
        }
        if (FACEBOOK.equals(company)) {

            stockPriceMine.setPrice(minRage + (maxRage - minRage) * random.nextDouble());
            stockPriceMine.setVolume(minRage + (maxRage - minRage) * random.nextDouble());
        }

        stockPriceMine.setCompanyName(company);
        return stockPriceMine;
    }
}
