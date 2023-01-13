package uz.pdp.warehouse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehouse.entity.Category;
import uz.pdp.warehouse.entity.User;

@RepositoryRestResource(path = "category" )
public interface CategoryRepo extends JpaRepository<Category, Integer> {
}
