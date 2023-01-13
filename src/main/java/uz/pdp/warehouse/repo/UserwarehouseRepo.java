package uz.pdp.warehouse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehouse.entity.Input;
import uz.pdp.warehouse.entity.User_warehouse;

@RepositoryRestResource(path = "userwarehouse" )
public interface UserwarehouseRepo extends JpaRepository<User_warehouse, Integer> {
}
