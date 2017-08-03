/*
 * Workspace API
 * Application API used by Workspace Web Edition
 *
 * OpenAPI spec version: 1.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.workspace.model;

import java.util.Objects;
import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * CurrentSessionDataUserActiveSessionDn
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-08-03T17:12:06.379Z")
public class CurrentSessionDataUserActiveSessionDn {
  @SerializedName("number")
  private String number = null;

  @SerializedName("agentId")
  private String agentId = null;

  @SerializedName("agentState")
  private String agentState = null;

  @SerializedName("agentWorkMode")
  private String agentWorkMode = null;

  public CurrentSessionDataUserActiveSessionDn number(String number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getNumber() {
    return number;
  }

  public void setNumber(String number) {
    this.number = number;
  }

  public CurrentSessionDataUserActiveSessionDn agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * Get agentId
   * @return agentId
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public CurrentSessionDataUserActiveSessionDn agentState(String agentState) {
    this.agentState = agentState;
    return this;
  }

   /**
   * Get agentState
   * @return agentState
  **/
  @ApiModelProperty(example = "null", value = "")
  public String getAgentState() {
    return agentState;
  }

  public void setAgentState(String agentState) {
    this.agentState = agentState;
  }

  public CurrentSessionDataUserActiveSessionDn agentWorkMode(String agentWorkMode) {
    this.agentWorkMode = agentWorkMode;
    return this;
  }

   /**
   * Get agentWorkMode
   * @return agentWorkMode
  **/
  @ApiModelProperty(example = "null", value = "")
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
    CurrentSessionDataUserActiveSessionDn currentSessionDataUserActiveSessionDn = (CurrentSessionDataUserActiveSessionDn) o;
    return Objects.equals(this.number, currentSessionDataUserActiveSessionDn.number) &&
        Objects.equals(this.agentId, currentSessionDataUserActiveSessionDn.agentId) &&
        Objects.equals(this.agentState, currentSessionDataUserActiveSessionDn.agentState) &&
        Objects.equals(this.agentWorkMode, currentSessionDataUserActiveSessionDn.agentWorkMode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(number, agentId, agentState, agentWorkMode);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CurrentSessionDataUserActiveSessionDn {\n");
    
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

