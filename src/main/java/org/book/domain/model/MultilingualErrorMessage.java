package org.book.domain.model;

import java.util.HashMap;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * MultilingualErrorMessage
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
 public class MultilingualErrorMessage extends HashMap<String, ErrorMessage>  {
  @JsonProperty("defaultLanguage")
  private ErrorMessage defaultLanguage = null;

}

