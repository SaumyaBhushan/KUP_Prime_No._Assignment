package com.knoldus;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


public class FindPrimeNo {
    public List<Integer> findPrimeNoList(List<Integer> lstofInt) {

        return lstofInt.stream().filter(FindPrimeNo::isPrime).collect(Collectors.toList());
    }

   private static boolean isPrime(int number){
           return number > 1 && IntStream.range(2, number).noneMatch(i -> number%i==0);

   }
}



