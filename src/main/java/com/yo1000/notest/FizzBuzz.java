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
        FizzBuzz fizzBuzz = new FizzBuzz();
        return fizzBuzz.result(new StringBuilder()
                        .append(fizzBuzz.fizz(number))
                        .append(fizzBuzz.dizz(number))
                        .append(fizzBuzz.bizz(number))
                        .append(fizzBuzz.buzz(number))
                        .append(fizzBuzz.duzz(number))
                        .append(fizzBuzz.fuzz(number))
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
