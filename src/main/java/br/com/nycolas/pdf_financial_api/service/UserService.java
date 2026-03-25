package br.com.nycolas.pdf_financial_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import br.com.nycolas.pdf_financial_api.database.entity.UserEntity;
import br.com.nycolas.pdf_financial_api.database.repository.UserRepository;
import br.com.nycolas.pdf_financial_api.dto.UserDto;


@Service//anota como um bean gerenciado pelo spring, necessario ser um bean pra toda classe
        //que voce for fazer injeção de dependecia
public class UserService {

    
    private static final UserRepository userRepository;
    private static final List <UserEntity> user;


    public UserEntity createUser(UserDto userDto){

        UserEntity user = new UserEntity();

        user.setUsername(userDto.username());
        user.setEmail(userDto.email());
        user.setPhoneNumber(userDto.phoneNumber());

        return userRepository.save(user);
    }
   

}
