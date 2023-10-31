/**
 * Name: ALISA BELOUSOVA
 * Course: CS-665 Software Designs & Patterns
 * Date: 10/31/2023
 * File Name: EmailTemplate.java
 * Description: 
 * This interface defines a method `generateEmail` to generate an email message. 
 * Implementing classes will provide the specific implementation for each customer type.
 */

package edu.bu.met.cs665.email;

public interface EmailTemplate {
  String generateEmail();
}
