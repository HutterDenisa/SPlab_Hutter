package ro.uvt.info.sp_lab.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import ro.uvt.info.sp_lab.models.Author;

public interface AuthorsRepository extends JpaRepository<Author, Integer> {
}
