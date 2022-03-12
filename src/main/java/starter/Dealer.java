package starter;

import java.util.ArrayList;
import java.util.Random;

import org.springframework.stereotype.Component;

@Component
public class Dealer {
	private final String[] CARDS = {"A","1","2","3","4","5","6","7","8","9","J","Q","K"};
	
	private ArrayList<String> cards;
	private int total;
	private String play;
	Random randomGen = new Random();
	
	public Dealer() {
		this.total = 0;		
		this.cards= new ArrayList<String>();
		this.play="";
	}
	
	public void start_round() {
		this.cards.add(CARDS[randomGen.nextInt(9)]);
		this.cards.add(CARDS[randomGen.nextInt(9)]);
	}
	
	public void sum_cards() {
		for(String card : this.cards) {
			switch(card) {
				case "A":
					total+=11;
					break;
				case "2":
					total+=2;
					break;
				case "3":
					total+=3;
					break;
				case "4":
					total+=4;
					break;
				case "5":
					total+=5;
					break;
				case "6":
					total+=6;
					break;
				case "7":
					total+=7;
					break;
				case "8":
					total+=8;
					break;
				case "9":
					total+=8;
					break;
				case "J":
					total+=10;
					break;
				case "Q":
					total+=10;
					break;
				case "K":
					total+=10;
					break;
			}
		}
		if(cards.contains("A") && total > 21) {
			this.total -= 10*(cards.stream().filter(card->card.equals("A")).count()>1 ? cards.stream().filter(card->card.equals("A")).count() - 1 : 1);
		}
	}
	
	public void determine_play() {
		this.play = this.total<17 ? "hit" : "stand";
	}

	public ArrayList<String> getCards() {
		return cards;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

	public String getPlay() {
		return play;
	}	
	
	
	
}