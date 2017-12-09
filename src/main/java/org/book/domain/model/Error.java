package org.book.domain.model;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Error
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
 public class Error   {
  /**
   * Gets or Sets code
   */
  public enum CodeEnum {
    DBERR("DBERR"),

    NTERR("NTERR"),

    UNERR("UNERR");

	  private String value;

    CodeEnum(String value) {
      this.value = value;
    }

  }

  @JsonProperty("code")
  private CodeEnum code = null;

  @JsonProperty("message")
  @NotNull
  private MultilingualErrorMessage message = null;

  public Error code(CodeEnum code) {
    this.code = code;
    return this;
  }

}

