/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 9.0.000.78.3880
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package com.genesys.internal.workspace.model;

import java.util.Objects;
import java.util.Arrays;
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
 * VoicecallsidsinglesteptransferData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-07-23T11:10:30.669Z")
public class VoicecallsidsinglesteptransferData {
  @SerializedName("destination")
  private String destination = null;

  @SerializedName("location")
  private String location = null;

  @SerializedName("userData")
  private List<Kvpair> userData = null;

  @SerializedName("reasons")
  private List<Kvpair> reasons = null;

  @SerializedName("extensions")
  private List<Kvpair> extensions = null;

  public VoicecallsidsinglesteptransferData destination(String destination) {
    this.destination = destination;
    return this;
  }

   /**
   * The number where the call should be transferred.
   * @return destination
  **/
  @ApiModelProperty(required = true, value = "The number where the call should be transferred.")
  public String getDestination() {
    return destination;
  }

  public void setDestination(String destination) {
    this.destination = destination;
  }

  public VoicecallsidsinglesteptransferData location(String location) {
    this.location = location;
    return this;
  }

   /**
   * Name of the remote location in the form of &lt;SwitchName&gt; or &lt;T-ServerApplicationName&gt;@&lt;SwitchName&gt;. This value is used by Workspace to set the location attribute for the corresponding T-Server requests. When there is no need to specify a T-Server for location, this parameter must have the value NULL, not an empty string.
   * @return location
  **/
  @ApiModelProperty(value = "Name of the remote location in the form of <SwitchName> or <T-ServerApplicationName>@<SwitchName>. This value is used by Workspace to set the location attribute for the corresponding T-Server requests. When there is no need to specify a T-Server for location, this parameter must have the value NULL, not an empty string.")
  public String getLocation() {
    return location;
  }

  public void setLocation(String location) {
    this.location = location;
  }

  public VoicecallsidsinglesteptransferData userData(List<Kvpair> userData) {
    this.userData = userData;
    return this;
  }

  public VoicecallsidsinglesteptransferData addUserDataItem(Kvpair userDataItem) {
    if (this.userData == null) {
      this.userData = new ArrayList<Kvpair>();
    }
    this.userData.add(userDataItem);
    return this;
  }

   /**
   * Key/value data to include with the call.
   * @return userData
  **/
  @ApiModelProperty(value = "Key/value data to include with the call.")
  public List<Kvpair> getUserData() {
    return userData;
  }

  public void setUserData(List<Kvpair> userData) {
    this.userData = userData;
  }

  public VoicecallsidsinglesteptransferData reasons(List<Kvpair> reasons) {
    this.reasons = reasons;
    return this;
  }

  public VoicecallsidsinglesteptransferData addReasonsItem(Kvpair reasonsItem) {
    if (this.reasons == null) {
      this.reasons = new ArrayList<Kvpair>();
    }
    this.reasons.add(reasonsItem);
    return this;
  }

   /**
   * Information on causes for, and results of, actions taken by the user of the current DN. For details about reasons, refer to the [*Genesys Events and Models Reference Manual*](https://docs.genesys.com/Documentation/System/Current/GenEM/Reasons).
   * @return reasons
  **/
  @ApiModelProperty(value = "Information on causes for, and results of, actions taken by the user of the current DN. For details about reasons, refer to the [*Genesys Events and Models Reference Manual*](https://docs.genesys.com/Documentation/System/Current/GenEM/Reasons).")
  public List<Kvpair> getReasons() {
    return reasons;
  }

  public void setReasons(List<Kvpair> reasons) {
    this.reasons = reasons;
  }

  public VoicecallsidsinglesteptransferData extensions(List<Kvpair> extensions) {
    this.extensions = extensions;
    return this;
  }

  public VoicecallsidsinglesteptransferData addExtensionsItem(Kvpair extensionsItem) {
    if (this.extensions == null) {
      this.extensions = new ArrayList<Kvpair>();
    }
    this.extensions.add(extensionsItem);
    return this;
  }

   /**
   * Media device/hardware reason codes and similar information. For details about extensions, refer to the [*Genesys Events and Models Reference Manual*](https://docs.genesys.com/Documentation/System/Current/GenEM/Extensions).
   * @return extensions
  **/
  @ApiModelProperty(value = "Media device/hardware reason codes and similar information. For details about extensions, refer to the [*Genesys Events and Models Reference Manual*](https://docs.genesys.com/Documentation/System/Current/GenEM/Extensions).")
  public List<Kvpair> getExtensions() {
    return extensions;
  }

  public void setExtensions(List<Kvpair> extensions) {
    this.extensions = extensions;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    VoicecallsidsinglesteptransferData voicecallsidsinglesteptransferData = (VoicecallsidsinglesteptransferData) o;
    return Objects.equals(this.destination, voicecallsidsinglesteptransferData.destination) &&
        Objects.equals(this.location, voicecallsidsinglesteptransferData.location) &&
        Objects.equals(this.userData, voicecallsidsinglesteptransferData.userData) &&
        Objects.equals(this.reasons, voicecallsidsinglesteptransferData.reasons) &&
        Objects.equals(this.extensions, voicecallsidsinglesteptransferData.extensions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(destination, location, userData, reasons, extensions);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class VoicecallsidsinglesteptransferData {\n");
    
    sb.append("    destination: ").append(toIndentedString(destination)).append("\n");
    sb.append("    location: ").append(toIndentedString(location)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
    sb.append("    reasons: ").append(toIndentedString(reasons)).append("\n");
    sb.append("    extensions: ").append(toIndentedString(extensions)).append("\n");
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

