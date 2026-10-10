package oop.class_problems;

import java.util.HashSet;

public class DuplicateTeamNameFinder {

    public static void main(String[] args) {
        String[] teams = {
            "ByteForce", "CodeStorm", "ByteForce", "TechTitans"
        };

        HashSet<String> seen = new HashSet<>();

        for (String team : teams) {
            if (seen.contains(team)) {
                System.out.println("Duplicate Found: " + team);
            } else {
                seen.add(team);
            }
        }
    }
}