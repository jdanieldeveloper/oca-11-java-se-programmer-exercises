package com.troytech.oca11.part3;

public class Q20 {

    interface  Pastry {
        void getIngredients();
    }

    abstract class Cookie implements Pastry {}

    class ChocolateCookie implements Cookie {

        @Override
        public void getIngredients() {

        }
    }

}
