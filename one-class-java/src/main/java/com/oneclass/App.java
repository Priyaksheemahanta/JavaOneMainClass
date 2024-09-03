package com.oneclass;
public class App {
    public static void main(String[] args) {
        // Create a user object
        User user = new User("John");

        // Create a greeting service object
        GreetingService greetingService = new GreetingService();

        // Print the greeting message
        System.out.println(greetingService.greet(user));
    }
}
