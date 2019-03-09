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

/**
 * MediamediatypestopmonitoringData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-07T20:17:15.462Z")
public class MediamediatypestopmonitoringData {
  @SerializedName("agentId")
  private String agentId = null;

  public MediamediatypestopmonitoringData agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * The unique ID of the agent to stop monitoring.
   * @return agentId
  **/
  @ApiModelProperty(required = true, value = "The unique ID of the agent to stop monitoring.")
  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediamediatypestopmonitoringData mediamediatypestopmonitoringData = (MediamediatypestopmonitoringData) o;
    return Objects.equals(this.agentId, mediamediatypestopmonitoringData.agentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediamediatypestopmonitoringData {\n");
    
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
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

