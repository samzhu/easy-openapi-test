package com.example.demo.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * 憑證資料
 */
@ApiModel(description = "憑證資料")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-01-04T12:47:21.721279+08:00[Asia/Taipei]")
public class TokenData   {
  @JsonProperty("access_token")
  private String accessToken;

  @JsonProperty("token_type")
  private String tokenType;

  @JsonProperty("refresh_token")
  private String refreshToken;

  @JsonProperty("expires_in")
  private Integer expiresIn;

  @JsonProperty("scope")
  private String scope;

  @JsonProperty("jti")
  private String jti;

  public TokenData accessToken(String accessToken) {
    this.accessToken = accessToken;
    return this;
  }

  /**
   * 存取資料認證
   * @return accessToken
  */
  @ApiModelProperty(required = true, value = "存取資料認證")
  public String getAccessToken() {
    return accessToken;
  }

  public void setAccessToken(String accessToken) {
    this.accessToken = accessToken;
  }

  public TokenData tokenType(String tokenType) {
    this.tokenType = tokenType;
    return this;
  }

  /**
   * 憑證類型
   * @return tokenType
  */
  @ApiModelProperty(required = true, value = "憑證類型")
  public String getTokenType() {
    return tokenType;
  }

  public void setTokenType(String tokenType) {
    this.tokenType = tokenType;
  }

  public TokenData refreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
    return this;
  }

  /**
   * 更新授權的認證
   * @return refreshToken
  */
  @ApiModelProperty(required = true, value = "更新授權的認證")
  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }

  public TokenData expiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
    return this;
  }

  /**
   * 過期時間
   * @return expiresIn
  */
  @ApiModelProperty(required = true, value = "過期時間")
  public Integer getExpiresIn() {
    return expiresIn;
  }

  public void setExpiresIn(Integer expiresIn) {
    this.expiresIn = expiresIn;
  }

  public TokenData scope(String scope) {
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

  public TokenData jti(String jti) {
    this.jti = jti;
    return this;
  }

  /**
   * 亂數
   * @return jti
  */
  @ApiModelProperty(required = true, value = "亂數")
  public String getJti() {
    return jti;
  }

  public void setJti(String jti) {
    this.jti = jti;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    TokenData tokenData = (TokenData) o;
    return Objects.equals(this.accessToken, tokenData.accessToken) &&
        Objects.equals(this.tokenType, tokenData.tokenType) &&
        Objects.equals(this.refreshToken, tokenData.refreshToken) &&
        Objects.equals(this.expiresIn, tokenData.expiresIn) &&
        Objects.equals(this.scope, tokenData.scope) &&
        Objects.equals(this.jti, tokenData.jti);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accessToken, tokenType, refreshToken, expiresIn, scope, jti);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class TokenData {\n");
    
    sb.append("    accessToken: ").append(toIndentedString(accessToken)).append("\n");
    sb.append("    tokenType: ").append(toIndentedString(tokenType)).append("\n");
    sb.append("    refreshToken: ").append(toIndentedString(refreshToken)).append("\n");
    sb.append("    expiresIn: ").append(toIndentedString(expiresIn)).append("\n");
    sb.append("    scope: ").append(toIndentedString(scope)).append("\n");
    sb.append("    jti: ").append(toIndentedString(jti)).append("\n");
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

