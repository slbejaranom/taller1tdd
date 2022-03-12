package starter.stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Dealer;

public class Scenario2 {
	Dealer dealer;
	
	@Given("a {string}")
	public void a(String hand) {
	    // Write code here that turns the phrase above into concrete actions
		dealer = new Dealer();
		String[] cards = hand.split(",");
		for(int i = 0; i < cards.length; i++) {
			dealer.getCards().add(cards[i]);
		}	    
	}
	@When("the dealer sums the cards")
	public void the_dealer_sums_the_cards() {
	    // Write code here that turns the phrase above into concrete actions
	    dealer.sum_cards();
	}
	@Then("the {int} is correct")
	public void the_is_correct(int total) {
	    // Write code here that turns the phrase above into concrete actions
		Assert.assertEquals(dealer.getTotal(), total);
	}

}
