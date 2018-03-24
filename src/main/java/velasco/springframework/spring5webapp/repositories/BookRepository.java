package velasco.springframework.spring5webapp.repositories;

import org.springframework.data.repository.CrudRepository;
import velasco.springframework.spring5webapp.model.Book;

public interface BookRepository extends CrudRepository<Book, Long> {
}
