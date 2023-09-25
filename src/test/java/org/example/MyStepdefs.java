package org.example;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MyStepdefs {
    private static RomanNumeralConverter converter;
    private static String output;

    @Given("I have started the converter")
    public void iHaveStartedTheConverter() {
        converter = new RomanNumeralConverter();
        assertNotNull(converter);
    }

    @When("I convert {int}")
    public void iConvert(int arg0) {
        output = converter.arabicToRoman(arg0);
    }

    @Then("I should see {string}")
    public void iShouldSee(String expected) {
        assertNotNull(output);
        assertEquals(expected, output);
    }
}
