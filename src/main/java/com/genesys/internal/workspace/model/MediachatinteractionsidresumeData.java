/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: v9.0.000.20.2204
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
 * MediachatinteractionsidresumeData
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-14T17:45:32.814Z")
public class MediachatinteractionsidresumeData {
  @SerializedName("nickname")
  private String nickname = null;

  public MediachatinteractionsidresumeData nickname(String nickname) {
    this.nickname = nickname;
    return this;
  }

   /**
   * The nickname.
   * @return nickname
  **/
  @ApiModelProperty(required = true, value = "The nickname.")
  public String getNickname() {
    return nickname;
  }

  public void setNickname(String nickname) {
    this.nickname = nickname;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediachatinteractionsidresumeData mediachatinteractionsidresumeData = (MediachatinteractionsidresumeData) o;
    return Objects.equals(this.nickname, mediachatinteractionsidresumeData.nickname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(nickname);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediachatinteractionsidresumeData {\n");
    
    sb.append("    nickname: ").append(toIndentedString(nickname)).append("\n");
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

