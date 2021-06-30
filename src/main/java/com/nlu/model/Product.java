package com.nlu.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
//@Data
//@AllArgsConstructor
//@NoArgsConstructor
public class Product {

        private String idProduct;
        private String nameProduct;
        private String idItems;
        private String image;
        private int price;

        public Product(String idProduct, String nameProduct, String idItems, String image, int price) {
                this.idProduct = idProduct;
                this.nameProduct = nameProduct;
                this.idItems = idItems;
                this.image = image;
                this.price = price;
        }

        public int getPrice() {
                return price;
        }

        public String getIdItems() {
                return idItems;
        }

        public String getIdProduct() {
                return idProduct;
        }

        public String getImage() {
                return image;
        }

        public String getNameProduct() {
                return nameProduct;
        }

        public void setPrice(int price) {
                this.price = price;
        }

        public void setIdItems(String idItems) {
                this.idItems = idItems;
        }

        public void setIdProduct(String idProduct) {
                this.idProduct = idProduct;
        }

        public void setImage(String image) {
                this.image = image;
        }

        public void setNameProduct(String nameProduct) {
                this.nameProduct = nameProduct;
        }

}
