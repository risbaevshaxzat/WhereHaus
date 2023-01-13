package uz.pdp.warehouse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehouse.entity.Client;
import uz.pdp.warehouse.entity.Output;

@RepositoryRestResource(path = "client" )
public interface ClientRepo extends JpaRepository<Client, Integer> {
}
