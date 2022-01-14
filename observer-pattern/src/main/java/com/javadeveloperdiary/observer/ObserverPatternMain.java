package com.javadeveloperdiary.observer;

import com.javadeveloperdiary.observer.interfaces.Observer;
import com.javadeveloperdiary.observer.models.EmailTopic;
import com.javadeveloperdiary.observer.models.EmailTopicSubscriber;

public class ObserverPatternMain {
    public static void main(String[] args) {

        EmailTopic emailTopic = new EmailTopic();

        //create observers
        Observer firstObserver = new EmailTopicSubscriber("FirstObserver");
        Observer secondObserver = new EmailTopicSubscriber("secondObserver");
        Observer thirdObserver = new EmailTopicSubscriber("thirdObserver");

        //Register them...
        emailTopic.register(firstObserver);
        emailTopic.register(secondObserver);
        emailTopic.register(thirdObserver);

        // Attaching observer to subject
        firstObserver.setSubject(emailTopic);
        secondObserver.setSubject(emailTopic);
        thirdObserver.setSubject(emailTopic);

        //Check for updates
        firstObserver.update();
        thirdObserver.update();

        //Provider/ Subject ( broadcaster)
        emailTopic.postMessage("Hello Subscribers!");
        emailTopic.unregister(firstObserver);
        emailTopic.postMessage("Hello Subscribers!");

    }
}
