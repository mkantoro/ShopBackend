package pl.mkantorosinski.shop.product.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mkantorosinski.shop.product.model.Product;

public interface ProductRepository extends JpaRepository<Product,Long> {


}
