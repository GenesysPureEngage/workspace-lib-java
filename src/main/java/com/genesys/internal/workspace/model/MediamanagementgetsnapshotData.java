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
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.math.BigDecimal;

/**
 * MediamanagementgetsnapshotData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-29T01:59:33.656Z")
public class MediamanagementgetsnapshotData {
  @SerializedName("condition")
  private String condition = null;

  @SerializedName("startIndex")
  private BigDecimal startIndex = null;

  @SerializedName("size")
  private BigDecimal size = null;

  @SerializedName("order")
  private String order = null;

  public MediamanagementgetsnapshotData condition(String condition) {
    this.condition = condition;
    return this;
  }

   /**
   * The condition of snapshot
   * @return condition
  **/
  @ApiModelProperty(value = "The condition of snapshot")
  public String getCondition() {
    return condition;
  }

  public void setCondition(String condition) {
    this.condition = condition;
  }

  public MediamanagementgetsnapshotData startIndex(BigDecimal startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * The start index.
   * @return startIndex
  **/
  @ApiModelProperty(value = "The start index.")
  public BigDecimal getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(BigDecimal startIndex) {
    this.startIndex = startIndex;
  }

  public MediamanagementgetsnapshotData size(BigDecimal size) {
    this.size = size;
    return this;
  }

   /**
   * The number of elements
   * @return size
  **/
  @ApiModelProperty(value = "The number of elements")
  public BigDecimal getSize() {
    return size;
  }

  public void setSize(BigDecimal size) {
    this.size = size;
  }

  public MediamanagementgetsnapshotData order(String order) {
    this.order = order;
    return this;
  }

   /**
   * The pivot attribute for ordering the snappshot, following by the sorting order (DESC or ASC)
   * @return order
  **/
  @ApiModelProperty(value = "The pivot attribute for ordering the snappshot, following by the sorting order (DESC or ASC)")
  public String getOrder() {
    return order;
  }

  public void setOrder(String order) {
    this.order = order;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediamanagementgetsnapshotData mediamanagementgetsnapshotData = (MediamanagementgetsnapshotData) o;
    return Objects.equals(this.condition, mediamanagementgetsnapshotData.condition) &&
        Objects.equals(this.startIndex, mediamanagementgetsnapshotData.startIndex) &&
        Objects.equals(this.size, mediamanagementgetsnapshotData.size) &&
        Objects.equals(this.order, mediamanagementgetsnapshotData.order);
  }

  @Override
  public int hashCode() {
    return Objects.hash(condition, startIndex, size, order);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediamanagementgetsnapshotData {\n");
    
    sb.append("    condition: ").append(toIndentedString(condition)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
    sb.append("    order: ").append(toIndentedString(order)).append("\n");
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

