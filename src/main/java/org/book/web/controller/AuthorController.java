package org.book.web.controller;

import javax.validation.Valid;
import javax.validation.ValidationException;

import org.book.domain.model.Authors;
import org.book.domain.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/authors")
public class AuthorController {

	@Autowired
	private AuthorService authorService;

	@PostMapping("/_create")
	@ResponseStatus(HttpStatus.CREATED)
	public Authors create(@Valid @RequestBody Authors authors, BindingResult errors) {

		if (errors.hasErrors()) {
			throw new ValidationException(errors.toString());
		}
		return authorService.saveOrUpdate(authors);

	}

	@GetMapping("/_get/{authorName}")
	@ResponseStatus(HttpStatus.OK)
	public Authors find(@PathVariable String authorName) {

		return Authors.builder().authors(authorService.find(authorName)).build();
	}

	@PutMapping("/_update")
	@ResponseStatus(HttpStatus.CREATED)
	public Authors update(@RequestBody @Valid Authors authors) {

		return authorService.saveOrUpdate(authors);

	}

	@GetMapping("/_search")
	@ResponseStatus(HttpStatus.OK)
	public Authors findAll() {

		return Authors.builder().authors(authorService.getAll()).build();
	}

}