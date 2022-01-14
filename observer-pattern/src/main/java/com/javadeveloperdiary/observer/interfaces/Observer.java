package com.javadeveloperdiary.observer.interfaces;

public interface Observer {

    // update yourself, update an observer.
    public void update();

    //set subject( an update got from subject)
    public void setSubject(Subject subject);
}
