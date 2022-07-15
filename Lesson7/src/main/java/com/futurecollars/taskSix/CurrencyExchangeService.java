package com.futurecollars.taskSix;

public class CurrencyExchangeService implements ExchangeService{

    private double exchangeRate;

    @Override
    public double fetchExchangeRate(Currencies currencyForSale, Currencies currencyToBuy) {
        return exchangeRate;
    }
}
