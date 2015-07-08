package com.nizhegorodtsev;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 * Created by senizhegorodtsev on 7/7/2015.
 * Downloads the stock quote from Google finance
 * Gets close to real time quote
 */
public class StockGoogleDownloader implements IStockDownloader {
    @Override
    public Stock Download(String ticker) {

        Stock stock = null;
        try {
            StockGoogleMapping stockGoogleMapping = new StockGoogleMapping();

            URL yahoo = new URL(stockGoogleMapping.BuildFetchUrl(ticker));
            URLConnection connection = yahoo.openConnection();
            InputStreamReader is = new InputStreamReader(connection.getInputStream());
            BufferedReader br = new BufferedReader(is);
            // Parse JSON
            StringBuilder builder = new StringBuilder();
            String aux;
            while ((aux = br.readLine()) != null) {
                builder.append(aux);
            }
            String text = builder.toString();
            stock = stockGoogleMapping.MapStock(text);
        } catch (Exception e) {
            Logger log = Logger.getLogger(StockYahooDownloader.class.getName());
            log.log(Level.SEVERE, e.toString(), e);

        }
        return stock;
    }
}
