package com.levelup.spring.view;

import com.levelup.spring.model.dto.StockPriceMine;
import com.levelup.spring.model.dto.StockPriceMineWrapper;
import com.levelup.spring.service.PriceServiceMine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * Created by SMULL on 3/25/2015.
 */
@Controller
public class PriceMineController {

    @Autowired
    PriceServiceMine priceServiceMine;

    @RequestMapping("/indexPrice")
    public String getIndex(Model modal) {
        return "indexPrice";
    }


//    @RequestMapping(value = "/info", produces = "application/json")
//    public @ResponseBody StockPriceMine getUpdate(@RequestParam("company")String company){
//        StockPriceMine stockPriceMine = priceServiceMine.getStockPriceMine(company);
//        return stockPriceMine;
//    }


    @RequestMapping(value = "/update", method = RequestMethod.POST, consumes = "application/json")
    public @ResponseBody String getUpdate(@RequestBody StockPriceMineWrapper wrapper){
       //StockPriceMine stockPriceMine = priceServiceMine.getStockPriceMine(company);
        for (StockPriceMine o : wrapper.getStockPriceMines() ) {
            System.out.println(o.getCompanyName());
            System.out.println(o.getPrice());
            System.out.println(o.getVolume());
        }

       return "ok";
   }





}
