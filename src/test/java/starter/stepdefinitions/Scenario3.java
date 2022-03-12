package starter.stepdefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import starter.Dealer;

public class Scenario3 {
	
	Dealer dealer;
	
	@Given("a hand {int}")
	public void a_hand(Integer total) {
	    // Write code here that turns the phrase above into concrete actions
	    dealer = new Dealer();
	    dealer.setTotal(total);
	}
	@When("the dealer determines a play")
	public void the_dealer_determines_a_play() {
	    // Write code here that turns the phrase above into concrete actions
	    dealer.determine_play();
	}
	@Then("the {string} is correct")
	public void the_is_correct(String action) {
	    // Write code here that turns the phrase above into concrete actions
	    Assert.assertEquals(dealer.getPlay(), action);
	}	
}