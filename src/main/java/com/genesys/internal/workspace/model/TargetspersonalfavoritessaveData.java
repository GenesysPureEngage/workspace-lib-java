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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-29T01:59:33.656Z")
public class TargetspersonalfavoritessaveData {
  @SerializedName("target")
  private TargetInformation target = null;

  @SerializedName("category")
  private String category = null;

  @SerializedName("ignoreDuplication")
  private Boolean ignoreDuplication = null;

  public TargetspersonalfavoritessaveData target(TargetInformation target) {
    this.target = target;
    return this;
  }

   /**
   * Get target
   * @return target
  **/
  @ApiModelProperty(required = true, value = "")
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
   * The personal favorites category where the target is saved.
   * @return category
  **/
  @ApiModelProperty(required = true, value = "The personal favorites category where the target is saved.")
  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public TargetspersonalfavoritessaveData ignoreDuplication(Boolean ignoreDuplication) {
    this.ignoreDuplication = ignoreDuplication;
    return this;
  }

   /**
   * Whether a favorite will be save ignoring duplication of phone/emails.
   * @return ignoreDuplication
  **/
  @ApiModelProperty(value = "Whether a favorite will be save ignoring duplication of phone/emails.")
  public Boolean IgnoreDuplication() {
    return ignoreDuplication;
  }

  public void setIgnoreDuplication(Boolean ignoreDuplication) {
    this.ignoreDuplication = ignoreDuplication;
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
        Objects.equals(this.category, targetspersonalfavoritessaveData.category) &&
        Objects.equals(this.ignoreDuplication, targetspersonalfavoritessaveData.ignoreDuplication);
  }

  @Override
  public int hashCode() {
    return Objects.hash(target, category, ignoreDuplication);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TargetspersonalfavoritessaveData {\n");
    
    sb.append("    target: ").append(toIndentedString(target)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    ignoreDuplication: ").append(toIndentedString(ignoreDuplication)).append("\n");
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

