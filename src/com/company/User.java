package com.company;

import java.util.ArrayList;

public class User {

    String            username;
    ArrayList<User>   friends = new ArrayList<User>();
    ArrayList<Post>   timeline;


    public User (String inp) {
        username = inp;
        friends  = null;
    }

    public String getUsername() {
        return this.username;
    }

    public void addFriend (User friend) {
        this.friends = new ArrayList<User>();
        friends.add(friend);
    }

    public void createPost(String pst) {
        this.timeline = new ArrayList<Post>();
        timeline.add(new Post(pst));
    }

}
