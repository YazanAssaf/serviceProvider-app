package com.assaf.serviceproviderapp.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
/*
http request
POST /api/authentication HTTP/1.1
Authorization: Basic base64(email:password)
 */
@RestController @RequestMapping("/api/authentication")
public class AuthenticationController {
}
