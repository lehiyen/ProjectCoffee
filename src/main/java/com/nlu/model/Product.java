package com.nlu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Product {

        private String idProduct;
        private String nameProduct;
        private String idItems;
        private String image;
        private int price;
        private int quantity;

        public void add() {
        }
}
