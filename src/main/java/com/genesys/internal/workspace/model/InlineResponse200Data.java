/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.workspace.model;

import java.util.Objects;
import com.genesys.internal.workspace.model.Call;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * InlineResponse200Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-14T18:24:42.681Z")
public class InlineResponse200Data {
  @SerializedName("calls")
  private List<Call> calls = new ArrayList<Call>();

  public InlineResponse200Data calls(List<Call> calls) {
    this.calls = calls;
    return this;
  }

  public InlineResponse200Data addCallsItem(Call callsItem) {
    this.calls.add(callsItem);
    return this;
  }

   /**
   * The list of all the calls.
   * @return calls
  **/
  @ApiModelProperty(required = true, value = "The list of all the calls.")
  public List<Call> getCalls() {
    return calls;
  }

  public void setCalls(List<Call> calls) {
    this.calls = calls;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse200Data inlineResponse200Data = (InlineResponse200Data) o;
    return Objects.equals(this.calls, inlineResponse200Data.calls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(calls);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse200Data {\n");
    
    sb.append("    calls: ").append(toIndentedString(calls)).append("\n");
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

