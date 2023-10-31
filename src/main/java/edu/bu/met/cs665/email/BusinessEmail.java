/**
 * Name: ALISA BELOUSOVA
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: BusinessEmail.java
 * Description: 
 * This class represents the email template for Business customers. 
 * It implements the `EmailTemplate` interface and provides the specific implementation 
 * for generating an email message tailored to Business customers.
 */

package edu.bu.met.cs665.email;

public class BusinessEmail implements EmailTemplate {
  @Override
  public String generateEmail() {
    return "Dear Business Customer, ...";
  }
}
