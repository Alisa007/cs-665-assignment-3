/**
 * Name: ALISA BELOUSOVA
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: ReturningEmail.java
 * Description: 
 * This class represents the email template for Returning customers. 
 * It implements the `EmailTemplate` interface and provides the specific implementation 
 * for generating an email message tailored to Returning customers.
 */

package edu.bu.met.cs665.email;

public class ReturningEmail implements EmailTemplate {
  @Override
  public String generateEmail() {
    return "Dear Returning Customer, ...";
  }
}
