package com.acme.mylib;

import com.acme.mylib.internal.GreeterInternal;

public class Greeter {
    private final String name;

    public Greeter(String name) { this.name = name; }

    public void greet() {
        System.out.println(GreeterInternal.greeting(name));
    }
}
