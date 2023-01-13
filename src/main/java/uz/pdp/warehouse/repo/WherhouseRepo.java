package uz.pdp.warehouse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehouse.entity.Wherhouse;
@RepositoryRestResource(path = "wherhouse")
public interface WherhouseRepo extends JpaRepository<Wherhouse , Integer> {
}
