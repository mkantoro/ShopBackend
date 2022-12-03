package pl.mkantorosinski.shop.product.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mkantorosinski.shop.product.model.Product;
import pl.mkantorosinski.shop.product.service.ProductService;

@RestController
@RequiredArgsConstructor
public class ProductController {

    private final ProductService productService;

    @GetMapping("/products")
    public Page<Product> getProduct(@PageableDefault(size = 25) Pageable pageable){
//        return List.of(new Product("Nowy product 1 ", "nowa kategoria 1","nowy opis 1 ",new BigDecimal(8.77),"PLN"),
//                new Product("Nowy product 2", "nowa kategoria 2","nowy opis 2 ",new BigDecimal(2.55),"PLN"),
//                new Product("Nowy product 3 ", "nowa kategoria 3","nowy opis 3 ", new BigDecimal(5.88),"PLN"));
//    return ResponseEntity.status(HttpStatus.OK).
//            lastModified(ZonedDateTime.of(LocalDateTime.now(ZoneId.of("Europe/Warsaw")),ZoneId.of("Europe/Warsaw")))
//
//                    .body(productService.getProducts());

        return productService.getProducts(pageable);


    }
}
