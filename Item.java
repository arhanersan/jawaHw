/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arhan
 */
public class Item {
    private String productName;
    private String supplierName;
    private double sellingPrice;
    private double purchasePrice;

    
    public Item(String productName, String supplierName, double sellingPrice, double purchasePrice) {
        this.productName = productName;
        this.supplierName = supplierName;
        this.sellingPrice = sellingPrice;
        this.purchasePrice = purchasePrice;
    }

    
    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public double getSellingPrice() {
        return sellingPrice;
    }

    public void setSellingPrice(double sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public double getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(double purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    
    public void increaseSellingPriceBy20Percent() {
        this.sellingPrice *= 1.20;
    }

    public double calculateProfit() {
        return this.sellingPrice - this.purchasePrice;
    }
}