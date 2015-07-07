package com.nizhegorodtsev;

/**
 * Created by senizhegorodtsev on 7/7/2015.
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StockYahooDownloader implements IStockDownloader {
    @Override
    public Stock Download(String ticker) {
        Stock stock = null;
        try
        {
            // Retrieve CSV File
            //Build the URL for retrieving
            StockYahooMapping stockYahooMapping = new StockYahooMapping();
            URL yahoo = new URL(stockYahooMapping.BuildFetchUrl(ticker));
            URLConnection connection = yahoo.openConnection();
            InputStreamReader is = new InputStreamReader(connection.getInputStream());
            BufferedReader br = new BufferedReader(is);
            // Parse CSV Into Array
            String line = br.readLine();
            stock = stockYahooMapping.MapStock(line);
        } catch (IOException e) {
            Logger log = Logger.getLogger(StockYahooDownloader.class.getName());
            log.log(Level.SEVERE, e.toString(), e);
        }
        return stock;
    }
}
