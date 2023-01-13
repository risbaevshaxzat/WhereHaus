package uz.pdp.warehouse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehouse.entity.Attachment;
import uz.pdp.warehouse.entity.Attachment_content;

@RepositoryRestResource(path = "attachment")
public interface AttachmentRepo extends JpaRepository<Attachment, Integer> {
}
