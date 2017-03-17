package edu.alex.java;

import edu.alex.java.IO.*;

import static edu.alex.java.IO.*;


public class Main {

    public static void main(String[] args) {
	// write your code here

        System.out.println(getInteger("Enter integer between 7 and 9: ", 7, 9));
        System.out.println(getInteger("Enter integer between 1 and 4: ", 1, 4));

        System.out.println(getIntegerRecursive("Enter integer: "));
        System.out.println(getDoubleRecursive("Enter double: "));
        System.out.println(getFloatRecursive("Enter float: "));

        System.out.println(getInteger("Enter integer: "));
        System.out.println(getDouble("Enter double: "));
        System.out.println(getFloat("Enter float: "));
    }
}
