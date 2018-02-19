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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Dn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-19T17:18:10.609Z")
public class Dn {
  @SerializedName("number")
  private String number = null;

  @SerializedName("agentId")
  private String agentId = null;

  @SerializedName("agentState")
  private String agentState = null;

  @SerializedName("agentWorkMode")
  private String agentWorkMode = null;

  public Dn number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(value = "")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public Dn agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * Get agentId
   * @return agentId
  **/
  @ApiModelProperty(value = "")
  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public Dn agentState(String agentState) {
    this.agentState = agentState;
    return this;
  }

   /**
   * Get agentState
   * @return agentState
  **/
  @ApiModelProperty(value = "")
  public String getAgentState() {
    return agentState;
  }

  public void setAgentState(String agentState) {
    this.agentState = agentState;
  }

  public Dn agentWorkMode(String agentWorkMode) {
    this.agentWorkMode = agentWorkMode;
    return this;
  }

   /**
   * Get agentWorkMode
   * @return agentWorkMode
  **/
  @ApiModelProperty(value = "")
  public String getAgentWorkMode() {
    return agentWorkMode;
  }

  public void setAgentWorkMode(String agentWorkMode) {
    this.agentWorkMode = agentWorkMode;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Dn dn = (Dn) o;
    return Objects.equals(this.number, dn.number) &&
        Objects.equals(this.agentId, dn.agentId) &&
        Objects.equals(this.agentState, dn.agentState) &&
        Objects.equals(this.agentWorkMode, dn.agentWorkMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, agentId, agentState, agentWorkMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Dn {\n");
    
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    agentState: ").append(toIndentedString(agentState)).append("\n");
    sb.append("    agentWorkMode: ").append(toIndentedString(agentWorkMode)).append("\n");
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

