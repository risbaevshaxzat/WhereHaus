package uz.pdp.warehouse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehouse.entity.Product;

import java.util.function.Supplier;

@RepositoryRestResource(path = "product")
public interface ProductRepo extends JpaRepository<Product,Integer> {
}
