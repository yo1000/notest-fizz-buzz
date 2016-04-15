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
        return result(new StringBuilder()
                        .append(fizz(number))
                        .append(dizz(number))
                        .append(bizz(number))
                        .append(buzz(number))
                        .append(duzz(number))
                        .append(fuzz(number))
                        .toString(),
                number);
    }

    public String fizz(int number) {
        return number % 3 == 0 ? "Fizz" : "";
    }
    public String dizz(int number) {
        return number % 7 == 0 ? "Dizz" : "";
    }
    public String bizz(int number) {
        return number % 13 == 0 ? "Bizz" : "";
    }
    public String buzz(int number) {
        return number % 5 == 0 ? "Buzz" : "";
    }
    public String duzz(int number) {
        return number % 11 == 0 ? "Duzz" : "";
    }
    public String fuzz(int number) {
        return number % 17 == 0 ? "Fuzz" : "";
    }
    public String result(String result, int number) {
        return result.length() == 0 ? String.valueOf(number) : result;
    }
}
