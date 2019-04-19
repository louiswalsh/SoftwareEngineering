package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Timeline {
    ArrayList<Post> tl;

    public Timeline(Post p) {
        tl.add(p);
    }

    public void addPost (Post p) {
        tl = new ArrayList<Post>();
        tl.add(p);
    }

    public void displayTL (User usr) {
//        for (int i = 0; i < usr.timeline.tl.size(); i++) {
//            System.out.println(usr.timeline.tl.get(i));
        }
    }


