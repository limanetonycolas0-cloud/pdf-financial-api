package br.com.nycolas.pdf_financial_api.dto;


import jakarta.validation.constraints.Email;


public record UserDto(

    String username,
    @Email
    String email,
    String phoneNumber
){}