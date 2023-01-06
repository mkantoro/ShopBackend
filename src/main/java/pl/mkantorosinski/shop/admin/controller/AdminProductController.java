package pl.mkantorosinski.shop.admin.controller;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.mkantorosinski.shop.admin.model.AdminProduct;
import pl.mkantorosinski.shop.admin.service.AdminProductService;

@RestController
@RequiredArgsConstructor
public class AdminProductController {

    private final AdminProductService adminProductService;

    @RequestMapping("/admin/products")
    public Page<AdminProduct> getProducts(Pageable pageable){
    return adminProductService.getProducts(pageable);
    }
}
