package com.nlu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private int userid;
    private String userName;
    private String chucVu;
    private String PhanQuyen;
    private String password;
    private int phone;

}
