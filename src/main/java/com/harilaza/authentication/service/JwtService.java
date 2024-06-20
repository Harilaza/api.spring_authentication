package com.harilaza.authentication.service;

import com.harilaza.authentication.entity.User;
import io.jsonwebtoken.Claims;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.function.Function;

public interface JwtService {

    public <T> T extractClaim(String token, Function<Claims, T> resolver);

    public String  extractUsername(String token);

    public boolean isValid(String  token, UserDetails user);

    public String generateToken(User user);

}
