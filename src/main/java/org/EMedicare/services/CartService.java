package org.EMedicare.services;

import java.util.List;

import org.EMedicare.entity.Cart;

public interface CartService {
void insertCart(Cart cart);
void addToCart(Cart Citem);
void deleteCart(int medicineId);
List<Cart>getCart();
//Cart findById(int medicineId);
}
