package com.example.auth.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;


import com.example.auth.dto.UserDto;
import com.example.auth.Model.User;
import com.example.auth.Repository.UserRepository;


@Service
public class UserServiceImpl implements UserService {
   
    @Autowired
    private PasswordEncoder passwordEncoder;
   
    @Autowired
    private UserRepository userRepository;


    @Override
    public User save(UserDto userDto) {
        User user = new User(userDto.getEmail(), passwordEncoder.encode(userDto.getPassword()) , userDto.getRole(), userDto.getFullname());
        return userRepository.save(user);
    }


}