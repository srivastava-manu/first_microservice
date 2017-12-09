package org.book.domain.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;


import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * ErrorMessage
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
 public class ErrorMessage   {
  @JsonProperty("longMessage")
  @NotNull
  private String longMessage = null;

  @JsonProperty("shortMessage")
  @NotNull
  private String shortMessage = null;
}

