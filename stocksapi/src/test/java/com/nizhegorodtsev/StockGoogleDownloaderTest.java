package com.nizhegorodtsev;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by senizhegorodtsev on 7/8/2015.
 */
public class StockGoogleDownloaderTest {

    @Test
    public void testGoogleStockDownload() throws Exception {
        StockGoogleDownloader stockGoogleDownloader = new StockGoogleDownloader();

        Stock stock = stockGoogleDownloader.Download("FB");

        assertNotNull(stock);
        assertTrue(stock.getLastTrade() > 0);
        assertTrue(stock.getTicker().equals("FB"));
        assertTrue(stock.getChange() != null);

    }
}