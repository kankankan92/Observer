package com.company;

public class Main {

    public static void main(String[] args) {
        Publisher publisher = new Blogger();
        Subscriber subscriber = new Private_person();
        publisher.registrationSubscriber(subscriber);
        publisher.creatNews("Завтра будет отличная погода.");

    }
}
