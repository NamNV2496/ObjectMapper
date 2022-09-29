package com.objectmapper.service;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.objectmapper.domain.HeaderMapper;
import com.objectmapper.domain.TokenMapper;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import java.util.*;

@Service
@RequiredArgsConstructor
public class HeaderService {

    @Autowired
    private HttpServletRequest request;
    private final ObjectMapper objectMapperDisableUnknownProperties;

    Map<String, String> map = new HashMap<String, String>();

    public HeaderMapper getHeader() throws JsonProcessingException {
        Enumeration<String> headerNames = request.getHeaderNames();
        while (headerNames.hasMoreElements()) {
            String key = (String) headerNames.nextElement();
            String value = request.getHeader(key);
            String keyUpdate = key.replace("-", "");
            map.put(keyUpdate, value);
        }
        String json = objectMapperDisableUnknownProperties.writeValueAsString(map);
        return objectMapperDisableUnknownProperties.readValue(json, HeaderMapper.class);
    }

    public TokenMapper getToken() throws JsonProcessingException {
        String token = request.getHeader("authorization");
        token = token.substring(7);
        String[] chunks = token.split("\\.");
        Base64.Decoder decoder = Base64.getUrlDecoder();

        String header = new String(decoder.decode(chunks[0]));
        String payload = new String(decoder.decode(chunks[1]));
        return objectMapperDisableUnknownProperties.readValue(payload, TokenMapper.class);
    }
}
