package br.com.nycolas.pdf_financial_api.database.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.nycolas.pdf_financial_api.database.entity.UserEntity;

//repositories: sados pra fazer queries e operacoes na tabela que vai no parametro dessa interface
//ou seja, mexe direto no db(tabelas = entity), mexe direto na tabela.


@Repository//bean
public interface UserRepository extends JpaRepository<UserEntity, Long> {

}
