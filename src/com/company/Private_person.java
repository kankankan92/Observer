package com.company;

public class Private_person implements Subscriber {

    @Override
    public void read(String news) {
        System.out.println("Я получил новость:\""+ news+ "\"");
    }
}
