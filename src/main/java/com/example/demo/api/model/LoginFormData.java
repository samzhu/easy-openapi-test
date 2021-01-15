package com.example.demo.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * 登入資料
 */
@ApiModel(description = "登入資料")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-01-05T11:45:23.589198+08:00[Asia/Taipei]")
public class LoginFormData   {
  @JsonProperty("username")
  private String username;

  @JsonProperty("password")
  private String password;

  @JsonProperty("grant_type")
  private String grantType;

  @JsonProperty("scope")
  private String scope;

  public LoginFormData username(String username) {
    this.username = username;
    return this;
  }

  /**
   * 帳號
   * @return username
  */
  @ApiModelProperty(required = true, value = "帳號")
  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public LoginFormData password(String password) {
    this.password = password;
    return this;
  }

  /**
   * 密碼
   * @return password
  */
  @ApiModelProperty(required = true, value = "密碼")
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  public LoginFormData grantType(String grantType) {
    this.grantType = grantType;
    return this;
  }

  /**
   * 授權方式
   * @return grantType
  */
  @ApiModelProperty(required = true, value = "授權方式")
  public String getGrantType() {
    return grantType;
  }

  public void setGrantType(String grantType) {
    this.grantType = grantType;
  }

  public LoginFormData scope(String scope) {
    this.scope = scope;
    return this;
  }

  /**
   * 存取範圍
   * @return scope
  */
  @ApiModelProperty(required = true, value = "存取範圍")
  public String getScope() {
    return scope;
  }

  public void setScope(String scope) {
    this.scope = scope;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoginFormData loginFormData = (LoginFormData) o;
    return Objects.equals(this.username, loginFormData.username) &&
        Objects.equals(this.password, loginFormData.password) &&
        Objects.equals(this.grantType, loginFormData.grantType) &&
        Objects.equals(this.scope, loginFormData.scope);
  }

  @Override
  public int hashCode() {
    return Objects.hash(username, password, grantType, scope);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoginFormData {\n");
    
    sb.append("    username: ").append(toIndentedString(username)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    grantType: ").append(toIndentedString(grantType)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
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

