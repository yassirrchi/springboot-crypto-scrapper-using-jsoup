package web;

import Entities.Coin;
import Services.CryptoServices;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class CryptoController {
private  CryptoServices cryptoServices;


    @GetMapping(path = "/coins/all")
    public List<Coin> getTop10() {
        return cryptoServices.getTop10Prices();
    }




}
