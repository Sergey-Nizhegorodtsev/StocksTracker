package com.nizhegorodtsev;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by senizhegorodtsev on 7/7/2015.
 */
public class StockYahooDownloaderTest {

    @Test
    public void testYahooStockDownload() throws Exception {

        StockYahooDownloader stockYahooDownloader = new StockYahooDownloader();

        Stock stock = stockYahooDownloader.Download("FB");

        assertNotNull(stock);
        assertTrue(stock.getAsk() > 0);
        assertTrue(stock.getName().contains("Facebook"));
        assertTrue(stock.getChange() != null);
    }
}