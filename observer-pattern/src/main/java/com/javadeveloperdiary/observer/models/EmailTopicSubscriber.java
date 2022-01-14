package com.javadeveloperdiary.observer.models;

import com.javadeveloperdiary.observer.interfaces.Observer;
import com.javadeveloperdiary.observer.interfaces.Subject;

public class EmailTopicSubscriber implements Observer {

    private String name;

    // reference to the subject class.
    private Subject topic;

    public EmailTopicSubscriber(String name) {
        this.name = name;
    }

    @Override
    public void update() {

        String msg = (String) topic.getUpdate(this);
        if (msg == null) {
            System.out.println(name + " no new message on this topic");
        } else {
            System.out.println(name + " retrieving message " + msg);
        }
    }

    @Override
    public void setSubject(Subject subject) {

        this.topic = subject;
    }
}
