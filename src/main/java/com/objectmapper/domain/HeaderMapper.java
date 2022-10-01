package com.objectmapper.domain;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HeaderMapper {
    public String accept;
    String connection;
    String host;
    @JsonProperty("user-agent")
    String userAgent;
    @JsonProperty("testheader")
    String testHeader;
    @JsonProperty("accept-encoding")
    String acceptEncoding;

}
