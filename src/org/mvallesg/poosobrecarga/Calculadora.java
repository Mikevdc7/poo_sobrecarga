package org.mvallesg.poosobrecarga;

public class Calculadora {

    public static int sumar(int a, int b){
        return a+b;
    }

    public static int sumar(int... argumentos){
        int total = 0;
        for(int i=0; i<argumentos.length; i++){
            total+=argumentos[i];
        }
        return total;
    }

    public static float sumar(float a, int... argumentos){
        float total = a;
        for(int i=0; i<argumentos.length; i++){
            total+=argumentos[i];
        }
        return total;
    }

    public static float sumar(float x, float y){
        return x+y;
    }

    public static float sumar(int i, float j){
        return i+j;
    }

    public static float sumar(float i, int j){
        return i+j;
    }

    public static double sumar(double a, double b){
        return a+b;
    }

    public static int sumar(String a, String b){
        int res;
        try{
            res = Integer.parseInt(a)+Integer.parseInt(b);
        } catch(NumberFormatException ex){
            res=0;
        }
        return res;
    }

    public static int sumar(int a, int b, int c){
        return a+b+c;
    }
}
