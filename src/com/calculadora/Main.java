package com.calculadora;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a = 0, b = 0;
        String operacao;
        float resultado;
        Scanner ler = new Scanner(System.in);
        System.out.println("Digite +, -, x, / para realizar uma operação: ");
        operacao= ler.next();

        switch (operacao){
            case "+":
                System.out.println("Digite o primeiro valor: ");
                a = ler.nextInt();
                System.out.println("Digite o segundo valor: ");
                b = ler.nextInt();
                resultado = a + b;
                System.out.println("O resultado da adição é: " + resultado);
                break;
            case "-":
                System.out.println("Digite o primeiro valor: ");
                a = ler.nextInt();
                System.out.println("Digite o segundo valor: ");
                b = ler.nextInt();
                resultado = a - b;
                System.out.println("O resultado da subtração é: " + resultado);
                break;
            case "x":
                System.out.println("Digite o primeiro valor: ");
                a = ler.nextInt();
                System.out.println("Digite o segundo valor: ");
                b = ler.nextInt();
                resultado = a * b;
                System.out.println("O resultado da multiplicação é: " + resultado);
                break;
            case "/":
                System.out.println("Digite o primeiro valor: ");
                a = ler.nextInt();
                System.out.println("Digite o segundo valor: ");
                b = ler.nextInt();
                resultado = a / b;
                System.out.println("O resultado da divisão é: " + resultado);
                break;
        }



    }
}
