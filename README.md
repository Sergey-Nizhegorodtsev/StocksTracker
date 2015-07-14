# StocksTracker

This is an open source project. I have chosen "Apache License" for this sources. 
The project contains 2 main items: 
-Android app 
-Stocks API library.

The project is created, built and unit tested in Android Studio 1.2.2.

You can use Stocks API to fetch various stocks attributes like: asking price, volume, divident information, averages, etc.

If you would like to learn how to use API in your own projects you can start by using the following 3 lines of code:

StockYahooMapping stockYahooMapping = new StockYahooMapping();
StockDownloader stockDownloader = new StockDownloader(stockYahooMapping);
Stock stock = stockDownloader.Download("FB");

Also the unit test is available for debugging purposes. The class is StockVariousDownloadersTest and the one of the methods is testGoogleStockDownload. Open the project in Android studio, point the cursor inside testGoogleStockDownload method, click right mouse button and choose "Debug 'testGoogleStockDownload()'". The unit test will go and it will  download stock information.
