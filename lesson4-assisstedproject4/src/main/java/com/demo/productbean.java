package com.demo;
import java.io.Serializable;

public class productbean implements Serializable{
        private String productId;
        private String productName;
        private String productType;
        private double price;
        
        public void setProductId(String value) {
                this.productId = value;
        }
        public void setProductName(String value) {
                this.productName = value;
        }
        public void setProductType(String value) {
            this.productName = value;
    }
        public void setPrice(double value) {
                this.price = value;
        }
        
        public String getProductId() {
                return this.productId;
        }
        public String getProductName() {
                return this.productName;
        }
        public String getProductType() {
            return this.productType;
    }
        public double getPrice() {
                return this.price;
        }
        

}
