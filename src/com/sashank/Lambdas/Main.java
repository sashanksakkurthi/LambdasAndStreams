package com.sashank.Lambdas;

import java.util.function.IntBinaryOperator;

public class Main {
    public static void main(String[] args) {

        // class based implementation
        Greeting greeting = new HelloGreeting();
        greeting.sayHello();

        // interface based implementation
        Greeting greeting1 = new Greeting() {
            @Override
            public void sayHello() {
                System.out.println("sayHello");
            }
        };
        greeting1.sayHello();

        // lambda based implementation using custom interface
        Greeting greeting2 = () -> System.out.println("sayHello");
        greeting2.sayHello();

        // lambda based implementation using custom interface
        Calculator calculator = (int x, int y) -> {
            return x + y;
        };
        System.out.println(calculator.calculate(8, 9));

        // lambda based implementation using java build in interface
        IntBinaryOperator calculator1 = (int x, int y) -> {
            return x+y;
        };
        System.out.println(calculator1.applyAsInt(15,19));
    }
}
