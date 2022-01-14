package com.javadeveloperdiary.observer.interfaces;

public interface Subject {

    //register observer
    public void register(Observer observer);

    //unregister an observer
    public void unregister(Observer observer);

    // get update
    public Object getUpdate(Observer observer);

    // notify all observers about the new update
    public void notifyObservers();
}
