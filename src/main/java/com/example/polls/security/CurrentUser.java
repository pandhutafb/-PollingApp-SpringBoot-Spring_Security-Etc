package com.example.polls.security;

//Springsecurity menyediakan anotasi bernama @AuthenticationPrincipal untuk mengakses pengguna yang saat ini terautentikasi di pengontrol.
//
//Anotasi CurrentUser berikut ini adalah pembungkus di sekitar penjelasan @AuthenticationPrincipal.

import org.springframework.security.core.annotation.AuthenticationPrincipal;
import java.lang.annotation.*;

@Target({ElementType.PARAMETER, ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@AuthenticationPrincipal

public @interface CurrentUser {

}
