package com.kodilla.collections.adv.immutable.homework;

public class TaskHacked extends Task {
    private String realTitle;
    public TaskHacked(String title, int duration) {
        super(title, duration);
        realTitle=title;
    }
    public  void modifyTitle(String newTitle){ realTitle=newTitle;}

    public String getTitle() {
        return realTitle;
    }
}
