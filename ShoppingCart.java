package org.example;

import java.util.ArrayList;
import java.util.List;
public class ShoppingCart {
        static String addCart (double a, int b ,double sub[] ){
            for (int i = b + 1; i == b; b++){
                sub[i] = a;
            }
            b++;
            return "You successfully added this book to your Cart.";}

        static void displayCart (double subT[], int a){

            for (int i = 0; i <= a; i++) {
                System.out.println(subT[i]);
            }

        }
    }


