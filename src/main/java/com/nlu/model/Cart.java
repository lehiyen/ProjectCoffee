package com.nlu.model;

import com.nlu.service.CartService;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.servlet.http.HttpSession;
import java.io.Serializable;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Data
@AllArgsConstructor
public class Cart implements Serializable {
    Map<String, Product> data = new HashMap<>();

    public Cart() {

    }

    public void put(Product p) {
        if (p == null) return;
        if (data.containsKey(p.getIdProduct())) {
         data.get(p.getIdProduct()).add();
            return;
        }
        p.setQuantity(1);
        data.put(p.getIdProduct(), p);
    }


    public void update(String id, int quantity) {
        if (quantity < 0) return;
        if (data.containsKey(id)) data.get(id).setQuantity(quantity);
    }

    public void remove(String id) {
        data.remove(id);
    }

    public  long total() {
        long sum = 0;
        for (Product p : data.values()) {
            sum += p.getPrice() * p.getQuantity();
        }
        return sum;
    }

    public static Cart getCart(HttpSession session) {
        return session.getAttribute("cart") == null ? new Cart() : (Cart) session.getAttribute("cart");
    }

    public Collection<Product> getData() {
        return data.values();
    }

    public void commit(HttpSession session) {
        session.setAttribute("cart", this);
    }

}