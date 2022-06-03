package com.utest.automation.models;

import lombok.Data;

@Data
public class Register {
    private String first_name;
    private String last_name;
    private String email;
    private String month_birth;
    private String day_birth;
    private String year_birth;
}
