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
import com.genesys.internal.workspace.model.Kvpair;
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
 * MediamediatypeinteractionsidtransferagentData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-03-04T22:04:42.821Z")
public class MediamediatypeinteractionsidtransferagentData {
  @SerializedName("agentId")
  private String agentId = null;

  @SerializedName("extension")
  private List<Kvpair> extension = null;

  public MediamediatypeinteractionsidtransferagentData agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * EmployeeId of the target agent.
   * @return agentId
  **/
  @ApiModelProperty(required = true, value = "EmployeeId of the target agent.")
  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public MediamediatypeinteractionsidtransferagentData extension(List<Kvpair> extension) {
    this.extension = extension;
    return this;
  }

  public MediamediatypeinteractionsidtransferagentData addExtensionItem(Kvpair extensionItem) {
    if (this.extension == null) {
      this.extension = new ArrayList<Kvpair>();
    }
    this.extension.add(extensionItem);
    return this;
  }

   /**
   * A key/value pairs list of additional data.
   * @return extension
  **/
  @ApiModelProperty(value = "A key/value pairs list of additional data.")
  public List<Kvpair> getExtension() {
    return extension;
  }

  public void setExtension(List<Kvpair> extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediamediatypeinteractionsidtransferagentData mediamediatypeinteractionsidtransferagentData = (MediamediatypeinteractionsidtransferagentData) o;
    return Objects.equals(this.agentId, mediamediatypeinteractionsidtransferagentData.agentId) &&
        Objects.equals(this.extension, mediamediatypeinteractionsidtransferagentData.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, extension);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediamediatypeinteractionsidtransferagentData {\n");
    
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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

