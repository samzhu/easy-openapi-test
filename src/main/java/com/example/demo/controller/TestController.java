package com.example.demo.controller;

import java.security.Key;
import java.util.Collections;
import java.util.List;
import java.util.UUID;

import javax.servlet.http.HttpServletRequest;

import com.example.demo.api.DefaultApi;
import com.example.demo.api.model.Book;
import com.example.demo.api.model.TokenData;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import io.jsonwebtoken.security.Keys;

@RestController
public class TestController implements DefaultApi {

    private static final Key key = Keys.secretKeyFor(SignatureAlgorithm.HS256);

    @Autowired
    private HttpServletRequest request;

    @Override
    public ResponseEntity<Book> booksPost(Book book) {
        String authorization = request.getHeader("authorization");
        if(authorization == null || authorization.length()==0){
            throw new RuntimeException("未授權");
        }
        String[] authAry = authorization.split(" ");
        if (authAry.length != 2) {
            throw new RuntimeException("未授權");
        } else if (!authAry[0].toLowerCase().equals("bearer")) {
            throw new RuntimeException("未授權");
        }
        return new ResponseEntity(book, HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<List<Book>> getBooks() {
        Book book = new Book();
        book.setId("9789864345137");
        book.setName("大話AWS雲端架構");
        book.setPrice(435.00);
        return new ResponseEntity(Collections.singletonList(book), HttpStatus.OK);
    }

    @Override
    public ResponseEntity<TokenData> oauthTokenPost(String username, String password, String grantType, String scope) {
        String authorization = request.getHeader("authorization");
        if(authorization == null || authorization.length()==0){
            throw new RuntimeException("未授權");
        }
        String[] authAry = authorization.split(" ");
        if (authAry.length != 2) {
            throw new RuntimeException("未授權");
        } else if (!authAry[0].toLowerCase().equals("basic")) {
            throw new RuntimeException("未授權");
        }

        String jws = Jwts.builder().setSubject(username).signWith(key).compact();
        TokenData tokenData = new TokenData();
        tokenData.setAccessToken(jws);
        tokenData.setRefreshToken(jws);
        tokenData.setTokenType("bearer");
        tokenData.setScope(scope);
        tokenData.setJti(UUID.randomUUID().toString());
        return new ResponseEntity(tokenData, HttpStatus.OK);
    }
}
