package stepsDef;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.xml.sax.SAXException;
import pages.HomePage;
import pages.LiveScorePage;
import utils.ActionHelper;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class HomePageStepDefinitions {

   // HomePageActions homePageActions = new HomePageActions();
   // LiveScorePageActions liveScorePageActions = new LiveScorePageActions();

    @Given("User is on website")
    public void customer_is_on_website() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("I am on this step");
        ActionHelper.waitForElementToLoad(HomePage.btn_popUp_not_now());
        ActionHelper.clickBtn(HomePage.btn_popUp_not_now());


    }
    @When("User looks for title")
    public void customer_looks_for_title() {
        String title = ActionHelper.getTitle();
        Assert.assertEquals("Title not found",
                "Today's Cricket Match | Cricket Update | Cricket News | ESPNcricinfo",
                "Today's Cricket Match | Cricket Update | Cricket News | ESPNcricinfo");
    }

    @When("User clicks on Live Scores")
    public void user_clicks_on_live_scores() throws Exception {
        // Write code here that turns the phrase above into concrete actions
        ActionHelper.waitForElementToLoad((HomePage.get_link_Live_Scores()));
        ActionHelper.click_on_link(HomePage.get_link_Live_Scores());
        System.out.println("I am on  step 2");
    }

    @When("User can see Live Scores tab on the page")
    public void user_can_see_live_scores() {
       Assert.assertTrue(ActionHelper.isElementPresent(LiveScorePage.Tab_live_Score));
        Assert.assertTrue(ActionHelper.isElementPresent(LiveScorePage.Tab_Cricket_Schedule));
        Assert.assertTrue(ActionHelper.isElementPresent(LiveScorePage.Tab_Match_Results));

    }

}
