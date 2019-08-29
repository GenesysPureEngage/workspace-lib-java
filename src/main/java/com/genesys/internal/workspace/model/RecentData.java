/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 9.0.000.51.3082
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.workspace.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * This includes the media channel where the target was recently used and the timestamp for when the target was used.
 */
@ApiModel(description = "This includes the media channel where the target was recently used and the timestamp for when the target was used.")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-28T11:18:21.256Z")
public class RecentData {
  @SerializedName("media")
  private String media = null;

  @SerializedName("timeStamp")
  private BigDecimal timeStamp = null;

  public RecentData media(String media) {
    this.media = media;
    return this;
  }

   /**
   * The media channel where the target was recently used.
   * @return media
  **/
  @ApiModelProperty(value = "The media channel where the target was recently used.")
  public String getMedia() {
    return media;
  }

  public void setMedia(String media) {
    this.media = media;
  }

  public RecentData timeStamp(BigDecimal timeStamp) {
    this.timeStamp = timeStamp;
    return this;
  }

   /**
   * The date and time when the target was used.
   * @return timeStamp
  **/
  @ApiModelProperty(value = "The date and time when the target was used.")
  public BigDecimal getTimeStamp() {
    return timeStamp;
  }

  public void setTimeStamp(BigDecimal timeStamp) {
    this.timeStamp = timeStamp;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RecentData recentData = (RecentData) o;
    return Objects.equals(this.media, recentData.media) &&
        Objects.equals(this.timeStamp, recentData.timeStamp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(media, timeStamp);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RecentData {\n");
    
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    timeStamp: ").append(toIndentedString(timeStamp)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

