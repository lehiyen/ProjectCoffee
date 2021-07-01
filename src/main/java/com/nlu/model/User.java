package com.nlu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {
    private String userid;
    private String userName;
    private String chucVu;
    private String phanQuyen;
    private String password;
    private String phone;

//    public User(int userid, String userName, String chucVu, String PhanQuyen, String password, int phone) {
//    }

}
