package org.book.domain.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;

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

public class Authors {

	@Valid
	private List<Author> authors = new ArrayList<Author>();

}
