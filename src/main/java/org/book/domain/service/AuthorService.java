package org.book.domain.service;

import java.util.ArrayList;
import java.util.List;

import org.book.domain.model.Author;
import org.book.domain.model.Authors;
import org.book.domain.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional(readOnly = true)
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepository;

	@Transactional
	public Authors saveOrUpdate(final Authors authors) {

		List<Author> authList = new ArrayList<Author>();
		if (authors != null && authors.getAuthors() != null && !authors.getAuthors().isEmpty()) {
			authList.addAll(authorRepository.save(authors.getAuthors()));
		}

		return Authors.builder().authors(authList).build();

	}

	@Transactional
	public List<Author> find(final String name) {

		return authorRepository.findByName(name);

	}

	public List<Author> getAll() {
		return authorRepository.findAll();
	}

}