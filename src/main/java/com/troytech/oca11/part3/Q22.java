package com.troytech.oca11.part3;

import java.util.ArrayList;

class Employee {
    String office;
}

public class Q22 {
    var employee = new ArrayList<Employee>();
        public var display(){
            var employee = new Employee();
            var offices = new ArrayList<>();
            offices.add("Chicago");
            offices.add("Bangalore");
            for(var office : offices ){
                System.out.print("Employee Location : " + office);
            }
    }
}
