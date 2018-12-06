/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 9.0.000.29.2447
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.workspace.model;

import java.util.Objects;
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
 * VoicecallsidsetfocustimeData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-11-28T17:51:38.932Z")
public class VoicecallsidsetfocustimeData {
  @SerializedName("time")
  private BigDecimal time = null;

  public VoicecallsidsetfocustimeData time(BigDecimal time) {
    this.time = time;
    return this;
  }

   /**
   * Indicate the time in focus of call (in seconds).
   * @return time
  **/
  @ApiModelProperty(value = "Indicate the time in focus of call (in seconds).")
  public BigDecimal getTime() {
    return time;
  }

  public void setTime(BigDecimal time) {
    this.time = time;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicecallsidsetfocustimeData voicecallsidsetfocustimeData = (VoicecallsidsetfocustimeData) o;
    return Objects.equals(this.time, voicecallsidsetfocustimeData.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(time);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicecallsidsetfocustimeData {\n");
    
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

