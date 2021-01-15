package com.example.demo.api.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.openapitools.jackson.nullable.JsonNullable;

/**
 * 書籍資料
 */
@ApiModel(description = "書籍資料")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-01-04T12:47:21.721279+08:00[Asia/Taipei]")
public class Book   {
  @JsonProperty("id")
  private String id;

  @JsonProperty("name")
  private String name;

  @JsonProperty("price")
  private Double price;

  public Book id(String id) {
    this.id = id;
    return this;
  }

  /**
   * 主鍵
   * @return id
  */
  @ApiModelProperty(example = "45678986422", required = true, value = "主鍵")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Book name(String name) {
    this.name = name;
    return this;
  }

  /**
   * 書本名稱
   * @return name
  */
  @ApiModelProperty(example = "圖解演算法", required = true, value = "書本名稱")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Book price(Double price) {
    this.price = price;
    return this;
  }

  /**
   * 價錢
   * @return price
  */
  @ApiModelProperty(example = "0", value = "價錢")
  public Double getPrice() {
    return price;
  }

  public void setPrice(Double price) {
    this.price = price;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Book book = (Book) o;
    return Objects.equals(this.id, book.id) &&
        Objects.equals(this.name, book.name) &&
        Objects.equals(this.price, book.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Book {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

