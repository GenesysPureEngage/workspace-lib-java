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
 * UcscontactssearchData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-29T13:04:52.058Z")
public class UcscontactssearchData {
  @SerializedName("query")
  private String query = null;

  @SerializedName("returnedAttributes")
  private List<String> returnedAttributes = new ArrayList<String>();

  @SerializedName("startIndex")
  private Integer startIndex = null;

  @SerializedName("maxResults")
  private Integer maxResults = null;

  @SerializedName("sortCriteria")
  private List<Object> sortCriteria = null;

  public UcscontactssearchData query(String query) {
    this.query = query;
    return this;
  }

   /**
   * The query to do the lucene search for contacts
   * @return query
  **/
  @ApiModelProperty(required = true, value = "The query to do the lucene search for contacts")
  public String getQuery() {
    return query;
  }

  public void setQuery(String query) {
    this.query = query;
  }

  public UcscontactssearchData returnedAttributes(List<String> returnedAttributes) {
    this.returnedAttributes = returnedAttributes;
    return this;
  }

  public UcscontactssearchData addReturnedAttributesItem(String returnedAttributesItem) {
    this.returnedAttributes.add(returnedAttributesItem);
    return this;
  }

   /**
   * The list of custom contact attributes to be returned for each contact in response
   * @return returnedAttributes
  **/
  @ApiModelProperty(required = true, value = "The list of custom contact attributes to be returned for each contact in response")
  public List<String> getReturnedAttributes() {
    return returnedAttributes;
  }

  public void setReturnedAttributes(List<String> returnedAttributes) {
    this.returnedAttributes = returnedAttributes;
  }

  public UcscontactssearchData startIndex(Integer startIndex) {
    this.startIndex = startIndex;
    return this;
  }

   /**
   * The start index
   * @return startIndex
  **/
  @ApiModelProperty(value = "The start index")
  public Integer getStartIndex() {
    return startIndex;
  }

  public void setStartIndex(Integer startIndex) {
    this.startIndex = startIndex;
  }

  public UcscontactssearchData maxResults(Integer maxResults) {
    this.maxResults = maxResults;
    return this;
  }

   /**
   * The maximum number of contacts to be returned
   * @return maxResults
  **/
  @ApiModelProperty(value = "The maximum number of contacts to be returned")
  public Integer getMaxResults() {
    return maxResults;
  }

  public void setMaxResults(Integer maxResults) {
    this.maxResults = maxResults;
  }

  public UcscontactssearchData sortCriteria(List<Object> sortCriteria) {
    this.sortCriteria = sortCriteria;
    return this;
  }

  public UcscontactssearchData addSortCriteriaItem(Object sortCriteriaItem) {
    if (this.sortCriteria == null) {
      this.sortCriteria = new ArrayList<Object>();
    }
    this.sortCriteria.add(sortCriteriaItem);
    return this;
  }

   /**
   * The list of sorting criterias which contains the \&quot;attributeName\&quot; and \&quot;mode\&quot; (&#39;asc&#39; / &#39;desc&#39;) parameters
   * @return sortCriteria
  **/
  @ApiModelProperty(value = "The list of sorting criterias which contains the \"attributeName\" and \"mode\" ('asc' / 'desc') parameters")
  public List<Object> getSortCriteria() {
    return sortCriteria;
  }

  public void setSortCriteria(List<Object> sortCriteria) {
    this.sortCriteria = sortCriteria;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UcscontactssearchData ucscontactssearchData = (UcscontactssearchData) o;
    return Objects.equals(this.query, ucscontactssearchData.query) &&
        Objects.equals(this.returnedAttributes, ucscontactssearchData.returnedAttributes) &&
        Objects.equals(this.startIndex, ucscontactssearchData.startIndex) &&
        Objects.equals(this.maxResults, ucscontactssearchData.maxResults) &&
        Objects.equals(this.sortCriteria, ucscontactssearchData.sortCriteria);
  }

  @Override
  public int hashCode() {
    return Objects.hash(query, returnedAttributes, startIndex, maxResults, sortCriteria);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UcscontactssearchData {\n");
    
    sb.append("    query: ").append(toIndentedString(query)).append("\n");
    sb.append("    returnedAttributes: ").append(toIndentedString(returnedAttributes)).append("\n");
    sb.append("    startIndex: ").append(toIndentedString(startIndex)).append("\n");
    sb.append("    maxResults: ").append(toIndentedString(maxResults)).append("\n");
    sb.append("    sortCriteria: ").append(toIndentedString(sortCriteria)).append("\n");
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

