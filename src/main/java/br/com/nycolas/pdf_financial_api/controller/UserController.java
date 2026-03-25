package br.com.nycolas.pdf_financial_api.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.nycolas.pdf_financial_api.database.entity.UserEntity;
import br.com.nycolas.pdf_financial_api.service.UserService;
import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/home/user")
@RequiredArgsConstructor//lombok cria os construtores com os finals da nossa classe
public class UserController {

    private final UserService userService;

   @PostMapping("/email")
   @ResponseStatus(HttpStatus.OK)
   public ResponseEntity<UserEntity>registerEmail(@RequestBody UserEntity newEmail ){
        return new ResponseEntity<>(HttpStatus.CREATED);
   }
   
    

}