package com.objectmapper.domain;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HeaderMapper {
    public String accept;
    String connection;
    String host;
    String useragent;
    String testheader;
    String acceptencoding;

}
