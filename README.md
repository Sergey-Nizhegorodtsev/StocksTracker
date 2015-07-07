# StocksTracker

This is an open source project. I have chosen "Apache License" for this sources. 
The project contains 2 main items: 
-Android app 
-Stocks API library.

The project is created, built and unit tested in Android Studio 1.2.2.

You can use Stocks API to fetch various stocks attributes like: asking price, volume, divident information, averages, etc.

If you would like to learn how to use API in your own projects you can start by using the following 2 lines of code:

StockYahooDownloader stockYahooDownloader = new StockYahooDownloader();
Stock stock = stockYahooDownloader.Download("FB");

Also the unit test is available for debugging purposes. The class is StockYahooDownloaderTest and the method is testDownload. Open the project in Android studio, point the cursor inside testDownload method, click right mouse button and choose "Debug 'testDownload()'". The unit test will go and download stock information.
