package uz.pdp.warehouse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehouse.entity.Input;
import uz.pdp.warehouse.entity.Output_product;

@RepositoryRestResource(path = "outputproduct" )
public interface Output_productRepo extends JpaRepository<Output_product, Integer> {
}
