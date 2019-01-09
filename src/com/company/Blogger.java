package com.company;

import java.util.LinkedList;
import java.util.List;

public class Blogger implements Publisher {
    List<Subscriber> subscribers = new LinkedList<>();

    @Override
    public void registrationSubscriber(Subscriber subscriber) {
        subscribers.add(subscriber);
    }

    @Override
    public void creatNews(String news) {
        for (Subscriber subscriber:subscribers){
            subscriber.read(news);
        }
    }
}
