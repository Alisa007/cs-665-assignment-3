package edu.bu.met.cs665;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import edu.bu.met.cs665.email.EmailFactory;
import edu.bu.met.cs665.email.EmailTemplate;

public class TestEmail {
    @Test
    public void testBusinessEmail() {
        EmailFactory factory = new EmailFactory();
        EmailTemplate email = factory.createEmail("Business");
        assertEquals("Dear Business Customer, ...", email.generateEmail());
    }

    @Test
    public void testReturningEmail() {
        EmailFactory factory = new EmailFactory();
        EmailTemplate email = factory.createEmail("Returning");
        assertEquals("Dear Returning Customer, ...", email.generateEmail());
    }

    @Test
    public void testFrequentEmail() {
        EmailFactory factory = new EmailFactory();
        EmailTemplate email = factory.createEmail("Frequent");
        assertEquals("Dear Frequent Customer, ...", email.generateEmail());
    }

    @Test
    public void testNewEmail() {
        EmailFactory factory = new EmailFactory();
        EmailTemplate email = factory.createEmail("New");
        assertEquals("Dear New Customer, ...", email.generateEmail());
    }

    @Test
    public void testVIPEmail() {
        EmailFactory factory = new EmailFactory();
        EmailTemplate email = factory.createEmail("VIP");
        assertEquals("Dear VIP Customer, ...", email.generateEmail());
    }

    @Test(expected = IllegalArgumentException.class)
    public void testUnknownCustomerType() {
        EmailFactory factory = new EmailFactory();
        factory.createEmail("Unknown");
    }
}