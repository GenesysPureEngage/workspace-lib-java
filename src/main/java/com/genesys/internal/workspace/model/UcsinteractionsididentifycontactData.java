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
 * UcsinteractionsididentifycontactData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-16T05:06:46.797Z")
public class UcsinteractionsididentifycontactData {
  @SerializedName("createContactEnabled")
  private Boolean createContactEnabled = null;

  public UcsinteractionsididentifycontactData createContactEnabled(Boolean createContactEnabled) {
    this.createContactEnabled = createContactEnabled;
    return this;
  }

   /**
   * Indicates if a contact should be created if no matching contact found
   * @return createContactEnabled
  **/
  @ApiModelProperty(value = "Indicates if a contact should be created if no matching contact found")
  public Boolean CreateContactEnabled() {
    return createContactEnabled;
  }

  public void setCreateContactEnabled(Boolean createContactEnabled) {
    this.createContactEnabled = createContactEnabled;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcsinteractionsididentifycontactData ucsinteractionsididentifycontactData = (UcsinteractionsididentifycontactData) o;
    return Objects.equals(this.createContactEnabled, ucsinteractionsididentifycontactData.createContactEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createContactEnabled);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcsinteractionsididentifycontactData {\n");
    
    sb.append("    createContactEnabled: ").append(toIndentedString(createContactEnabled)).append("\n");
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

