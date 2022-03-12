package starter.stepdefinitions;

import org.junit.Assert;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import starter.Dealer;

public class Scenario1 {	
	
	private Dealer dealer;
	
	@Given("a dealer")
	public void a_dealer() {
	    // Write code here that turns the phrase above into concrete actions
	    dealer = new Dealer();
	}
	@When("the round starts")
	public void the_round_starts() {
	    // Write code here that turns the phrase above into concrete actions
	    dealer.start_round();
	}
	@Then("the dealer gives itself two cards")
	public void the_dealer_gives_itself_two_cards() {
	    // Write code here that turns the phrase above into concrete actions	    
	    Assert.assertEquals(dealer.getCards().size(), 2);
	}
	
		
}