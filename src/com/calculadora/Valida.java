package com.calculadora;

public class Valida {

    public boolean verificaOP(String op){
        if (!op.matches("[rc/+^*-]")) {
            return false;
        }else {
            return true;
        }
    }
}
