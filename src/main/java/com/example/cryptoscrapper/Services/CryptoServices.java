package com.example.cryptoscrapper.Services;

import com.example.cryptoscrapper.Entities.Coin;

import java.util.List;

public interface CryptoServices {
    List<Coin> getTop10Prices();
}
