package com.project.onlinequizbackend.services;

import com.project.onlinequizbackend.models.LoginRequest;
import com.project.onlinequizbackend.models.LoginResponse;
import com.project.onlinequizbackend.models.User;

public interface AuthService {
    User registerUserService(User user) throws Exception;

    LoginResponse loginUserService(LoginRequest loginRequest) throws Exception;
}
