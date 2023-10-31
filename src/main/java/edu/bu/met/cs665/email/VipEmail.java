/**
 * Name: ALISA BELOUSOVA
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: VIPEmail.java
 * Description: 
 * This class represents the email template for VIP customers. 
 * It implements the `EmailTemplate` interface and provides the specific implementation 
 * for generating an email message tailored to VIP customers.
 */

package edu.bu.met.cs665.email;

public class VipEmail implements EmailTemplate {
  @Override
  public String generateEmail() {
    return "Dear VIP Customer, ...";
  }
}
