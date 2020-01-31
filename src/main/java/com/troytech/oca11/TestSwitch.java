package com.troytech.oca11;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TestOverride {

    class Base {

        // Overrride
        public <T>ArrayList<T> processList(List<T> list) {
            return null;
        }

        // Overload
        public <T>ArrayList<T> processList(ArrayList<T> list) { // add ArrayList type
            return null;
        }

        // Overload
        public <T>ArrayList<T>processList(LinkedList<T> list){ // add LinkedList type
            return null;
        }
    }

    class subClass extends Base {
        @Override
        public <T> ArrayList<T> processList(List<T> list) {
            return null;
        }
    }

    public static void main(String args[]) {
        //TODO
    }
}
