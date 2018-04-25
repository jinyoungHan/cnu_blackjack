package com.cnu.blackjack;

import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class EvaluatorTest {

    Game game = new Game(new Deck(1));
    Player player;

    @Test
    public void 게임초기화시_모든플레이어는_2장의카드를_받는다() {

        game.addPlayer("cnu1조", 200);
        Evaluator evaluator = new Evaluator(game.getPlayerList());
        player = game.getPlayerList().get("cnu1조");
        assertThat(player.getCard().size(), is(2));

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
