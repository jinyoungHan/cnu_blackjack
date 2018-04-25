package com.cnu.blackjack;
import lombok.Data;

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
        playerMap.forEach((String name, Player player) -> {
            condition(player);
            /*
            int sum = 0;
            for(int i = 0 ; i < player.getCard().size()  ; i++) {
                   sum += player.getCard().get(0).getRank();
            }

           int balance = player.getBalance();

            if(sum <= 16) {
                while( sum <= 16 ) {
                    System.out.println("16이하의 숫자라 카드를 뽑습니다.");
                    player.hitCard();
                }
            }
            if (sum >= 17 && sum < 21 ) {
                System.out.println("17 이상의 숫자라 스테이 합니다.");
                if(dealer.getDealerScore() <= sum ) {
                    balance += (player.getCurrentBet()*2);
                }
            }

            if( sum == 21 ) {
                System.out.println("블랙잭 입니다.");
                balance += (player.getCurrentBet() * 4);
            }
            */
    });

    }

     private void dealCardToPlayers() {
        playerMap.forEach((name, player) -> {
            player.hitCard();
            player.hitCard();
        });
    }

    /* 플레이어 리스트를 얻기 위한 함수 구현 */
    public Map<String, Player> getplayerMap() {
        return this.playerMap;
    }

    public int condition(Player player) {

        int sum = 0;
        for(int i = 0 ; i < player.getCard().size()  ; i++) {
            sum += player.getCard().get(i).getRank();
        }

        int balance = player.getBalance();

        if(sum <= 16) {
            while( sum <= 16 ) {
                System.out.println("16이하의 숫자라 카드를 뽑습니다.");
                player.hitCard();
                for(int i = 0 ; i < player.getCard().size()  ; i++) {
                    sum += player.getCard().get(player.getCard().size()-1).getRank();
                }
            }
        }
            if (sum >= 17 && sum < 21 ) {
                System.out.println("17 이상의 숫자라 스테이 합니다.");
                if(dealer.getDealerScore() <= sum ) {
                    balance += (player.getCurrentBet()*2);
                    System.out.println("잔고는" + balance + "입니다");
                }
        }

        if( sum == 21 ) {
            System.out.println("블랙잭 입니다.");
            balance += (player.getCurrentBet() * 4);
            System.out.println("잔고는 " + balance + "입니다");
        }

        else {
            System.out.println("카드가 21을 초과했습니다. 졌습니다.");
        }


        return sum;


    }

    /*
    public void result() {


    }
    */
}
