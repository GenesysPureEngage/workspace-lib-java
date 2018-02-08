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
import com.genesys.internal.workspace.model.OpenMediaChannel;
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
 * Media
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-02-08T23:06:06.681Z")
public class Media {
  @SerializedName("channels")
  private List<OpenMediaChannel> channels = null;

  public Media channels(List<OpenMediaChannel> channels) {
    this.channels = channels;
    return this;
  }

  public Media addChannelsItem(OpenMediaChannel channelsItem) {
    if (this.channels == null) {
      this.channels = new ArrayList<OpenMediaChannel>();
    }
    this.channels.add(channelsItem);
    return this;
  }

   /**
   * An array containing any active open media channels.
   * @return channels
  **/
  @ApiModelProperty(value = "An array containing any active open media channels.")
  public List<OpenMediaChannel> getChannels() {
    return channels;
  }

  public void setChannels(List<OpenMediaChannel> channels) {
    this.channels = channels;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Media media = (Media) o;
    return Objects.equals(this.channels, media.channels);
  }

  @Override
  public int hashCode() {
    return Objects.hash(channels);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Media {\n");
    
    sb.append("    channels: ").append(toIndentedString(channels)).append("\n");
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

