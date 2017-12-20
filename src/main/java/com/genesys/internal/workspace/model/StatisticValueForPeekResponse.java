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
 * StatisticValueForPeekResponse
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-20T14:35:23.440Z")
public class StatisticValueForPeekResponse {
  @SerializedName("objectId")
  private String objectId = null;

  @SerializedName("objectType")
  private String objectType = null;

  @SerializedName("name")
  private String name = null;

  public StatisticValueForPeekResponse objectId(String objectId) {
    this.objectId = objectId;
    return this;
  }

   /**
   * ID of the object to get the statistic for
   * @return objectId
  **/
  @ApiModelProperty(required = true, value = "ID of the object to get the statistic for")
  public String getObjectId() {
    return objectId;
  }

  public void setObjectId(String objectId) {
    this.objectId = objectId;
  }

  public StatisticValueForPeekResponse objectType(String objectType) {
    this.objectType = objectType;
    return this;
  }

   /**
   * Type of the obejct to get the statistic for
   * @return objectType
  **/
  @ApiModelProperty(required = true, value = "Type of the obejct to get the statistic for")
  public String getObjectType() {
    return objectType;
  }

  public void setObjectType(String objectType) {
    this.objectType = objectType;
  }

  public StatisticValueForPeekResponse name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of the statistic
   * @return name
  **/
  @ApiModelProperty(required = true, value = "Name of the statistic")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    StatisticValueForPeekResponse statisticValueForPeekResponse = (StatisticValueForPeekResponse) o;
    return Objects.equals(this.objectId, statisticValueForPeekResponse.objectId) &&
        Objects.equals(this.objectType, statisticValueForPeekResponse.objectType) &&
        Objects.equals(this.name, statisticValueForPeekResponse.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(objectId, objectType, name);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class StatisticValueForPeekResponse {\n");
    
    sb.append("    objectId: ").append(toIndentedString(objectId)).append("\n");
    sb.append("    objectType: ").append(toIndentedString(objectType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

