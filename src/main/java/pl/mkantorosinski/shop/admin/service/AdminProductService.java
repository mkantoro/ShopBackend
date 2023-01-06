package pl.mkantorosinski.shop.admin.service;

import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import pl.mkantorosinski.shop.admin.model.AdminProduct;
import pl.mkantorosinski.shop.admin.repository.AdminProductRepository;

@Service
@RequiredArgsConstructor
public class AdminProductService {

    private final AdminProductRepository adminProductRepository;

    public Page<AdminProduct> getProducts(Pageable pageable){
    return adminProductRepository.findAll(pageable);
    }

}
