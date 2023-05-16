package pro.sky.shoppingcart.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pro.sky.shoppingcart.component.Cart;
import pro.sky.shoppingcart.models.Item;
import pro.sky.shoppingcart.repository.CartRepository;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class CartServiceImpl implements CartService {

    private final Cart cart;
    private final CartRepository cartRepository;

    @Autowired
    public CartServiceImpl(final Cart cart, final CartRepository cartRepository) {
        this.cart = cart;
        this.cartRepository = cartRepository;
    }

    @Override
    public List<Item> get() {
        return cart.get().stream()
                .map(cartRepository::get)
                .collect(Collectors.toList());
    }

    @Override
    public void add(Set<Integer> ids) {
        cart.add(ids);
    }

}
