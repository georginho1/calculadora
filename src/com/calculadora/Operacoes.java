package com.calculadora;

public class Operacoes {
    private double resultado;

    public double soma(double a, double b){
        this.resultado = a + b;
        return this.resultado;
    }

    public double subtrair(double a, double b){
        this.resultado = a - b;
        return this.resultado;
    }

    public double multiplicar(double a, double b) {
        this.resultado = a * b;
        return this.resultado;
    }

    public double dividir(double a, double b) {
        if(b == 0){
            throw new ArithmeticException("Não podemos dividir por zero!");
        }else {
            this.resultado = a / b;
        }
        return this.resultado;
    }

    public double getResultado() {
        return resultado;
    }
}
