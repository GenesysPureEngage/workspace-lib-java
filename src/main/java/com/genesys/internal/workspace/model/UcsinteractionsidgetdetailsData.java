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
 * UcsinteractionsidgetdetailsData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-07T15:16:46.042Z")
public class UcsinteractionsidgetdetailsData {
  @SerializedName("returnedAttributes")
  private List<String> returnedAttributes = null;

  public UcsinteractionsidgetdetailsData returnedAttributes(List<String> returnedAttributes) {
    this.returnedAttributes = returnedAttributes;
    return this;
  }

  public UcsinteractionsidgetdetailsData addReturnedAttributesItem(String returnedAttributesItem) {
    if (this.returnedAttributes == null) {
      this.returnedAttributes = new ArrayList<String>();
    }
    this.returnedAttributes.add(returnedAttributesItem);
    return this;
  }

   /**
   * The list of interaction attributes to be returned
   * @return returnedAttributes
  **/
  @ApiModelProperty(value = "The list of interaction attributes to be returned")
  public List<String> getReturnedAttributes() {
    return returnedAttributes;
  }

  public void setReturnedAttributes(List<String> returnedAttributes) {
    this.returnedAttributes = returnedAttributes;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcsinteractionsidgetdetailsData ucsinteractionsidgetdetailsData = (UcsinteractionsidgetdetailsData) o;
    return Objects.equals(this.returnedAttributes, ucsinteractionsidgetdetailsData.returnedAttributes);
  }

  @Override
  public int hashCode() {
    return Objects.hash(returnedAttributes);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcsinteractionsidgetdetailsData {\n");
    
    sb.append("    returnedAttributes: ").append(toIndentedString(returnedAttributes)).append("\n");
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

