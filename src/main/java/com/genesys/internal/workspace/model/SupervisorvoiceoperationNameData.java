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
 * SupervisorvoiceoperationNameData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-19T17:18:10.609Z")
public class SupervisorvoiceoperationNameData {
  @SerializedName("userName")
  private String userName = null;

  @SerializedName("dn")
  private String dn = null;

  public SupervisorvoiceoperationNameData userName(String userName) {
    this.userName = userName;
    return this;
  }

   /**
   * userName of the user to logout
   * @return userName
  **/
  @ApiModelProperty(required = true, value = "userName of the user to logout")
  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }

  public SupervisorvoiceoperationNameData dn(String dn) {
    this.dn = dn;
    return this;
  }

   /**
   * DN of the user to logout
   * @return dn
  **/
  @ApiModelProperty(required = true, value = "DN of the user to logout")
  public String getDn() {
    return dn;
  }

  public void setDn(String dn) {
    this.dn = dn;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SupervisorvoiceoperationNameData supervisorvoiceoperationNameData = (SupervisorvoiceoperationNameData) o;
    return Objects.equals(this.userName, supervisorvoiceoperationNameData.userName) &&
        Objects.equals(this.dn, supervisorvoiceoperationNameData.dn);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userName, dn);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SupervisorvoiceoperationNameData {\n");
    
    sb.append("    userName: ").append(toIndentedString(userName)).append("\n");
    sb.append("    dn: ").append(toIndentedString(dn)).append("\n");
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

