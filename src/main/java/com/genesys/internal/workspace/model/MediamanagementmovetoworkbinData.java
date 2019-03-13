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
 * MediamanagementmovetoworkbinData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-13T19:28:23.481Z")
public class MediamanagementmovetoworkbinData {
  @SerializedName("workbinId")
  private String workbinId = null;

  @SerializedName("ownerId")
  private String ownerId = null;

  @SerializedName("interactions")
  private List<String> interactions = new ArrayList<String>();

  public MediamanagementmovetoworkbinData workbinId(String workbinId) {
    this.workbinId = workbinId;
    return this;
  }

   /**
   * The Id of destination workbin.
   * @return workbinId
  **/
  @ApiModelProperty(required = true, value = "The Id of destination workbin.")
  public String getWorkbinId() {
    return workbinId;
  }

  public void setWorkbinId(String workbinId) {
    this.workbinId = workbinId;
  }

  public MediamanagementmovetoworkbinData ownerId(String ownerId) {
    this.ownerId = ownerId;
    return this;
  }

   /**
   * The Id of owner.
   * @return ownerId
  **/
  @ApiModelProperty(required = true, value = "The Id of owner.")
  public String getOwnerId() {
    return ownerId;
  }

  public void setOwnerId(String ownerId) {
    this.ownerId = ownerId;
  }

  public MediamanagementmovetoworkbinData interactions(List<String> interactions) {
    this.interactions = interactions;
    return this;
  }

  public MediamanagementmovetoworkbinData addInteractionsItem(String interactionsItem) {
    this.interactions.add(interactionsItem);
    return this;
  }

   /**
   * List of interactions to move.
   * @return interactions
  **/
  @ApiModelProperty(required = true, value = "List of interactions to move.")
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
    MediamanagementmovetoworkbinData mediamanagementmovetoworkbinData = (MediamanagementmovetoworkbinData) o;
    return Objects.equals(this.workbinId, mediamanagementmovetoworkbinData.workbinId) &&
        Objects.equals(this.ownerId, mediamanagementmovetoworkbinData.ownerId) &&
        Objects.equals(this.interactions, mediamanagementmovetoworkbinData.interactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(workbinId, ownerId, interactions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediamanagementmovetoworkbinData {\n");
    
    sb.append("    workbinId: ").append(toIndentedString(workbinId)).append("\n");
    sb.append("    ownerId: ").append(toIndentedString(ownerId)).append("\n");
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

