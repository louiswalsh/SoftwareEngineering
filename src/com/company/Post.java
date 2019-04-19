package com.company;

import java.util.ArrayList;
import java.util.Date;

public class Post {
    Date date = new Date();
    String content;

    public Post(String post) {
        content  = post;
    }

//    public String createPost (String pst) {
//        content = pst + "\n" + date;
//        return "Post created successfully";
//    }

    public void populateNF (User user) {
        int ctr = 0;
//        for (int i = 0; i < user.friends.size(); i++) {
//            ctr = user.friends.get(i).timeline.size();
//            for (int j = 0; j < ctr; j++) {
//                System.out.println(user.friends.get(i).timeline.get(j));
//            }
//        }

    }
}
