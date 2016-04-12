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
        return new Empty().echo(
                new StringBuilder()
                        .append(new Fizz().echo(number))
                        .append(new Dizz().echo(number))
                        .append(new Bizz().echo(number))
                        .append(new Buzz().echo(number))
                        .append(new Duzz().echo(number))
                        .append(new Fuzz().echo(number))
                        .toString(),
                number);
    }

    public static class Fizz {
        public String echo(int number) {
            return number % 3 == 0 ? "Fizz" : "";
        }
    }
    public static class Dizz {
        public String echo(int number) {
            return number % 7 == 0 ? "Dizz" : "";
        }
    }
    public static class Bizz {
        public String echo(int number) {
            return number % 13 == 0 ? "Bizz" : "";
        }
    }
    public static class Buzz {
        public String echo(int number) {
            return number % 5 == 0 ? "Buzz" : "";
        }
    }
    public static class Duzz {
        public String echo(int number) {
            return number % 11 == 0 ? "Duzz" : "";
        }
    }
    public static class Fuzz {
        public String echo(int number) {
            return number % 17 == 0 ? "Fuzz" : "";
        }
    }
    public static class Empty {
        public String echo(String echo, int number) {
            return echo.length() == 0 ? String.valueOf(number) : echo;
        }
    }
}
