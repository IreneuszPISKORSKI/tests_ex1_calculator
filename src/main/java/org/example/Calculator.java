package org.example;

public class Calculator {

    public float add_things(float a, float b){
        return a+b;
    }
    public float substract_things(float a, float b){
        return a-b;
    }
    public float multiplication_things(float a, float b){
        return a*b;
    }
    public String division_things(float a, float b){
        if(b!=0){
            return String.valueOf( a /b);
        }else {
            return "Division by 0 is not allowed!";
        }
    }
    public int division2_things(int a, int b){
        return  (a /b);
    }
}
