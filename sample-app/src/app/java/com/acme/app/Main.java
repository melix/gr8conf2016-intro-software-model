package com.acme.main;
import com.acme.mylib.Greeter;

public class Main {
    public static void main(String... args) {
        Greeter greeter = new Greeter("Cédric");
        greeter.greet();
    }
}
