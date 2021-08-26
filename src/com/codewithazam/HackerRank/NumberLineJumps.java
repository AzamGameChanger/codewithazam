package com.codewithazam.HackerRank;

public class NumberLineJumps {
    public static void main(String[] args) {
        //kangaroo 1 starts at X1 and moves at a rate of V1 meters per jump.
        //kangaroo 2 starts at X2 and moves at a rate of V2 meters per jump.
        //You have to figure out a way to get both kangaroos at the same location at the same time as part of the show.
        //If it is possible, return YES, otherwise return NO.

        //kangaroo 1 = x1 moves v1
        //kangaroo 2 = x2 moves v2
        //write a logic - if kangaroos meet in one point print YES = 0 3 4 2
        //if not print NO = 0 2 5 3
       //also we have to notice count of jumps, the kangaroos should jump equally

        int x1=0;
        int v1=3;
        int x2=4;
        int v2=2;

        if (v1>v2&&(x2-x1)%(v1-v2)==0)
            System.out.println("YES");
        else
            System.out.println("NO");


    }

}
