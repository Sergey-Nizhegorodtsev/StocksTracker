package com.nizhegorodtsev;

import java.lang.reflect.Field;
import java.util.Date;

/**
 * Created by senizhegorodtsev on 7/6/2015.
 */
public class Stock {

    private String ticker; //s
    private Double ask;  //a
    private Double averageDailyVolume;   //a2
    private Double askSize;   //a5
    private Double bid;   //b
    private Double askRealTime;   //b2
    private Double bidRealTime;   //b3
    private Double bookValue;   //b4
    private Double bidSize;   //b6
    private String changeAndPercentChange;   //c
    private Double change;   //c1
    private Double comission;   //c3
    private Double changeRealTime;   //c6
    private Double afterHoursChange;   //c8
    private Double dividend;   //d
    private String lastTradeString;   //d1
    private String tradeDate;   //d2
    private Double earnings;   //e
    private String errorIndication; //e1
    private Double epsEstimatesCurrentYear; //e7
    private Double epsEstimatesNextYear; //e8
    private Double epsEstimatesNextQuater; //e9
    private Double floatShares; //f6
    private Double dayLow; //g
    private Double dayHigh; //h
    private Double _52weekLow; //j
    private Double _52weekHigh; //k
    private Double holdingsGainPercent; //g1
    private Double annualizedGain; //g3
    private Double holdingsGain; //g4
    private Double holdingsGainPercentRealTime; //g5
    private Double holdingsGainRealTime; //g6
    private String moreInfo; //i
    private Double orderBook; //i5
    private String marketCapitalization; //j1
    private String marketCapRealTime; //j3
    private String eBITDA; //j4 - Earnings Before Interest, Taxes, Depreciation and Amortization
    private Double changeFrom52WeekLow; //j5
    private Double percentChangeFrom52WeekLow; //j6
    private String lastTradeRealTimeWithTime; //k1
    private Double changePercentRealTime; //k2
    private Double lastTradeSize; //k3
    private Double changeFrom52WeekHigh; //k4
    private Double percentChangeFrom52WeekHigh; //k5
    private String lastTradeWithTime; //l
    private Double lastTrade; //l1
    private Double highLimit; //l2
    private Double lowLimit; //l3
    private String dayRange; //m
    private String dayRangeRealTime; //m2
    private Double _50dayMovingAverage; //m3
    private Double _200dayMovingAverage; //m4
    private Double changeFrom200dayMovingAverage; //m5
    private Double percentChangeFrom200dayMovingAverage; //m6
    private Double changeFrom50dayMovingAverage; //m7
    private Double percentChangeFrom50dayMovingAverage; //m8
    private String name; //n
    private String notes; //n4
    private Double open; //o
    private Double previousClose; //p
    private Double pricePaid; //p1
    private Double changePercent; //p2
    private Double PriceSales; //p5
    private Double PriceBook; //p6
    private String exDividendDate; //q
    private Double peRatio; //r
    private String dividendPayDate; //r1
    private Double peRatioRealTime; //r2
    private Double pegRatio; //r5
    private Double priceEPSEstimateCurrentYeat; //r6
    private Double priceEPSEstimateNextYeat; //r7
    private String sharesOwned; //s1
    private Double shortRatio; //s7
    private String lastTradeTime; //t1
    private String tradeLinks; //t6
    private String tickerTrend; //t7
    private String _1yearTargetPrice; //t8
    private double volume; //v
    private double holdingValue; //v1
    private double holdingValueRealTime; //v7
    private String _52weekRange; //w
    private Double dayValueChange; //w1
    private Double dayValueChangeRealTime; //w4
    private String stockExchange; //x

    public Stock()
    {
    }
    public Stock(String ticker)
    {
        this.ticker = ticker;
    }

    public void setProperty(String propertyName, String propertyValue)
    {
        try {
            Field f = this.getClass().getDeclaredField(propertyName);
            if (propertyValue == null)
                return;
            if (propertyValue == "N/A")
                return;
            Class<?> clazz = f.getType();
            if (clazz.equals(Double.class)) {
                Double d = new Double(Double.parseDouble(propertyValue.replace('%', ' ').trim()));
                f.set(this, d);
            } else if (clazz.equals(String.class)) {
                String strValue = propertyValue.trim();
                if (strValue.startsWith("\""))
                    strValue = strValue.substring(1);
                if (strValue.endsWith("\""))
                    strValue = strValue.substring(0, strValue.length() - 1);
                f.set(this, strValue);
            }

        } catch (NoSuchFieldException x) {
            x.printStackTrace();
        }catch (IllegalArgumentException x) {
            x.printStackTrace();
        } catch (IllegalAccessException x) {
            x.printStackTrace();
        }
    }

}
