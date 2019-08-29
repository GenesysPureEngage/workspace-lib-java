/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 9.0.000.51.3082
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.workspace.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * MediamediatypestartmonitoringData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-08-28T11:18:21.256Z")
public class MediamediatypestartmonitoringData {
  @SerializedName("agentId")
  private String agentId = null;

  /**
   * The monitoring mode.
   */
  @JsonAdapter(MonitoringModeEnum.Adapter.class)
  public enum MonitoringModeEnum {
    MONITOR("Monitor"),
    
    COACH("Coach"),
    
    BARGEIN("Bargein");

    private String value;

    MonitoringModeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MonitoringModeEnum fromValue(String text) {
      for (MonitoringModeEnum b : MonitoringModeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MonitoringModeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MonitoringModeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MonitoringModeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MonitoringModeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("monitoringMode")
  private MonitoringModeEnum monitoringMode = null;

  /**
   * The monitoring interaction type.
   */
  @JsonAdapter(MonitoringNextInteractionTypeEnum.Adapter.class)
  public enum MonitoringNextInteractionTypeEnum {
    NEXTINTERACTION("NextInteraction"),
    
    ALLINTERACTIONS("AllInteractions");

    private String value;

    MonitoringNextInteractionTypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static MonitoringNextInteractionTypeEnum fromValue(String text) {
      for (MonitoringNextInteractionTypeEnum b : MonitoringNextInteractionTypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<MonitoringNextInteractionTypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final MonitoringNextInteractionTypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public MonitoringNextInteractionTypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return MonitoringNextInteractionTypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("monitoringNextInteractionType")
  private MonitoringNextInteractionTypeEnum monitoringNextInteractionType = null;

  public MediamediatypestartmonitoringData agentId(String agentId) {
    this.agentId = agentId;
    return this;
  }

   /**
   * The unique ID of the agent to monitor.
   * @return agentId
  **/
  @ApiModelProperty(required = true, value = "The unique ID of the agent to monitor.")
  public String getAgentId() {
    return agentId;
  }

  public void setAgentId(String agentId) {
    this.agentId = agentId;
  }

  public MediamediatypestartmonitoringData monitoringMode(MonitoringModeEnum monitoringMode) {
    this.monitoringMode = monitoringMode;
    return this;
  }

   /**
   * The monitoring mode.
   * @return monitoringMode
  **/
  @ApiModelProperty(required = true, value = "The monitoring mode.")
  public MonitoringModeEnum getMonitoringMode() {
    return monitoringMode;
  }

  public void setMonitoringMode(MonitoringModeEnum monitoringMode) {
    this.monitoringMode = monitoringMode;
  }

  public MediamediatypestartmonitoringData monitoringNextInteractionType(MonitoringNextInteractionTypeEnum monitoringNextInteractionType) {
    this.monitoringNextInteractionType = monitoringNextInteractionType;
    return this;
  }

   /**
   * The monitoring interaction type.
   * @return monitoringNextInteractionType
  **/
  @ApiModelProperty(required = true, value = "The monitoring interaction type.")
  public MonitoringNextInteractionTypeEnum getMonitoringNextInteractionType() {
    return monitoringNextInteractionType;
  }

  public void setMonitoringNextInteractionType(MonitoringNextInteractionTypeEnum monitoringNextInteractionType) {
    this.monitoringNextInteractionType = monitoringNextInteractionType;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediamediatypestartmonitoringData mediamediatypestartmonitoringData = (MediamediatypestartmonitoringData) o;
    return Objects.equals(this.agentId, mediamediatypestartmonitoringData.agentId) &&
        Objects.equals(this.monitoringMode, mediamediatypestartmonitoringData.monitoringMode) &&
        Objects.equals(this.monitoringNextInteractionType, mediamediatypestartmonitoringData.monitoringNextInteractionType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(agentId, monitoringMode, monitoringNextInteractionType);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediamediatypestartmonitoringData {\n");
    
    sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
    sb.append("    monitoringMode: ").append(toIndentedString(monitoringMode)).append("\n");
    sb.append("    monitoringNextInteractionType: ").append(toIndentedString(monitoringNextInteractionType)).append("\n");
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

