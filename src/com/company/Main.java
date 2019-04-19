package com.company;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        ArrayList<User> users;
        users = PopulateWakebook();
        boolean menub         = false;
        int loginb            = -1;

        while (loginb == -1) {
            loginb = LoginHandler(users);
        }

        while (!menub) {
            menub = MenuHandler(users.get(loginb), users);
        }

        System.out.println("Thank you for using Wakebook!");
    }

    static boolean MenuHandler(User user, ArrayList<User> users) {
        String command = "", temp = "";
        int counter = 0;
        boolean added = false;
        Scanner scnr = new Scanner(System.in);

        while (!command.equalsIgnoreCase("x")) {
            System.out.println("What would you like to do?");
            System.out.println("Press 'a' to add a friend, 'p' to post to your timeline, 'v' to view your news feed, or 'x' to exit.");

            command = scnr.nextLine();

            if (command.equalsIgnoreCase("a")) {
                System.out.println("Enter a valid name of a user you would like to add as your friend");
                temp = scnr.nextLine();

                for (int i = 0; i < users.size(); i++) {
                    if (temp.equalsIgnoreCase(users.get(i).getUsername())) {
                        user.addFriend(users.get(i));
                        System.out.println("User successfully added");
                        added = true;
                    }
            }

            if (!added) {
                System.out.println("Unable to find user. Please try again");
            }

            }
            else if (command.equalsIgnoreCase("p")) {
                System.out.println("Enter the post you would like to make: ");
                temp = scnr.nextLine();

                user.createPost(temp);
                System.out.println("Successfully added to your timeline!");

            } else if (command.equalsIgnoreCase("v")) {
                for (int i = 0; i < user.friends.size(); i++) {
                    counter = user.friends.get(i).timeline.size();
                    for (int j = 0; j < counter; j++) {
                        System.out.println();
                        System.out.println(user.friends.get(i).timeline.get(j).content);
                        System.out.println(user.friends.get(i).timeline.get(j).date);
                        System.out.println();
                    }
                }

            } else if (command.equalsIgnoreCase("x")){
                System.out.println("Thank you for using Wakebook!");
                System.exit(0);
            }
            added = false;
        }


        return false;
    }







    static int LoginHandler (ArrayList<User> users) {
        String temp;
        Scanner scnr = new Scanner(System.in);

        System.out.println("Type 'login' to sign onto your account or 'create' to start a new account:");
        temp = scnr.nextLine();

        if (temp.equals("login")) {
            System.out.println("Enter your username to sign into Wakebook");
            temp = scnr.nextLine();

            for (int i = 0; i < users.size(); i++) {
                if (temp.equals(users.get(i).getUsername())) {
                    System.out.println("Welcome to Wakebook, " + users.get(i).getUsername());
                    return i;
                }
                else if (i == users.size() - 1 && !temp.equals(users.get(i).getUsername())) {
                    System.out.println("Invalid username. Please retry");
                }
            }


        }

        else if (temp.equals("create")) {
            System.out.println("Enter your new username for Wakebook, and sign in with that account");
            temp = scnr.nextLine();

            users.add(new User(temp));
            System.out.println("New user successfully created");
        }

        else {
            System.out.println("Invalid entry, please enter 'login' or 'create' to continue.");
        }
        return -1;
    }

    static ArrayList<User> PopulateWakebook() {
        ArrayList<User> users = new ArrayList<User>();

        users.add(new User("louisv"));
        users.add(new User("robbys"));
        users.add(new User("donovany"));
        users.add(new User("bomiller"));
        users.add(new User("krystofp"));

        users.get(0).addFriend(users.get(1));
        users.get(0).addFriend(users.get(2));
        users.get(0).addFriend(users.get(3));

        users.get(1).createPost("Hello world!");
        users.get(1).createPost("New post for my timeline");
        users.get(2).createPost("I love Buzz'd");
        users.get(3).createPost("Coding is hard");
        users.get(3).createPost("Making my first post on Wakebook! Kinna nervous!");


        return users;
    }




}

