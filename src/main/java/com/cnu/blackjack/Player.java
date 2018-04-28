package com.cnu.blackjack;
import lombok.Data;

import com.cnu.blackjack.exceptions.NotEnoughBalanceException;
import lombok.Data;

import java.util.List;

@Data
public class Player {

    private int balance;
    private int currentBet;
    private Hand hand;

    public Player(int seedMoney, Hand hand) {
        this.balance = seedMoney;
        this.hand = hand;
    }

    public void placeBet(int bet) {
        if(balance < bet) {
            throw new NotEnoughBalanceException();
        }
        balance -= bet;
        currentBet = bet;
    }

    public Card hitCard() {
        return hand.drawCard();
    }

    /* Player 의 카드 리스트를 알기위한 함수 추가 */
    public List<Card> getCard() {
        return hand.getCardList();
    }


}
