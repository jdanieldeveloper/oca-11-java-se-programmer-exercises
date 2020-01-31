package com.troytech.oca11.part3;

import java.util.Collection;
import java.util.List;

class Foo {
    public <T> Collection<T> foo(Collection<T> args) {
    return null;5
    }
}

class Bar extends Foo {

    @Override
    //public <T> List<T> foo(Collection<T> arg) { } Ok

    public <T>Iterable<T> foo(Collection<T> arg){
        return null;
    }
}

public class Q25 {
    public static void main(String[] args) {
    }
}
