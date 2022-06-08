package Services;

import Entities.Coin;

import java.util.List;

public interface CryptoServices {
    List<Coin> getTop10Prices();
}
