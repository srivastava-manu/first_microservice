package org.book.domain.model;

import java.util.ArrayList;
import java.util.List;

/**
 * Books
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
 public class Books extends ArrayList<Book>  {
	
	private List<Book> books = new ArrayList<Book>();
}

