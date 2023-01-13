package uz.pdp.warehouse.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import uz.pdp.warehouse.entity.Attachment_content;
@RepositoryRestResource(path = "attachmentcontent")
public interface AttachmentcontentRepo extends JpaRepository<Attachment_content , Integer> {
}
