/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (4.3.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.example.demo.api;

import java.util.List;

import com.example.demo.api.model.Book;
import com.example.demo.api.model.ErrorMsg;
import com.example.demo.api.model.TokenData;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import io.swagger.annotations.Authorization;
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2021-01-04T12:47:21.721279+08:00[Asia/Taipei]")

@Api(value = "Default", description = "the Default API")
public interface DefaultApi {

    /**
     * POST /books : 新增書本
     *
     * @param book 書本資料 (optional)
     * @return 書本資料 (status code 201)
     *         or 錯誤訊息 (status code 500)
     */
    @ApiOperation(value = "新增書本", nickname = "booksPost", notes = "", response = Book.class, authorizations = {
        @Authorization(value = "BearerToken")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "書本資料", response = Book.class),
        @ApiResponse(code = 500, message = "錯誤訊息", response = ErrorMsg.class) })
    @RequestMapping(value = "/books",
        produces = "application/json", 
        consumes = "application/json",
        method = RequestMethod.POST)
    // 需要手動新增的部分
    @ResponseStatus(HttpStatus.CREATED)
    ResponseEntity<Book> booksPost(@ApiParam(value = "書本資料"  )   @RequestBody(required = false) Book book);


    /**
     * GET /books : 取得書本
     *
     * @return 取得所有書本 (status code 200)
     *         or 錯誤訊息 (status code 500)
     */
    @ApiOperation(value = "取得書本", nickname = "getBooks", notes = "", response = Book.class, responseContainer = "List", authorizations = {
        @Authorization(value = "BearerToken")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "取得所有書本", response = Book.class, responseContainer = "List"),
        @ApiResponse(code = 500, message = "錯誤訊息", response = ErrorMsg.class) })
    @RequestMapping(value = "/books",
        produces = "application/json", 
        method = RequestMethod.GET)
    ResponseEntity<List<Book>> getBooks();


    /**
     * POST /oauth/token : 登入取得 Token
     *
     * @param username 帳號 (required)
     * @param password 密碼 (required)
     * @param grantType 授權方式 (required)
     * @param scope 存取範圍 (required)
     * @return 授權結果 (status code 200)
     */
    @ApiOperation(value = "登入取得 Token", nickname = "oauthTokenPost", notes = "", response = TokenData.class, authorizations = {
        @Authorization(value = "BasicAuth")
    }, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "授權結果", response = TokenData.class) })
    @RequestMapping(value = "/oauth/token",
        produces = MediaType.APPLICATION_JSON_VALUE, 
        consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,
        method = RequestMethod.POST)
    ResponseEntity<TokenData> oauthTokenPost(@ApiParam(value = "帳號", required=true ) @RequestParam(value="username", required=true)  String username,@ApiParam(value = "密碼", required=true ) @RequestParam(value="password", required=true)  String password,@ApiParam(value = "授權方式", required=true ) @RequestParam(value="grant_type", required=true)  String grantType,@ApiParam(value = "存取範圍", required=true ) @RequestParam(value="scope", required=true)  String scope);
    

    // 自己改
    // produces = MediaType.APPLICATION_JSON_VALUE, 
    // consumes = MediaType.APPLICATION_FORM_URLENCODED_VALUE,

    // @ApiImplicitParams({
    //     @ApiImplicitParam(name = "page", dataType = "integer", paramType = "query",
    //             value = "Results page you want to retrieve (0..N)"),
    //     @ApiImplicitParam(name = "size", dataType = "integer", paramType = "query",
    //             value = "Number of records per page."),
    //     @ApiImplicitParam(name = "sort", allowMultiple = true, dataType = "string", paramType = "query",
    //             value = "Sorting criteria in the format: property(,asc|desc). " +
    //                     "Default sort order is ascending. " +
    //                     "Multiple sort criteria are supported.")
    // })
}
