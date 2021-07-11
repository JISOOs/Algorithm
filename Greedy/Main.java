package com.company;


import java.io.IOException;
import java.util.*;

public class Main {


    public static void main(String[] args) throws IOException {
        functionk();
    }

    public static int functionk() {
        int[] people = {70, 50, 80, 50};
        int limit =100;
        int max = 0;
        int answer =0;

        Arrays.sort(people);

        for(int i =people.length-1; i>=max; i--){
            if(people[i]+people[max]>limit){
                answer++;
            }else{
                answer++;
                max++;
            }
        }
        return answer;
    }
}


