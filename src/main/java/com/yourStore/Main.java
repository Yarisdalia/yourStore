package com.yourStore;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hola, Java!");

        //variable de tipo cadena de texto
        String myString = "Esto es una cadena de texto ";
        myString = "Aqui cambio el valor de la cadena de texto";
        System.out.println(myString);

        Integer myInt = 7;
        myInt =  myInt + 4;
        System.out.println(myInt);

        Double myDouble = 6.5;
        System.out.println(myDouble);

        Float myFloat = 6.5f;
        System.out.println(myFloat);

        Boolean myBoolean = true;
        myBoolean = false;
        System.out.println(myBoolean);

        myBoolean = null;
        System.out.println(myBoolean);

        List myList = new ArrayList();
        myList.add(myString);
        myList.add(myInt);
        System.out.println(myString);
    }

}