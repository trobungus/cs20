package SkillBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class HurricaneTest
{

    @Test
    public void givesCategoryOneSpeeds()
    {
        assertEquals("74-95 mph or 64-82 kt or 119-153 km/hr",
                Hurricane.getWindSpeed(1));
    }

    @Test
    public void givesCategoryFiveSpeeds()
    {
        assertEquals("greater than 155 mph or 135 kt or 249 km/hr",
                Hurricane.getWindSpeed(5));
    }

    @Test
    public void rejectsInvalidCategory()
    {
        assertEquals("Invalid category.", Hurricane.getWindSpeed(7));
    }

}
