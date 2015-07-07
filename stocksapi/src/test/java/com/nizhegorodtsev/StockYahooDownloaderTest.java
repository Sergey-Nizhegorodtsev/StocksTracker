package com.nizhegorodtsev;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by senizhegorodtsev on 7/7/2015.
 */
public class StockYahooDownloaderTest {

    @Test
    public void testDownload() throws Exception {

        StockYahooDownloader stockYahooDownloader = new StockYahooDownloader();

        Stock stock = stockYahooDownloader.Download("FB");

        assertNotNull(stock);

    }
}