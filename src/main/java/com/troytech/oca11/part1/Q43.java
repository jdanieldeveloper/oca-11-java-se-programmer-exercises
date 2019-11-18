package com.troytech.oca11.part1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 * Which two actions will improve the encapsulation of a class?
 *
 * A. Changing the access modifier of a field from public to private
 * B. Removing the public modifier from a class declaration
 * C. Changing the return type of a method to void
 * D. Returning a copy of the contents of an array or ArrayList instead of a direct reference
 *
 * Answer: A, D
 *
 * @author daniel.carvajal
 */

class Example {
    public String field1;

    // A. Changing the access modifier of a field from public to private
    private String field2;

    // D. Returning a copy of the contents of an array or ArrayList instead of a direct reference
    public List getList(List oldList) {
        List newList = new ArrayList();
            Collections.copy(newList, oldList);
        return newList;
    }


}

public class Q43 {

    public static void main(String[] args) {

    }
}