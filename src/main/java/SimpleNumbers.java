import Wether.Wether;

import java.util.ArrayList;
import java.util.Arrays;

import Wether.Day;
import Wether.Morning;

public class SimpleNumbers implements Sum {

    public static void main(String[] args) {
        ListLern.addd();

        ////Простые числа/////
        System.out.println(1);
        System.out.println(2);

        ArrayList<Long> numbers = new ArrayList<>();
        long current = 9;
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

        Sum a = new SimpleNumbers();

        ////////Перегрузка/////
        System.out.println(Sum.sum(2, 3));          // 5
        System.out.println(Sum.sum(4.5, 3.2));      // 7.7
        System.out.println(a.sum(4, 3, 7));       // 14

        Wether f1 = new Wether();
        f1.a = "t";
        Wether f2 = new Wether();
        f2.a = "ee";
        System.out.println(f1.a + f2.a);

        int test_array[] = {2, 1, 2, 2, 3, 0, 4, 2};
        int test_array1[] = {0, 0, 0, 2, 2,8,25,47,89,47,47};

        /*
            Arrays.toString:
            см. https://docs.oracle.com/javase/7/docs/api/java/util/Arrays.html
         */

        System.out.println(Arrays.toString(removeElement(test_array, 3)));
        System.out.println(Arrays.toString(test_array1));
        System.out.println(Arrays.toString(removeDuplicates(test_array1)));

    }

    public static int[] removeElement(int[] nums, int val) {
        int offset = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == val) {
                offset++;
            } else {
                nums[i - offset] = nums[i];

            }
        }

        // Arrays.copyOf копирует значение из массива nums в новый массив
        // с длинной nums.length - offset
        return Arrays.copyOf(nums, nums.length - offset);
    }
//удаление дубликатов из массива
    private static int[] removeDuplicates(int[] values) {
        int ii=0;
        int j=0;
        int i = 0;
        int ind = 1;
        int offset = 0;
        int lenght = values.length;

        while (i < lenght && j< lenght) {

            for ( j = i + 1; j < lenght; j++) {
                if (values[i] == values[j]) {
                    ind = values[j];

                    for (ii = 0; ii < lenght; ii++) {
                        if (values[ii] == ind) {
                            //values[ii]=values[ii];
                            offset++;
                        } else {
                            values[ii - offset] = values[ii];
                        }
                    }
                    if(offset>0)
                    {values[ii-offset]=ind;}
                    Arrays.copyOf(values, values.length - offset+1);
                    lenght = lenght - offset+1;
                    offset = 0;
                    i = 0;
                    j = 0;
                } else if (j == lenght - 1){
                    i++;
                j = i;}
            }
        }
        return Arrays.copyOf(values, lenght);
    }


    @Override
    public int sum(int x, int y, int z) {
        return 0;
    }

    @Override
    public int q() {

        return 0;
    }


    //    static private int sum(int x, int y, int z){
//int w=x*y;
//        return x + y + z+w;
//    }


}

