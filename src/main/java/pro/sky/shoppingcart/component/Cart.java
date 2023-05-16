package pro.sky.shoppingcart.component;

import org.springframework.stereotype.Component;
import org.springframework.web.context.annotation.SessionScope;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

@Component
@SessionScope
public class Cart {

    private final Set<Integer> ids = new HashSet<>();

    public void add(Set<Integer> ids) {
        this.ids.addAll(ids);
    }

    public Set<Integer> get() {
        return Collections.unmodifiableSet(ids);
    }

    @PostConstruct
    public void init() {
        System.out.println("Cart created: " + ids.size());
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Cart destroyed: " + ids.size());
    }

}
