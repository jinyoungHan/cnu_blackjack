package com.cnu.blackjack;

import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class EvaluatorTest {

    Game game;
    Player player;

    @Before
    public void setup() {game = new Game(new Deck(1)); }


    @Test
    public void 게임초기화시_모든플레이어는_2장의카드를_받는다() {
        // Evaluator 생성자 실행시 카드 2개가 가는지 확인하기 위한것

        game.addPlayer("cnu1조", 200);
        Evaluator evaluator = new Evaluator(game.getPlayerList());
        player = game.getPlayerList().get("cnu1조");
        assertThat(player.getCard().size(), is(2));

        //임의로 player 한명 만들고, Evaluator 생성자 실행 시 카드 2장이 되었는지 확인
    }

    @Test
    public void 각_플레이어는_16이하면_히트한다() {

        Evaluator evaluator = new Evaluator(game.getPlayerList());

    }

    @Test
    public void 블랙잭이나오면_2배로_보상받고_해당_플레이어의_턴은_끝난다() {

        Evaluator evaluator = new Evaluator(game.getPlayerList());


    }

    @Test
    public void 각_플레이어는_17이상이면_스테이한다() {

        Evaluator evaluator = new Evaluator(game.getPlayerList());

    }
}
