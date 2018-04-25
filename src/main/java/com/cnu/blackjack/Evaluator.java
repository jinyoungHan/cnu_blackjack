package com.cnu.blackjack;

import java.util.Map;

public class Evaluator {

    private Map<String, Player> playerMap;
    private Dealer dealer;


    public Evaluator(Map<String, Player> playerMap) {
        this.playerMap = playerMap;
        dealer = new Dealer();
        dealCardToPlayers();
    }

    public void start() {



    }

     void dealCardToPlayers() {
        playerMap.forEach((name, player) -> {
            player.hitCard();
            player.hitCard();
        });
    }

    public void result() {


    }
}
