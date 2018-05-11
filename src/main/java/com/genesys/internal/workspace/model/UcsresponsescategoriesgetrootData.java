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
 * UcsresponsescategoriesgetrootData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-11T22:04:52.756Z")
public class UcsresponsescategoriesgetrootData {
  @SerializedName("approved")
  private Boolean approved = null;

  public UcsresponsescategoriesgetrootData approved(Boolean approved) {
    this.approved = approved;
    return this;
  }

   /**
   * true to get only approved categories
   * @return approved
  **/
  @ApiModelProperty(value = "true to get only approved categories")
  public Boolean Approved() {
    return approved;
  }

  public void setApproved(Boolean approved) {
    this.approved = approved;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcsresponsescategoriesgetrootData ucsresponsescategoriesgetrootData = (UcsresponsescategoriesgetrootData) o;
    return Objects.equals(this.approved, ucsresponsescategoriesgetrootData.approved);
  }

  @Override
  public int hashCode() {
    return Objects.hash(approved);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcsresponsescategoriesgetrootData {\n");
    
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
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

