package uz.pdp.warehouse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehouse.entity.Input;
import uz.pdp.warehouse.entity.User;

@RepositoryRestResource(path = "input" )
public interface InputRepo extends JpaRepository<Input, Integer> {
}
