package org.book.domain.model;

import java.util.List;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;

import org.hibernate.validator.constraints.Length;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Document(collection = "authors")

@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author {
	@Id
	private String id;

	@NotNull
	@Pattern(regexp = "[a-z0-9]")
	@Length(min = 1, max = 256)
	private String name = null;

	private Long dateOfBirth = null;

	private List<String> languages = null;
}
