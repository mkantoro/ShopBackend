package pl.mkantorosinski.shop.admin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pl.mkantorosinski.shop.admin.model.AdminProduct;


public interface AdminProductRepository extends JpaRepository<AdminProduct, Long> {
}
