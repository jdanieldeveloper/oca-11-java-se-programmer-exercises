package com.troytech.oca11.part3;

public class Q33 {
    public static void main(String[] args) {
        AnotherClass ac = new AnotherClass();
        SomeClass sc = new AnotherClass();
        ac = (AnotherClass) sc;
        sc.methodA();
        ac.methodA();

    }
}

class SomeClass {
    public  void methodA() {
        System.out.println("SomeClass#methodA()");
    }
}

class AnotherClass extends SomeClass {
    public void methodA(){
        System.out.println("AnotherClas#methodA()");
    }
}
