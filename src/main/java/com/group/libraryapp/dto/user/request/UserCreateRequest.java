package com.group.libraryapp.dto.user.request;

import com.fasterxml.jackson.annotation.JsonAnyGetter;

public class UserCreateRequest {
    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

}
