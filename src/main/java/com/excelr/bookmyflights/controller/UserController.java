package com.excelr.bookmyflights.controller;

import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.security.access.prepost.PreAuthorize; 
import org.springframework.security.authentication.AuthenticationManager; 
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken; 
import org.springframework.security.core.Authentication; 
import org.springframework.security.core.userdetails.UsernameNotFoundException; 
import org.springframework.web.bind.annotation.*;

import com.excelr.bookmyflights.model.AuthRequest;
import com.excelr.bookmyflights.model.AuthResponse;
import com.excelr.bookmyflights.model.UserInfo;
import com.excelr.bookmyflights.service.JwtService;
import com.excelr.bookmyflights.service.UserInfoService; 
  
@RestController
@RequestMapping("/auth") 
public class UserController { 
  
    @Autowired
    private UserInfoService service; 
  
    @Autowired
    private JwtService jwtService; 
  
    @Autowired
    private AuthenticationManager authenticationManager;
  
    @GetMapping("/welcome") 
    public String welcome() { 
        return "Welcome this endpoint is not secure"; 
    }
  
    @PostMapping("/register") 
    public UserInfo addNewUser(@RequestBody UserInfo userInfo) { 
        return service.addUser(userInfo); 
    } 
  
    @GetMapping("/user/userProfile") 
    @PreAuthorize("hasAuthority('ROLE_USER')") 
    public String userProfile() { 
        return "Welcome to User Profile"; 
    } 
  
    @GetMapping("/admin/adminProfile") 
    @PreAuthorize("hasAuthority('ROLE_USER')") 
    public String adminProfile() { 
        return "Welcome to Admin Profile"; 
    } 
  
    @PostMapping("/login") 
    public AuthResponse authenticateAndGetToken(@RequestBody AuthRequest authRequest) { 
        Authentication authentication = authenticationManager.authenticate(new UsernamePasswordAuthenticationToken(authRequest.getUsername(), authRequest.getPassword())); 
        AuthResponse authResponse = new AuthResponse();
        authResponse.setUsername(authRequest.getUsername());
        if (authentication.isAuthenticated()) { 
            authResponse.setResponse(jwtService.generateToken(authRequest.getUsername()));
            return authResponse; 
        } else { 
            throw new UsernameNotFoundException("invalid user request !"); 
        } 
    } 
}