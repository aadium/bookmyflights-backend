package com.excelr.bookmyflights.model;

import lombok.AllArgsConstructor; 
import lombok.Data; 
import lombok.NoArgsConstructor; 
  
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthResponse { 
    private String username; 
    private String response; 
}