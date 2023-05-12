package pro.sky.shoppingcart.services;

import pro.sky.shoppingcart.models.Cart;
import pro.sky.shoppingcart.models.Item;

import java.util.List;
import java.util.Map;

public interface CartService {

    Map<Integer, Item> get();

    String addAll(List<Integer> items);

}
