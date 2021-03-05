package com.knoldus;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Numbers {
    public static List<Integer> numberList()
    {

        List<Integer> randomNumbers= new ArrayList<>();
        Random random = new Random();
        int upper_bound = 1000;
        for (int i=0;i<100;i++)
        {
            randomNumbers.add(random.nextInt(upper_bound));
        }


        return randomNumbers;
    }

}
