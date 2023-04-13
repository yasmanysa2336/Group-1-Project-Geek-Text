package org.example;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

        public static void Main (String[] args) {
            int totalBooks = 0;
            double Cart[] = null;


            ShoppingCart.addCart(22.24, totalBooks, Cart);
            ShoppingCart.displayCart(Cart,totalBooks);

        }

    }
