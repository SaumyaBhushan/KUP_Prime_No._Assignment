package com.knoldus;

import java.util.List;

public class DriverClass {
    public static void main(String[] args) {

        List<Integer> randomNumbersList = Numbers.numberList();
        System.out.println("This is the list of random numbers \n" +randomNumbersList);

        FindPrimeNo primeNums = new FindPrimeNo();

        List<Integer> primenolist = primeNums.findPrimeNoList(randomNumbersList);
        System.out.println("list of Prime numbers \n" + primenolist);

    }
}
