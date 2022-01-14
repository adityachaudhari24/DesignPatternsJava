package com.javadeveloperdiary.observer.models;

import com.javadeveloperdiary.observer.interfaces.Observer;
import com.javadeveloperdiary.observer.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject {
    private List<Observer> observerList;
    String message;

    public EmailTopic() {
        this.observerList = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {

        if(observer !=null && !observerList.contains(observer)) {
            observerList.add(observer);
        }
    }

    @Override
    public void unregister(Observer observer) {

        if(observer !=null && observerList.contains(observer)) {
            observerList.remove(observer);
        }
    }

    @Override
    public Object getUpdate(Observer observer) {
        return this.message;
    }

    @Override
    public void notifyObservers() {

        for(Observer observer : observerList) {
            observer.update();
        }
    }

    public  void postMessage(String message) {
        System.out.println("Message posted to my topic, message is :"+message);
        this.message=message;
        notifyObservers();
    }
}
