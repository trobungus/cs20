package SkillBuilders;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class DeliveryTest
{

    @Test
    public void acceptsPackageAtLimit()
    {
        assertEquals("Accept", Delivery.getResult(10, 10, 10));
    }

    @Test
    public void rejectsPackageOverLimit()
    {
        assertEquals("Reject", Delivery.getResult(8, 12, 7));
    }

}
