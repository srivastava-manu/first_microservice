package org.book.domain.repository;

import java.util.List;

import org.book.domain.model.Author;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends MongoRepository<Author, String> {

	 List<Author> findByName(String name);

}
