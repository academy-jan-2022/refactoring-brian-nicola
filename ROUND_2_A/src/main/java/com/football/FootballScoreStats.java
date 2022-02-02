package com.football;

public class FootballScoreStats {

    public int teamTotal(String teamName) {
        int total = 0;
        Game[] played = Game.getAllPlayed();
        for (Game game : played) {
            total += game.getTeamScore(teamName);
        }
        return total;
    }

}
