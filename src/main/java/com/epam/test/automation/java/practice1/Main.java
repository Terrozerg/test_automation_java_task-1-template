package com.epam.test.automation.java.practice1;

public class Main {

    private Main(){}

    /**
     * <summary>
     * Implement code according to description of task 1.
     * </summary>
     */
    public static int task1(int n) {
        if(n>0){
            return n*n;
        }
        if(n<0){
            return -n;
        }
        return 0;
    }

    /**
     * <summary>
     * Implement code according to description of task 2.
     * </summary>
     */
    public static int task2(int n) {
        if(n>999 || n<100) {
            return -1;
        }

        int[] numbs = new int[3];
        int temp = n;
        int i = 0;

        //split
        do{
            numbs[i] = temp%10;
            temp = temp/10;
            i++;
        }while (temp>0);

        //sort
        int max = numbs[0];
        int j = 0;

        while (j < 2){

            //find max and swap
            for( i = j+1; i < 3; i++){
                if(numbs[i]>max){
                    int swap = numbs[i];
                    numbs[i] = numbs[j];
                    numbs[j] = swap;
                }
            }

            j++;
            max = numbs[j];
        }

        //combine
        int result = 0;
        for( i = 0; i < 3; i++){
            result = 10*result + numbs[i];
        }

        return result;
    }
}
