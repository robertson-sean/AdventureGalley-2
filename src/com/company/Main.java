package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Room curRoom = addRooms();

        Scanner reader = new Scanner(System.in);
        System.out.println(curRoom.getDescription());
        String prompt = reader.next();
        while(true) {
            if (prompt.equalsIgnoreCase("look")) {
                System.out.println("The room is dark, there is a banana, a button, and a friend");
            }
           else if (prompt.equals("look")) {

                System.out.println("The room is dark");
            }
           else if (prompt.equals("look")) {

                System.out.println(curRoom.getDescription());
            }
            else if (prompt.equals("quit")) break;
            else{
                System.out.println("You can't do that ");
            }
            prompt = reader.next();
        }
    }
    //This is a utility method to set up all the rooms and their connections.
    //Returns the main Room.
    private static Room addRooms() {
        Room home = new Room("home", "You are in a simple gray room.");
        Room cave = new Room("cave", "This room glitters with jewels.");
        Room arcade = new Room("arcade","This  room is full of skee ball courts");
        Room garage = new Room("garage","this room is full of cardboard boxes");
        arcade.addRoom(home);
        home.addRoom(garage);
        garage.addRoom(home);
        garage.addRoom(arcade);
        arcade.addRoom(cave);
        cave.addRoom(garage);
        home.addRoom(cave);
        home.addRoom(arcade);
        cave.addRoom(home);
        return home;

    }
}
