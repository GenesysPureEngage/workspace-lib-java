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
import com.genesys.internal.workspace.model.TargetInformation;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * TargetspersonalfavoritessaveData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-14T20:22:20.670Z")
public class TargetspersonalfavoritessaveData {
  @SerializedName("target")
  private TargetInformation target = null;

  @SerializedName("category")
  private String category = null;

  public TargetspersonalfavoritessaveData target(TargetInformation target) {
    this.target = target;
    return this;
  }

   /**
   * The target to save.
   * @return target
  **/
  @ApiModelProperty(required = true, value = "The target to save.")
  public TargetInformation getTarget() {
    return target;
  }

  public void setTarget(TargetInformation target) {
    this.target = target;
  }

  public TargetspersonalfavoritessaveData category(String category) {
    this.category = category;
    return this;
  }

   /**
   * The agent&#39;s personal favorites category.
   * @return category
  **/
  @ApiModelProperty(required = true, value = "The agent's personal favorites category.")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TargetspersonalfavoritessaveData targetspersonalfavoritessaveData = (TargetspersonalfavoritessaveData) o;
    return Objects.equals(this.target, targetspersonalfavoritessaveData.target) &&
        Objects.equals(this.category, targetspersonalfavoritessaveData.category);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, category);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetspersonalfavoritessaveData {\n");
    
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
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

