package uz.pdp.warehouse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehouse.entity.User;

@RepositoryRestResource(path = "users" )
public interface UserRepo extends JpaRepository<User , Integer> {
}
