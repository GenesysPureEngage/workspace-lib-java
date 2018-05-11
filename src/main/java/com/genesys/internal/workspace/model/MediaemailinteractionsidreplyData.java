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
 * MediaemailinteractionsidreplyData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-05-11T13:54:16.738Z")
public class MediaemailinteractionsidreplyData {
  @SerializedName("queue")
  private String queue = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("to")
  private String to = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("bodyAsPlainText")
  private String bodyAsPlainText = null;

  @SerializedName("mime")
  private String mime = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("userData")
  private List<Kvpair> userData = null;

  public MediaemailinteractionsidreplyData queue(String queue) {
    this.queue = queue;
    return this;
  }

   /**
   * the name of the queue to submit the reply email
   * @return queue
  **/
  @ApiModelProperty(required = true, value = "the name of the queue to submit the reply email")
  public String getQueue() {
    return queue;
  }

  public void setQueue(String queue) {
    this.queue = queue;
  }

  public MediaemailinteractionsidreplyData from(String from) {
    this.from = from;
    return this;
  }

   /**
   * the address mail of from.
   * @return from
  **/
  @ApiModelProperty(required = true, value = "the address mail of from.")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public MediaemailinteractionsidreplyData to(String to) {
    this.to = to;
    return this;
  }

   /**
   * The address mail of to address. If the field is not defined. The to is reply addresse speficied in inboud or from address if reply is not defined.
   * @return to
  **/
  @ApiModelProperty(value = "The address mail of to address. If the field is not defined. The to is reply addresse speficied in inboud or from address if reply is not defined.")
  public String getTo() {
    return to;
  }

  public void setTo(String to) {
    this.to = to;
  }

  public MediaemailinteractionsidreplyData body(String body) {
    this.body = body;
    return this;
  }

   /**
   * The message to send. Html body
   * @return body
  **/
  @ApiModelProperty(value = "The message to send. Html body")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public MediaemailinteractionsidreplyData bodyAsPlainText(String bodyAsPlainText) {
    this.bodyAsPlainText = bodyAsPlainText;
    return this;
  }

   /**
   * The message to send. Plain text body
   * @return bodyAsPlainText
  **/
  @ApiModelProperty(value = "The message to send. Plain text body")
  public String getBodyAsPlainText() {
    return bodyAsPlainText;
  }

  public void setBodyAsPlainText(String bodyAsPlainText) {
    this.bodyAsPlainText = bodyAsPlainText;
  }

  public MediaemailinteractionsidreplyData mime(String mime) {
    this.mime = mime;
    return this;
  }

   /**
   * Multipurpose internet mail extensions of email
   * @return mime
  **/
  @ApiModelProperty(value = "Multipurpose internet mail extensions of email")
  public String getMime() {
    return mime;
  }

  public void setMime(String mime) {
    this.mime = mime;
  }

  public MediaemailinteractionsidreplyData subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * The subject value
   * @return subject
  **/
  @ApiModelProperty(value = "The subject value")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public MediaemailinteractionsidreplyData userData(List<Kvpair> userData) {
    this.userData = userData;
    return this;
  }

  public MediaemailinteractionsidreplyData addUserDataItem(Kvpair userDataItem) {
    if (this.userData == null) {
      this.userData = new ArrayList<Kvpair>();
    }
    this.userData.add(userDataItem);
    return this;
  }

   /**
   * A key/value pairs list of user data.
   * @return userData
  **/
  @ApiModelProperty(value = "A key/value pairs list of user data.")
  public List<Kvpair> getUserData() {
    return userData;
  }

  public void setUserData(List<Kvpair> userData) {
    this.userData = userData;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaemailinteractionsidreplyData mediaemailinteractionsidreplyData = (MediaemailinteractionsidreplyData) o;
    return Objects.equals(this.queue, mediaemailinteractionsidreplyData.queue) &&
        Objects.equals(this.from, mediaemailinteractionsidreplyData.from) &&
        Objects.equals(this.to, mediaemailinteractionsidreplyData.to) &&
        Objects.equals(this.body, mediaemailinteractionsidreplyData.body) &&
        Objects.equals(this.bodyAsPlainText, mediaemailinteractionsidreplyData.bodyAsPlainText) &&
        Objects.equals(this.mime, mediaemailinteractionsidreplyData.mime) &&
        Objects.equals(this.subject, mediaemailinteractionsidreplyData.subject) &&
        Objects.equals(this.userData, mediaemailinteractionsidreplyData.userData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, from, to, body, bodyAsPlainText, mime, subject, userData);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaemailinteractionsidreplyData {\n");
    
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    bodyAsPlainText: ").append(toIndentedString(bodyAsPlainText)).append("\n");
    sb.append("    mime: ").append(toIndentedString(mime)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
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

