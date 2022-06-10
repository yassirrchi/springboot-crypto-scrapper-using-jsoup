package com.example.cryptoscrapper.Services;

import com.example.cryptoscrapper.Entities.Coin;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class CryptoServicesImpl implements CryptoServices{
    @Override
    public List<Coin> getTop10Prices() {
        final String Link="https://coinmarketcap.com/";
        final List<String>attributes= Arrays.asList("rank","name","price","h24","_7d","vol_h24$","vol_h24c","supply","Acro");
        List<Coin> allCoins=new ArrayList<>();

        try{
            final Document document= Jsoup.connect(Link).timeout(6000).get();
            Elements body=document.select(" div > div> div > div > div> div > table > tbody > tr");
            int i=0;
            // System.out.println(body.text());
            for(Element e: body){
                Coin coin=new Coin();
                if(i>9){
                    System.out.println("mehh ");
                    break;
                }

                for(int j=1;j<=8;j++){
                    //System.out.println(e.child(j).text());
                    coin.setAll(attributes.get(j-1),e.child(j).text());

                }System.out.println("-----------");
                allCoins.add(coin);

                System.out.println("-----------");
                i++;
            }
            System.out.println("--------------");
            for(int l=0; l<10;l++)
                allCoins.get(l).getAll();
            return allCoins;
        }
        catch (Exception e){
            System.out.println(e);
        }
        return null;

    }
}
