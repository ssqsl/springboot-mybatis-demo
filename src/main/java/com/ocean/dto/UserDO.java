package com.ocean.dto;

import lombok.Data;

import java.io.Serializable;

@Data
public class UserDO implements Serializable {

    private static final long serialVersionUID = 5438739092677089251L;

    private Long id;
    private String name;
    private String passwrod;

    public UserDO() {
        super();
// TODO Auto-generated constructor stub
    }
    public UserDO (Long id, String name, String passwrod) {
        super();
        this.id = id;
        this.name = name;
        this.passwrod = passwrod;
    }
}
