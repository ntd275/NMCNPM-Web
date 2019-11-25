/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cart;

import entity.SanPham;

/**
 *
 * @author ntd27
 */
public class ShoppingCartItem {

    SanPham product;
    short quantity;

    public ShoppingCartItem(SanPham product) {
        this.product = product;
        quantity = 1;
    }

    public SanPham getProduct() {
        return product;
    }

    public short getQuantity() {
        return quantity;
    }

    public void setQuantity(short quantity) {
        this.quantity = quantity;
    }

    public void incrementQuantity() {
        quantity++;
    }

    public void decrementQuantity() {
        quantity--;
    }

    public double getTotal() {
        double amount;
        amount = (this.getQuantity() * (double)product.getGiaTien());
        return amount;
    }
}
