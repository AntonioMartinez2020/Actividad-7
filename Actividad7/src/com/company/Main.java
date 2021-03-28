    package com.company;

    import java.util.Scanner;


    public class Main {
        public static void main(String[] args) {
            System.out.println("Ingrese un numero: ");
            Scanner sc = new Scanner(System.in);
            int n = sc.nextInt();
            int[] fibonacci = new int[n];
            int k =2;
            fibonacci[0] = 0;
            fibonacci[1] = 1;
            boolean esPrimo = true;
            for(int i = 2; i != n; i++){
                fibonacci[i] = fibonacci[i-1] + fibonacci[i-2];
            }
            System.out.println("Serie Fibonacci: ");
            for(int i = 0; i != n; i++){
                System.out.println(fibonacci[i]);
            }
            System.out.println("Numeros primos: ");
            while (esPrimo && k < n ){
                esPrimo = n % k !=0;
                k++;
                if (esPrimo == true){
                    System.out.println(n);
                    k = 2;
                    n--;
                }else {
                    esPrimo= true;
                    k=2;
                    n--;
                }
            }
        }

    }



