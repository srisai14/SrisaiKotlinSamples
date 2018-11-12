package com.srisai.kotlin;

public class FunctionCallFromJava {
    public static void main(String[] args) {
        int res= CallingFromJava.addition(4,5);
        System.out.println(res);

        int calcamt = DefaultParametersTestKt.InterestCalcAmt( 50 );
        System.out.println(calcamt);
    }
}
