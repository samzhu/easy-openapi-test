package com.example.demo.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * ErrorMsgErrors
 */
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-01-04T12:47:21.721279+08:00[Asia/Taipei]")
public class ErrorMsgErrors   {
  @JsonProperty("defaultMessage")
  private String defaultMessage;

  @JsonProperty("objectName")
  private String objectName;

  @JsonProperty("field")
  private String field;

  @JsonProperty("rejectedValue")
  private Integer rejectedValue;

  @JsonProperty("bindingFailure")
  private Boolean bindingFailure;

  @JsonProperty("code")
  private String code;

  public ErrorMsgErrors defaultMessage(String defaultMessage) {
    this.defaultMessage = defaultMessage;
    return this;
  }

  /**
   * Get defaultMessage
   * @return defaultMessage
  */
  @ApiModelProperty(value = "")
  public String getDefaultMessage() {
    return defaultMessage;
  }

  public void setDefaultMessage(String defaultMessage) {
    this.defaultMessage = defaultMessage;
  }

  public ErrorMsgErrors objectName(String objectName) {
    this.objectName = objectName;
    return this;
  }

  /**
   * Get objectName
   * @return objectName
  */
  @ApiModelProperty(value = "")
  public String getObjectName() {
    return objectName;
  }

  public void setObjectName(String objectName) {
    this.objectName = objectName;
  }

  public ErrorMsgErrors field(String field) {
    this.field = field;
    return this;
  }

  /**
   * Get field
   * @return field
  */
  @ApiModelProperty(value = "")
  public String getField() {
    return field;
  }

  public void setField(String field) {
    this.field = field;
  }

  public ErrorMsgErrors rejectedValue(Integer rejectedValue) {
    this.rejectedValue = rejectedValue;
    return this;
  }

  /**
   * Get rejectedValue
   * @return rejectedValue
  */
  @ApiModelProperty(value = "")
  public Integer getRejectedValue() {
    return rejectedValue;
  }

  public void setRejectedValue(Integer rejectedValue) {
    this.rejectedValue = rejectedValue;
  }

  public ErrorMsgErrors bindingFailure(Boolean bindingFailure) {
    this.bindingFailure = bindingFailure;
    return this;
  }

  /**
   * Get bindingFailure
   * @return bindingFailure
  */
  @ApiModelProperty(value = "")
  public Boolean getBindingFailure() {
    return bindingFailure;
  }

  public void setBindingFailure(Boolean bindingFailure) {
    this.bindingFailure = bindingFailure;
  }

  public ErrorMsgErrors code(String code) {
    this.code = code;
    return this;
  }

  /**
   * Get code
   * @return code
  */
  @ApiModelProperty(value = "")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ErrorMsgErrors errorMsgErrors = (ErrorMsgErrors) o;
    return Objects.equals(this.defaultMessage, errorMsgErrors.defaultMessage) &&
        Objects.equals(this.objectName, errorMsgErrors.objectName) &&
        Objects.equals(this.field, errorMsgErrors.field) &&
        Objects.equals(this.rejectedValue, errorMsgErrors.rejectedValue) &&
        Objects.equals(this.bindingFailure, errorMsgErrors.bindingFailure) &&
        Objects.equals(this.code, errorMsgErrors.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(defaultMessage, objectName, field, rejectedValue, bindingFailure, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ErrorMsgErrors {\n");
    
    sb.append("    defaultMessage: ").append(toIndentedString(defaultMessage)).append("\n");
    sb.append("    objectName: ").append(toIndentedString(objectName)).append("\n");
    sb.append("    field: ").append(toIndentedString(field)).append("\n");
    sb.append("    rejectedValue: ").append(toIndentedString(rejectedValue)).append("\n");
    sb.append("    bindingFailure: ").append(toIndentedString(bindingFailure)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

