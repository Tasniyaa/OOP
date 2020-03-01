package fibonacci;

import java.util.Scanner;

public class Fib {
   static int f1=0,f2=1,f3=0;    
   public static void fibo(int n){    
    if(n>0){    
         f3 = f1 + f2;    
         f1 = f2;    
         f2 = f3;    
         System.out.print(" "+f3);   
         fibo(n-1);    
     }    
 }    
 public static void main(String args[]){    
    Scanner scan = new Scanner(System.in);
    int f = scan.nextInt();   
    System.out.printf("%d %d ", f1, f2);  
    fibo(f-2);  
     System.out.println("");
 }
}

