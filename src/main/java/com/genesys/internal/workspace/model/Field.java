/*
 * Workspace API
 * Agent API
 *
 * OpenAPI spec version: 9.0.000.72.3561
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
import java.math.BigDecimal;

/**
 * Field
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2020-03-13T13:18:25.403Z")
public class Field {
  @SerializedName("name")
  private String name = null;

  /**
   * type of field
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    NO_TYPE("no-type"),
    
    INT("int"),
    
    FLOAT("float"),
    
    CHAR("char"),
    
    VAR_CHAR("var-char"),
    
    DATE_TIME("date-time");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }

    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }

    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        String value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }

  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("sendAttribute")
  private String sendAttribute = null;

  @SerializedName("isCustomField")
  private Boolean isCustomField = null;

  @SerializedName("isNullable")
  private Boolean isNullable = null;

  @SerializedName("length")
  private BigDecimal length = null;

  public Field name(String name) {
    this.name = name;
    return this;
  }

   /**
   * name of field
   * @return name
  **/
  @ApiModelProperty(value = "name of field")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Field type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * type of field
   * @return type
  **/
  @ApiModelProperty(value = "type of field")
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public Field sendAttribute(String sendAttribute) {
    this.sendAttribute = sendAttribute;
    return this;
  }

   /**
   * name of the key
   * @return sendAttribute
  **/
  @ApiModelProperty(value = "name of the key")
  public String getSendAttribute() {
    return sendAttribute;
  }

  public void setSendAttribute(String sendAttribute) {
    this.sendAttribute = sendAttribute;
  }

  public Field isCustomField(Boolean isCustomField) {
    this.isCustomField = isCustomField;
    return this;
  }

   /**
   * Get isCustomField
   * @return isCustomField
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsCustomField() {
    return isCustomField;
  }

  public void setIsCustomField(Boolean isCustomField) {
    this.isCustomField = isCustomField;
  }

  public Field isNullable(Boolean isNullable) {
    this.isNullable = isNullable;
    return this;
  }

   /**
   * Get isNullable
   * @return isNullable
  **/
  @ApiModelProperty(value = "")
  public Boolean isIsNullable() {
    return isNullable;
  }

  public void setIsNullable(Boolean isNullable) {
    this.isNullable = isNullable;
  }

  public Field length(BigDecimal length) {
    this.length = length;
    return this;
  }

   /**
   * Get length
   * @return length
  **/
  @ApiModelProperty(value = "")
  public BigDecimal getLength() {
    return length;
  }

  public void setLength(BigDecimal length) {
    this.length = length;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Field field = (Field) o;
    return Objects.equals(this.name, field.name) &&
        Objects.equals(this.type, field.type) &&
        Objects.equals(this.sendAttribute, field.sendAttribute) &&
        Objects.equals(this.isCustomField, field.isCustomField) &&
        Objects.equals(this.isNullable, field.isNullable) &&
        Objects.equals(this.length, field.length);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, type, sendAttribute, isCustomField, isNullable, length);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Field {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sendAttribute: ").append(toIndentedString(sendAttribute)).append("\n");
    sb.append("    isCustomField: ").append(toIndentedString(isCustomField)).append("\n");
    sb.append("    isNullable: ").append(toIndentedString(isNullable)).append("\n");
    sb.append("    length: ").append(toIndentedString(length)).append("\n");
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

