package uz.pdp.warehouse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehouse.entity.Input_product;
import uz.pdp.warehouse.entity.User;

@RepositoryRestResource(path = "inputproduct" )
public interface InputproductRepo extends JpaRepository<Input_product, Integer> {
}
