package com.troytech.oca11.part3;


interface InterfaceOne {
    void printOne();
}

abstract class TestClass implements  InterfaceOne {
    @Override
    public abstract void printOne();
}

class TestClass1 implements  InterfaceOne {
    @Override
    private void printOne() {
        System.out.print("One");
    }
}

class TestClass2 implements  InterfaceOne {
    @Override
    public void printOne() {
        System.out.print("One");
    }
}

abstract  class TestClass3 implements  InterfaceOne {
    @Override
    public void printOne() {
        System.out.print("One");
    }
}

abstract  class TestClass4 implements  InterfaceOne {
    @Override
    public String printOne() {
        return "one";
    }
}



public class Q32 {
    public static void main(String[] args) {

    }
}
