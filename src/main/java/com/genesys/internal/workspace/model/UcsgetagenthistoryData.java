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
import java.util.ArrayList;
import java.util.List;

/**
 * UcsgetagenthistoryData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-01T15:04:46.504Z")
public class UcsgetagenthistoryData {
  @SerializedName("returnedAttributes")
  private List<String> returnedAttributes = null;

  @SerializedName("sort")
  private String sort = null;

  @SerializedName("fromDate")
  private String fromDate = null;

  @SerializedName("toDate")
  private String toDate = null;

  @SerializedName("userId")
  private String userId = null;

  public UcsgetagenthistoryData returnedAttributes(List<String> returnedAttributes) {
    this.returnedAttributes = returnedAttributes;
    return this;
  }

  public UcsgetagenthistoryData addReturnedAttributesItem(String returnedAttributesItem) {
    if (this.returnedAttributes == null) {
      this.returnedAttributes = new ArrayList<String>();
    }
    this.returnedAttributes.add(returnedAttributesItem);
    return this;
  }

   /**
   * The list of custom contact attributes to be returned for each interaction
   * @return returnedAttributes
  **/
  @ApiModelProperty(value = "The list of custom contact attributes to be returned for each interaction")
  public List<String> getReturnedAttributes() {
    return returnedAttributes;
  }

  public void setReturnedAttributes(List<String> returnedAttributes) {
    this.returnedAttributes = returnedAttributes;
  }

  public UcsgetagenthistoryData sort(String sort) {
    this.sort = sort;
    return this;
  }

   /**
   * The sorting order (desc or asc)
   * @return sort
  **/
  @ApiModelProperty(value = "The sorting order (desc or asc)")
  public String getSort() {
    return sort;
  }

  public void setSort(String sort) {
    this.sort = sort;
  }

  public UcsgetagenthistoryData fromDate(String fromDate) {
    this.fromDate = fromDate;
    return this;
  }

   /**
   * The date from which the interactions should be retrieved (UCS format)
   * @return fromDate
  **/
  @ApiModelProperty(value = "The date from which the interactions should be retrieved (UCS format)")
  public String getFromDate() {
    return fromDate;
  }

  public void setFromDate(String fromDate) {
    this.fromDate = fromDate;
  }

  public UcsgetagenthistoryData toDate(String toDate) {
    this.toDate = toDate;
    return this;
  }

   /**
   * The date to which the interactions should be retrieved (UCS format)
   * @return toDate
  **/
  @ApiModelProperty(value = "The date to which the interactions should be retrieved (UCS format)")
  public String getToDate() {
    return toDate;
  }

  public void setToDate(String toDate) {
    this.toDate = toDate;
  }

  public UcsgetagenthistoryData userId(String userId) {
    this.userId = userId;
    return this;
  }

   /**
   * The id of the agent for which the interactions should be retrieved (if not set, current user is used)
   * @return userId
  **/
  @ApiModelProperty(value = "The id of the agent for which the interactions should be retrieved (if not set, current user is used)")
  public String getUserId() {
    return userId;
  }

  public void setUserId(String userId) {
    this.userId = userId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcsgetagenthistoryData ucsgetagenthistoryData = (UcsgetagenthistoryData) o;
    return Objects.equals(this.returnedAttributes, ucsgetagenthistoryData.returnedAttributes) &&
        Objects.equals(this.sort, ucsgetagenthistoryData.sort) &&
        Objects.equals(this.fromDate, ucsgetagenthistoryData.fromDate) &&
        Objects.equals(this.toDate, ucsgetagenthistoryData.toDate) &&
        Objects.equals(this.userId, ucsgetagenthistoryData.userId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnedAttributes, sort, fromDate, toDate, userId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcsgetagenthistoryData {\n");
    
    sb.append("    returnedAttributes: ").append(toIndentedString(returnedAttributes)).append("\n");
    sb.append("    sort: ").append(toIndentedString(sort)).append("\n");
    sb.append("    fromDate: ").append(toIndentedString(fromDate)).append("\n");
    sb.append("    toDate: ").append(toIndentedString(toDate)).append("\n");
    sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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

