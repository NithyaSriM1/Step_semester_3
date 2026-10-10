package oop.assignment_problems;

import java.util.Arrays;

public class FantasyLeagueAutoDraftRankingEngine {

    static class Player implements Comparable<Player> {
        String name;
        int score;

        Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        public int compareTo(Player other) {
            return Integer.compare(other.score, this.score);
        }
    }

    static void rankPlayers(Player[] players) {
        Arrays.sort(players);

        for (int i = 0; i < players.length; i++) {
            System.out.println((i + 1) + ". " + players[i].name);
        }
    }

    public static void main(String[] args) {
        Player[] players = {
            new Player("Dev", 75),
            new Player("Rahul", 95),
            new Player("Virat", 85)
        };

        rankPlayers(players);
    }
}