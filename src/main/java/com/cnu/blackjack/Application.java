package com.cnu.blackjack;
import lombok.Data;

import java.util.Scanner;


public class Application {

    public static void main(String[] args) {

        Game game = new Game(new Deck(2));


        System.out.println("게임을 시작합니다.");


        System.out.println("플레이어를 등록해주세요.");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("예산을 등록해주세요");
        int money = input.nextInt();
        game.addPlayer(name, money);

        Evaluator evaluator = new Evaluator(game.getPlayerList());

        evaluator.start();

    }

}
