/**
 * Name: ALISA BELOUSOVA
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: EmailFactory.java
 * Description: 
 * This class represents the factory for creating email templates based on the customer type.
 * It contains the method `createEmail` which takes a customer type as an argument and returns 
 * the appropriate `EmailTemplate` implementation based on the given customer type. 
 * If an unknown customer type is provided, it throws an IllegalArgumentException.
 */

package edu.bu.met.cs665.email;

public class EmailFactory {
  public EmailTemplate createEmail(String customerType) {
    switch (customerType) {
      case "Business":
        return new BusinessEmail();
      case "Returning":
        return new ReturningEmail();
      case "Frequent":
        return new FrequentEmail();
      case "New":
        return new NewEmail();
      case "VIP":
        return new VipEmail();
      default:
        throw new IllegalArgumentException("Unknown customer type: " + customerType);
    }
  }
}

