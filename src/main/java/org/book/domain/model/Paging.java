package org.book.domain.model;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Paging
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
 public class Paging   {
  @JsonProperty("totalItems")
  @NotNull
  private Integer totalItems = null;

  @JsonProperty("totalPages")
  @NotNull
  private Integer totalPages = null;

  @JsonProperty("pageSize")
  @NotNull
  private Integer pageSize = null;

  @JsonProperty("currentPage")
  @NotNull
  private Integer currentPage = null;

}

