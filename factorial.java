package q1;

import java.util.*;

public class Q1 {//heba jalil

     public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
    int n;
    int fact=1;
    n=in.nextInt();
   while(n>0){
        fact=fact*(n);
        n--;
    }
          System.out.println(fact);
     }

       
}

