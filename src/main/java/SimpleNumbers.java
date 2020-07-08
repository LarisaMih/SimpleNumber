import Wether.Wether;

import java.util.ArrayList;
import Wether.Day;
import Wether.Morning;

public class SimpleNumbers {

    public static void main(String[] args) {


        ////Простые числа/////
        System.out.println(1);
        System.out.println(2);

        ArrayList<Long> numbers = new ArrayList<>();
        long current = 5;
        loop1:
        for (long i = 3; i < current; i = i + 2) {
            int sqrt = (int) Math.sqrt(i);

            loop2:
            for (long j : numbers) {
                if (j > sqrt) {
                    break loop2;
                }
                if (i % j == 0)
                    continue loop1;
            }

            numbers.add(i);
            System.out.println(i);
        }
//        System.out.println(numbers);
       /* for (int i = 1; i <= current; i++) {
            if((i % 2 != 0)  || (i % 2 != 0 && i % 3 != 0 && i % 5 != 0 && i % 7 != 0)) {
                System.out.println(i);
            }
    }*/

       //////ПОГОДА, OVERRIDE////////
        Wether wetherMorning = new Morning();
        Wether wetherDay = new Day();
        wetherMorning.wetherToday(" 5");
        wetherDay.wetherToday(" 15");


        ////////Перегрузка/////
        System.out.println(Sum.sum(2, 3));          // 5
        System.out.println(Sum.sum(4.5, 3.2));      // 7.7
        System.out.println(sum(4, 3, 7));       // 14
    }

    static private int sum(int x, int y, int z){

        return x + y + z;
    }




}

