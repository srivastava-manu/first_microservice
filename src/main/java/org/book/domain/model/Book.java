package org.book.domain.model;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * Book
 */

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

@Document(collection = "books")

public class Book {
	@Id
	private String id;

	@NotNull
	private String title = null;
	@NotNull
	private String isBNNumber = null;

	private String genre = null;

	@DecimalMin("0")
	@DecimalMax("100000")
	@NotNull
	private Double price = null;

	private Author author = null;

}
