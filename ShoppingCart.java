/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Arhan
 */
import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> items;

    
    public ShoppingCart() {
        this.items = new ArrayList<>();
    }

    // Adım b: Sepete ekleyen metot
    public void addItem(Item item) {
        this.items.add(item);
    }

    // Adım c: Sepetteki ürünlerin toplam fiyatını hesaplayan metot
    public double calculateTotalPrice() {
        double totalPrice = 0.0;
        for (Item item : items) {
            totalPrice += item.getSellingPrice();
        }
        return totalPrice;
    }

}
