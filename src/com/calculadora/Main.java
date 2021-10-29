package com.calculadora;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {

        double a = 0, b = 0;
        String operacao;
        Valida verifica = new Valida();
        Operacoes calculo = new Operacoes();
        Scanner ler = new Scanner(System.in);
        System.out.println("Escolha uma operação! Digite +, -, x, /, ^, r para raiz, c para cubo ");
        operacao= ler.next();
        System.out.println(verifica.verificaOP(operacao));
        System.out.println("Digite o primeiro e o segundo valor: ");
        a = ler.nextDouble();
        b = ler.nextDouble();
        switch (operacao){
            case "+":
                calculo.soma(a,b);
                System.out.println("O resultado da adição é: " + calculo.getResultado());
                break;
            case "-":
                calculo.subtrair(a,b);
                System.out.println("O resultado da subtração é: " + calculo.getResultado());
                break;
            case "x":
                calculo.multiplicar(a,b);
                System.out.println("O resultado da multiplicação é: " + calculo.getResultado());
                break;
            case "/":
                calculo.dividir(a,b);
                System.out.println("O resultado da divisão é: " + calculo.getResultado());
                break;
            case "^":
                System.out.println("O resultado da exponenciação é: " + Math.pow(a,b));
                break;
            case "r":
                System.out.println("O resultado da raiz quadrada de "+ a +" é : "  + Math.sqrt(a));
                break;
            case "c":
                System.out.println("O resultado da raiz cubica de "+ a +" é : "  + Math.cbrt(a));
                break;
        }
    }
}
