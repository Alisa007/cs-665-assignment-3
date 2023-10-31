/**
 * Name: ALISA BELOUSOVA
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: FrequentEmail.java
 * Description: 
 * This class represents the email template for Frequent customers. 
 * It implements the `EmailTemplate` interface and provides the specific implementation 
 * for generating an email message tailored to Frequent customers.
 */

package edu.bu.met.cs665.email;

public class FrequentEmail implements EmailTemplate {
  @Override
  public String generateEmail() {
    return "Dear Frequent Customer, ...";
  }
}
