/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 9.0.000.33.2671
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
import java.util.ArrayList;
import java.util.List;

/**
 * MediamanagementcancelData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-07T20:17:15.462Z")
public class MediamanagementcancelData {
  @SerializedName("interactions")
  private List<String> interactions = new ArrayList<String>();

  public MediamanagementcancelData interactions(List<String> interactions) {
    this.interactions = interactions;
    return this;
  }

  public MediamanagementcancelData addInteractionsItem(String interactionsItem) {
    this.interactions.add(interactionsItem);
    return this;
  }

   /**
   * List of interactions to cancel.
   * @return interactions
  **/
  @ApiModelProperty(required = true, value = "List of interactions to cancel.")
  public List<String> getInteractions() {
    return interactions;
  }

  public void setInteractions(List<String> interactions) {
    this.interactions = interactions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediamanagementcancelData mediamanagementcancelData = (MediamanagementcancelData) o;
    return Objects.equals(this.interactions, mediamanagementcancelData.interactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediamanagementcancelData {\n");
    
    sb.append("    interactions: ").append(toIndentedString(interactions)).append("\n");
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

