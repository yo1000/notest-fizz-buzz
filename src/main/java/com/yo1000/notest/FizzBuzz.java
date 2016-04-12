package com.yo1000.notest;

public class FizzBuzz {
    public static void main(String[] args) {
        new FizzBuzz().run();
    }

    public void run() {
        for (int i = 1; i <= 255255; i++) {
            System.out.println(fizzBuzz(i));
        }
    }

    protected String fizzBuzz(int number) {
        StringBuilder builder = new StringBuilder();

        if (number % 3 == 0) {
            builder.append("Fizz");
        }
        if (number % 7 == 0) {
            builder.append("Dizz");
        }
        if (number % 13 == 0) {
            builder.append("Bizz");
        }
        if (number % 5 == 0) {
            builder.append("Buzz");
        }
        if (number % 11 == 0) {
            builder.append("Duzz");
        }
        if (number % 17 == 0) {
            builder.append("Fuzz");
        }

        return builder.length() == 0
                ? String.valueOf(number)
                : builder.toString();
    }
}
