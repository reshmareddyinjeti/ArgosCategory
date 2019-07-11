package argcategory.com.steps;

import argcategory.com.drivers.DriverFactory;
import argcategory.com.pageobjects.HomePage;
import argcategory.com.pageobjects.ResultsPage;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.hamcrest.Matchers;

import static org.hamcrest.MatcherAssert.assertThat;

public class category extends DriverFactory {

    private HomePage homePage = new HomePage();
    private ResultsPage resultsPage = new ResultsPage();
    public class MyStepdefs {

        @Given("^I am Homepage$")
        public void iAmHomepage() {
            homePage.getcurrenturl();
        }
    @When("^I search for a \"([^\"]*)\"$")
    public void iSearchForA(String arg0) throws Throwable {
        homePage.doSearch("Home");

    }

    @And("^I select category filters as \"([^\"]*)\"$")
    public void iSelectCategoryFiltersAs(String arg0) throws Throwable {
            resultsPage.getallcategoryfilters("Sofas");
    }

    @And("^I select category price Sofa filters as \"([^\"]*)\"$")
    public void iSelectCategoryPriceSofaFiltersAs(String arg0) throws Throwable {
        resultsPage.getallcategoryfilters("Fabric");
    }

    @Then("^I should be able to see the respective product$")
    public void iShouldBeAbleToSeeTheRespectiveProduct() {
            resultsPage.getHeader();
    }



    }
}