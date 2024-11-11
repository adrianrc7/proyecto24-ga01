package org.openapitools.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonTypeName;
import org.openapitools.jackson.nullable.JsonNullable;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * VisualizationUserIDFilmFilmIDSubtitlesPostRequest
 */

@JsonTypeName("_visualization__userID__film__filmID__subtitles_post_request")
@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2024-11-11T16:32:34.104885200+01:00[Europe/Madrid]", comments = "Generator version: 7.9.0")
public class VisualizationUserIDFilmFilmIDSubtitlesPostRequest {

  private String languageCode;

  public VisualizationUserIDFilmFilmIDSubtitlesPostRequest languageCode(String languageCode) {
    this.languageCode = languageCode;
    return this;
  }

  /**
   * Especifica mediante Sí o No si desea activar los subtitulos
   * @return languageCode
   */
  
  @Schema(name = "languageCode", example = "Sí", description = "Especifica mediante Sí o No si desea activar los subtitulos", requiredMode = Schema.RequiredMode.NOT_REQUIRED)
  @JsonProperty("languageCode")
  public String getLanguageCode() {
    return languageCode;
  }

  public void setLanguageCode(String languageCode) {
    this.languageCode = languageCode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VisualizationUserIDFilmFilmIDSubtitlesPostRequest visualizationUserIDFilmFilmIDSubtitlesPostRequest = (VisualizationUserIDFilmFilmIDSubtitlesPostRequest) o;
    return Objects.equals(this.languageCode, visualizationUserIDFilmFilmIDSubtitlesPostRequest.languageCode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(languageCode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VisualizationUserIDFilmFilmIDSubtitlesPostRequest {\n");
    sb.append("    languageCode: ").append(toIndentedString(languageCode)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

