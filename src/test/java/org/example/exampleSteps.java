package org.example;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static junit.framework.TestCase.assertEquals;

public class exampleSteps {

    private SimpleCalculator calculator = new SimpleCalculator();
    private int result;

    @When("I add {string} and {string}")
    public void iAddAnd(String arg0, String arg1) {
        result = calculator.add(arg0 + "," + arg1);
    }

    @Then("the result should be {string}")
    public void theResultShouldBe(String arg0) {
        assertEquals(Integer.parseInt(arg0), result);
    }
}