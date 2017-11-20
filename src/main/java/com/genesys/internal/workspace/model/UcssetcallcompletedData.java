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
 * UcssetcallcompletedData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-11-20T17:28:03.761Z")
public class UcssetcallcompletedData {
  @SerializedName("interactionId")
  private String interactionId = null;

  @SerializedName("callDuration")
  private Integer callDuration = null;

  @SerializedName("userData")
  private List<Kvpair> userData = new ArrayList<Kvpair>();

  public UcssetcallcompletedData interactionId(String interactionId) {
    this.interactionId = interactionId;
    return this;
  }

   /**
   * The id of the interaction
   * @return interactionId
  **/
  @ApiModelProperty(required = true, value = "The id of the interaction")
  public String getInteractionId() {
    return interactionId;
  }

  public void setInteractionId(String interactionId) {
    this.interactionId = interactionId;
  }

  public UcssetcallcompletedData callDuration(Integer callDuration) {
    this.callDuration = callDuration;
    return this;
  }

   /**
   * The duration of the call
   * @return callDuration
  **/
  @ApiModelProperty(required = true, value = "The duration of the call")
  public Integer getCallDuration() {
    return callDuration;
  }

  public void setCallDuration(Integer callDuration) {
    this.callDuration = callDuration;
  }

  public UcssetcallcompletedData userData(List<Kvpair> userData) {
    this.userData = userData;
    return this;
  }

  public UcssetcallcompletedData addUserDataItem(Kvpair userDataItem) {
    this.userData.add(userDataItem);
    return this;
  }

   /**
   * A key/value pairs list of the user data of the call.
   * @return userData
  **/
  @ApiModelProperty(required = true, value = "A key/value pairs list of the user data of the call.")
  public List<Kvpair> getUserData() {
    return userData;
  }

  public void setUserData(List<Kvpair> userData) {
    this.userData = userData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcssetcallcompletedData ucssetcallcompletedData = (UcssetcallcompletedData) o;
    return Objects.equals(this.interactionId, ucssetcallcompletedData.interactionId) &&
        Objects.equals(this.callDuration, ucssetcallcompletedData.callDuration) &&
        Objects.equals(this.userData, ucssetcallcompletedData.userData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(interactionId, callDuration, userData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcssetcallcompletedData {\n");
    
    sb.append("    interactionId: ").append(toIndentedString(interactionId)).append("\n");
    sb.append("    callDuration: ").append(toIndentedString(callDuration)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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

