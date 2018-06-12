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
 * MediaemailinteractionsidsendData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-06-12T05:57:38.167Z")
public class MediaemailinteractionsidsendData {
  @SerializedName("queue")
  private String queue = null;

  @SerializedName("body")
  private String body = null;

  @SerializedName("bodyAsPlainText")
  private String bodyAsPlainText = null;

  @SerializedName("mime")
  private String mime = null;

  @SerializedName("subject")
  private String subject = null;

  @SerializedName("comment")
  private String comment = null;

  @SerializedName("from")
  private String from = null;

  @SerializedName("to")
  private List<String> to = new ArrayList<String>();

  @SerializedName("cc")
  private List<String> cc = null;

  @SerializedName("bcc")
  private List<String> bcc = null;

  @SerializedName("useReviewer")
  private Boolean useReviewer = null;

  public MediaemailinteractionsidsendData queue(String queue) {
    this.queue = queue;
    return this;
  }

   /**
   * Queue for sending email.
   * @return queue
  **/
  @ApiModelProperty(required = true, value = "Queue for sending email.")
  public String getQueue() {
    return queue;
  }

  public void setQueue(String queue) {
    this.queue = queue;
  }

  public MediaemailinteractionsidsendData body(String body) {
    this.body = body;
    return this;
  }

   /**
   * HTML body of email.
   * @return body
  **/
  @ApiModelProperty(value = "HTML body of email.")
  public String getBody() {
    return body;
  }

  public void setBody(String body) {
    this.body = body;
  }

  public MediaemailinteractionsidsendData bodyAsPlainText(String bodyAsPlainText) {
    this.bodyAsPlainText = bodyAsPlainText;
    return this;
  }

   /**
   * Plain text body of email.
   * @return bodyAsPlainText
  **/
  @ApiModelProperty(value = "Plain text body of email.")
  public String getBodyAsPlainText() {
    return bodyAsPlainText;
  }

  public void setBodyAsPlainText(String bodyAsPlainText) {
    this.bodyAsPlainText = bodyAsPlainText;
  }

  public MediaemailinteractionsidsendData mime(String mime) {
    this.mime = mime;
    return this;
  }

   /**
   * Multipurpose internet mail extensions of email.
   * @return mime
  **/
  @ApiModelProperty(value = "Multipurpose internet mail extensions of email.")
  public String getMime() {
    return mime;
  }

  public void setMime(String mime) {
    this.mime = mime;
  }

  public MediaemailinteractionsidsendData subject(String subject) {
    this.subject = subject;
    return this;
  }

   /**
   * Subject of email.
   * @return subject
  **/
  @ApiModelProperty(value = "Subject of email.")
  public String getSubject() {
    return subject;
  }

  public void setSubject(String subject) {
    this.subject = subject;
  }

  public MediaemailinteractionsidsendData comment(String comment) {
    this.comment = comment;
    return this;
  }

   /**
   * Subject of email.
   * @return comment
  **/
  @ApiModelProperty(value = "Subject of email.")
  public String getComment() {
    return comment;
  }

  public void setComment(String comment) {
    this.comment = comment;
  }

  public MediaemailinteractionsidsendData from(String from) {
    this.from = from;
    return this;
  }

   /**
   * from address.
   * @return from
  **/
  @ApiModelProperty(required = true, value = "from address.")
  public String getFrom() {
    return from;
  }

  public void setFrom(String from) {
    this.from = from;
  }

  public MediaemailinteractionsidsendData to(List<String> to) {
    this.to = to;
    return this;
  }

  public MediaemailinteractionsidsendData addToItem(String toItem) {
    this.to.add(toItem);
    return this;
  }

   /**
   * to addresses
   * @return to
  **/
  @ApiModelProperty(required = true, value = "to addresses")
  public List<String> getTo() {
    return to;
  }

  public void setTo(List<String> to) {
    this.to = to;
  }

  public MediaemailinteractionsidsendData cc(List<String> cc) {
    this.cc = cc;
    return this;
  }

  public MediaemailinteractionsidsendData addCcItem(String ccItem) {
    if (this.cc == null) {
      this.cc = new ArrayList<String>();
    }
    this.cc.add(ccItem);
    return this;
  }

   /**
   * cc addresses
   * @return cc
  **/
  @ApiModelProperty(value = "cc addresses")
  public List<String> getCc() {
    return cc;
  }

  public void setCc(List<String> cc) {
    this.cc = cc;
  }

  public MediaemailinteractionsidsendData bcc(List<String> bcc) {
    this.bcc = bcc;
    return this;
  }

  public MediaemailinteractionsidsendData addBccItem(String bccItem) {
    if (this.bcc == null) {
      this.bcc = new ArrayList<String>();
    }
    this.bcc.add(bccItem);
    return this;
  }

   /**
   * bcc addresses
   * @return bcc
  **/
  @ApiModelProperty(value = "bcc addresses")
  public List<String> getBcc() {
    return bcc;
  }

  public void setBcc(List<String> bcc) {
    this.bcc = bcc;
  }

  public MediaemailinteractionsidsendData useReviewer(Boolean useReviewer) {
    this.useReviewer = useReviewer;
    return this;
  }

   /**
   * Indicate the agent is reviewer.
   * @return useReviewer
  **/
  @ApiModelProperty(value = "Indicate the agent is reviewer.")
  public Boolean UseReviewer() {
    return useReviewer;
  }

  public void setUseReviewer(Boolean useReviewer) {
    this.useReviewer = useReviewer;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaemailinteractionsidsendData mediaemailinteractionsidsendData = (MediaemailinteractionsidsendData) o;
    return Objects.equals(this.queue, mediaemailinteractionsidsendData.queue) &&
        Objects.equals(this.body, mediaemailinteractionsidsendData.body) &&
        Objects.equals(this.bodyAsPlainText, mediaemailinteractionsidsendData.bodyAsPlainText) &&
        Objects.equals(this.mime, mediaemailinteractionsidsendData.mime) &&
        Objects.equals(this.subject, mediaemailinteractionsidsendData.subject) &&
        Objects.equals(this.comment, mediaemailinteractionsidsendData.comment) &&
        Objects.equals(this.from, mediaemailinteractionsidsendData.from) &&
        Objects.equals(this.to, mediaemailinteractionsidsendData.to) &&
        Objects.equals(this.cc, mediaemailinteractionsidsendData.cc) &&
        Objects.equals(this.bcc, mediaemailinteractionsidsendData.bcc) &&
        Objects.equals(this.useReviewer, mediaemailinteractionsidsendData.useReviewer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(queue, body, bodyAsPlainText, mime, subject, comment, from, to, cc, bcc, useReviewer);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaemailinteractionsidsendData {\n");
    
    sb.append("    queue: ").append(toIndentedString(queue)).append("\n");
    sb.append("    body: ").append(toIndentedString(body)).append("\n");
    sb.append("    bodyAsPlainText: ").append(toIndentedString(bodyAsPlainText)).append("\n");
    sb.append("    mime: ").append(toIndentedString(mime)).append("\n");
    sb.append("    subject: ").append(toIndentedString(subject)).append("\n");
    sb.append("    comment: ").append(toIndentedString(comment)).append("\n");
    sb.append("    from: ").append(toIndentedString(from)).append("\n");
    sb.append("    to: ").append(toIndentedString(to)).append("\n");
    sb.append("    cc: ").append(toIndentedString(cc)).append("\n");
    sb.append("    bcc: ").append(toIndentedString(bcc)).append("\n");
    sb.append("    useReviewer: ").append(toIndentedString(useReviewer)).append("\n");
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

