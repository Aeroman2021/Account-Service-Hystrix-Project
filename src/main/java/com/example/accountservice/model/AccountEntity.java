package com.example.accountservice.model;


public class AccountEntity {
    private Long number;
    private String name;

    public AccountEntity(Long number, String name) {
        this.number = number;
        this.name = name;
    }

    public AccountEntity() {
    }

    public Long getNumber() {
        return number;
    }

    public void setNumber(Long number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
