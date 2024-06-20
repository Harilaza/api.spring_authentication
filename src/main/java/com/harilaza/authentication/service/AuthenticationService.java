package com.harilaza.authentication.service;

import com.harilaza.authentication.entity.User;
import com.harilaza.authentication.entity.response.AuthenticationResponse;

public interface AuthenticationService {

    AuthenticationResponse register(User request);
    AuthenticationResponse authenticate(User request);
}
