package com.github.jitpack;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main(String[] args)
    {
        System.out.println(new App().greet("world"));
        System.out.println("This is to test the webhook trigger ");
        System.out.println("Test is done for the 66 Muk");
    }

    public String greet(String name) {
        return "Hello " + name;
    }
}
