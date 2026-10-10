package oop.assignment_problems;

import java.util.HashSet;

public class DuplicatePlayerPickChecker {

    static void findDuplicates(String[] players) {
        HashSet<String> seen = new HashSet<>();

        for (String player : players) {
            if (seen.contains(player)) {
                System.out.println("Duplicate Found: " + player);
            } else {
                seen.add(player);
            }
        }
    }

    public static void main(String[] args) {
        String[] players = {
            "Kohli", "Bumrah", "Kohli", "Rohit"
        };

        findDuplicates(players);
    }
}