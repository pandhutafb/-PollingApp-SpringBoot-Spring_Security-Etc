package com.example.polls.security;
//package com.example.polls.security;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.AuthenticationEntryPoint;
import org.springframework.stereotype.Component;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//Kelas terkait keamanan musim semi pertama yang akan kami definisikan adalah JwtAuthenticationEntryPoint.
//Ini mengimplementasikan antarmuka AuthenticationEntryPoint dan menyediakan implementasi untuk metode dimulai (). 
//Metode ini disebut setiap kali pengecualian dilempar karena pengguna yang tidak berkepentingan mencoba mengakses sumber daya yang memerlukan otentikasi.
//
//Dalam hal ini, kami hanya akan merespons dengan kesalahan 401 yang berisi pesan pengecualian.

@Component
public class JwtAuthenticationEntryPoint implements AuthenticationEntryPoint {

	 private static final Logger logger = LoggerFactory.getLogger(JwtAuthenticationEntryPoint.class);
	
	@Override
	public void commence(HttpServletRequest httpServletRequest,
            HttpServletResponse httpServletResponse,
            AuthenticationException e) throws IOException, ServletException {
		// TODO Auto-generated method stub
		logger.error("Responding with unauthorized error. Message - {}", e.getMessage());
        httpServletResponse.sendError(HttpServletResponse.SC_UNAUTHORIZED, e.getMessage());
        
		
	}
	

}
