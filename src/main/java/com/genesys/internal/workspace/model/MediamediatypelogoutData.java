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
import com.genesys.internal.workspace.model.IxnReasonCode;
import com.genesys.internal.workspace.model.Kvpair;
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
 * MediamediatypelogoutData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2019-03-29T01:59:33.656Z")
public class MediamediatypelogoutData {
  @SerializedName("reason")
  private IxnReasonCode reason = null;

  @SerializedName("extension")
  private List<Kvpair> extension = null;

  public MediamediatypelogoutData reason(IxnReasonCode reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Get reason
   * @return reason
  **/
  @ApiModelProperty(value = "")
  public IxnReasonCode getReason() {
    return reason;
  }

  public void setReason(IxnReasonCode reason) {
    this.reason = reason;
  }

  public MediamediatypelogoutData extension(List<Kvpair> extension) {
    this.extension = extension;
    return this;
  }

  public MediamediatypelogoutData addExtensionItem(Kvpair extensionItem) {
    if (this.extension == null) {
      this.extension = new ArrayList<Kvpair>();
    }
    this.extension.add(extensionItem);
    return this;
  }

   /**
   * A collection of key/value pairs.
   * @return extension
  **/
  @ApiModelProperty(value = "A collection of key/value pairs.")
  public List<Kvpair> getExtension() {
    return extension;
  }

  public void setExtension(List<Kvpair> extension) {
    this.extension = extension;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediamediatypelogoutData mediamediatypelogoutData = (MediamediatypelogoutData) o;
    return Objects.equals(this.reason, mediamediatypelogoutData.reason) &&
        Objects.equals(this.extension, mediamediatypelogoutData.extension);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, extension);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediamediatypelogoutData {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    extension: ").append(toIndentedString(extension)).append("\n");
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

