package pl.mkantorosinski.shop.product.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mkantorosinski.shop.product.model.Product;

import java.math.BigDecimal;
import java.util.List;

@RestController
public class ProductController {
    @GetMapping("/products")
    public List<Product> getProduct(){
        return List.of(new Product("Nowy product 1 ", "nowa kategoria 1","nowy opis 1 ",new BigDecimal(8.77),"PLN"),
                new Product("Nowy product 2", "nowa kategoria 2","nowy opis 2 ",new BigDecimal(2.55),"PLN"),
                new Product("Nowy product 3 ", "nowa kategoria 3","nowy opis 3 ", new BigDecimal(5.88),"PLN"));
    }
}
