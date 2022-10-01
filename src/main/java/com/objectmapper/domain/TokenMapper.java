package com.objectmapper.domain;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class TokenMapper {
    String sub;
    String name;
    String admin;
    String iat;

    List<Roles> data;
}
