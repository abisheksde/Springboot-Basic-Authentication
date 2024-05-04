package com.example.auth.Service;


import com.example.auth.dto.UserDto;
import com.example.auth.Model.User;


public interface UserService {


    User save (UserDto userDto);
}