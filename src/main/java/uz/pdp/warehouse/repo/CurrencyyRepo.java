package uz.pdp.warehouse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehouse.entity.Currencyy;
import uz.pdp.warehouse.entity.Output;

@RepositoryRestResource(path = "currency" )
public interface CurrencyyRepo extends JpaRepository<Currencyy, Integer> {
}
