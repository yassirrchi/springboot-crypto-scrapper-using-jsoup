package com.example.cryptoscrapper.web;

import com.example.cryptoscrapper.Entities.Coin;
import com.example.cryptoscrapper.Services.CryptoServices;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class CryptoController {
    
private  CryptoServices cryptoServices;


    @GetMapping(path = "/coins/all")
    public List<Coin> getTop10() {
        List<Coin> list=cryptoServices.getTop10Prices();

        return list;
    }
    @GetMapping(path = "/")
    public String getTop() {
        return "cryptoServices.getTop10Prices()";
    }




}
