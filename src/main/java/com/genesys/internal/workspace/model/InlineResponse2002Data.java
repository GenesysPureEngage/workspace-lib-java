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
import com.genesys.internal.workspace.model.StatisticValueForRegisterResponse;
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
 * InlineResponse2002Data
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2017-12-20T14:35:23.440Z")
public class InlineResponse2002Data {
  @SerializedName("subscriptionId")
  private String subscriptionId = null;

  @SerializedName("statistics")
  private List<StatisticValueForRegisterResponse> statistics = new ArrayList<StatisticValueForRegisterResponse>();

  public InlineResponse2002Data subscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
    return this;
  }

   /**
   * The ID used to fetch statistics values from &#x60;/reporting/{subscriptionId}&#x60;.
   * @return subscriptionId
  **/
  @ApiModelProperty(required = true, value = "The ID used to fetch statistics values from `/reporting/{subscriptionId}`.")
  public String getSubscriptionId() {
    return subscriptionId;
  }

  public void setSubscriptionId(String subscriptionId) {
    this.subscriptionId = subscriptionId;
  }

  public InlineResponse2002Data statistics(List<StatisticValueForRegisterResponse> statistics) {
    this.statistics = statistics;
    return this;
  }

  public InlineResponse2002Data addStatisticsItem(StatisticValueForRegisterResponse statisticsItem) {
    this.statistics.add(statisticsItem);
    return this;
  }

   /**
   * The list of all the registered statistics.
   * @return statistics
  **/
  @ApiModelProperty(required = true, value = "The list of all the registered statistics.")
  public List<StatisticValueForRegisterResponse> getStatistics() {
    return statistics;
  }

  public void setStatistics(List<StatisticValueForRegisterResponse> statistics) {
    this.statistics = statistics;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InlineResponse2002Data inlineResponse2002Data = (InlineResponse2002Data) o;
    return Objects.equals(this.subscriptionId, inlineResponse2002Data.subscriptionId) &&
        Objects.equals(this.statistics, inlineResponse2002Data.statistics);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subscriptionId, statistics);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InlineResponse2002Data {\n");
    
    sb.append("    subscriptionId: ").append(toIndentedString(subscriptionId)).append("\n");
    sb.append("    statistics: ").append(toIndentedString(statistics)).append("\n");
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

