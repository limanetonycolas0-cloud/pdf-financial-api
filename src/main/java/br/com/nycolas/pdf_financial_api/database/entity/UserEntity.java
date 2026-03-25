package br.com.nycolas.pdf_financial_api.database.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name =  "tb_user_info")
@Getter
@Setter //anottations lombok para getters e setters
@AllArgsConstructor
@NoArgsConstructor //anottation do lombok pra criar construtores com e sem argumentos
@ToString
public class UserEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Long userId;
    @Column(name = "username", nullable = false)
    private String username;
    @Column(name = "user_email", nullable = false)
    private String email;
    @Column(name = "user_phone_number", nullable = false)
    private String phoneNumber;
}
