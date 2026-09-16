package Exercises;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class PizzaCostTest
{

    @Test
    public void calculatesTextbookExample()
    {
        assertEquals(6.75, PizzaCost.calculateCost(10.0), 0.001);
    }

    @Test
    public void includesFixedAndMaterialCosts()
    {
        assertEquals(13.00, PizzaCost.calculateCost(15.0), 0.001);
    }

}
