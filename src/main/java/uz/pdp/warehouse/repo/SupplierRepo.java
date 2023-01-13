package uz.pdp.warehouse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.function.Supplier;
@RepositoryRestResource(path = "supplier")
public interface SupplierRepo extends JpaRepository<Supplier,Integer> {
}
