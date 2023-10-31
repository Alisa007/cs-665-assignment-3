/**
 * Name: ALISA BELOUSOVA
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: NewEmail.java
 * Description: 
 * This class represents the email template for New customers. 
 * It implements the `EmailTemplate` interface and provides the specific implementation 
 * for generating an email message tailored to New customers.
 */

package edu.bu.met.cs665.email;

public class NewEmail implements EmailTemplate {
  @Override
  public String generateEmail() {
    return "Dear New Customer, ...";
  }
}
