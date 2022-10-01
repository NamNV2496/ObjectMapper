package com.objectmapper.controller;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.objectmapper.domain.HeaderMapper;
import com.objectmapper.domain.TokenMapper;
import com.objectmapper.service.HeaderService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RestController
@RequiredArgsConstructor
public class ExampleController {
    private final HeaderService headerService;

    @GetMapping("/hello")
    public HeaderMapper hello() throws JsonProcessingException {
        return headerService.getHeader();
    }
    @GetMapping("/getToken")
    public TokenMapper getToken() throws JsonProcessingException {
        TokenMapper token = headerService.getToken();

        List<String> roles = token.getData().get(0).getRoles();
        log.info(roles.toString());
        return token;
    }
}
