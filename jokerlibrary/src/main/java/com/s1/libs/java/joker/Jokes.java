package com.s1.libs.java.joker;

import java.util.Random;

public class Jokes {

   public static String getJoke(){
            Random random = new Random();
            String[] jokes = {"joke 1","joke 2","joke 3","joke 4"};
             return jokes[random.nextInt(jokes.length)];


    }

}
