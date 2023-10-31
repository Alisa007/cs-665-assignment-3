| CS-665       | Software Design & Patterns |
| ------------ | -------------------------- |
| Name         | ALISA BELOUSOVA            |
| Date         | 10/31/2023                 |
| Course       | Fall                       |
| Assignment # | 3                          |

# Assignment Overview

The primary objective of this assignment is to design and implement a system that can generate different email templates based on the type of customer. The system should be flexible enough to easily accommodate new types of customers and their corresponding email templates in the future.

# GitHub Repository Link:

https://github.com/alisa007/cs-665-assignment-3

# Implementation Description

The implementation provides a high level of flexibility for adding or removing new email templates. The `EmailFactory` class uses a switch statement to create instances of different email templates based on the customer type. This makes it easy to add new email templates by simply adding a new case to the switch statement and creating a new class that implements the `EmailTemplate` interface. Similarly, removing an email template is as straightforward as removing the relevant case from the switch statement and deleting the corresponding class.

The simplicity and understandability of the implementation are achieved through clear class names, straightforward method names, and a simple interface (`EmailTemplate`) that all email templates implement. Each email template class has a single responsibility, which is to generate an email message for a specific type of customer. This makes it easy for others to read and maintain the code, as the purpose and functionality of each class are clear and well-defined.

Duplicated code is avoided by having each email template class implement the `EmailTemplate` interface. This ensures that all email template classes provide a consistent method (`generateEmail()`) for generating email messages, while still allowing each class to have its own implementation. Avoiding duplicated code is important because it makes the codebase easier to maintain and reduces the risk of introducing bugs when making changes.

The implementation uses the Factory Method pattern, which is a creational design pattern that provides an interface for creating objects but allows subclasses to alter the type of objects that will be created. In this case, the `EmailFactory` class is the creator, and the different email template classes are the concrete products. The Factory Method pattern is chosen because it provides a simple and flexible way to create objects while encapsulating the creation logic in a single place. This makes it easy to add or remove email templates in the future without affecting the rest of the codebase.

## Compile

Type on the command line:

```bash
mvn clean compile
```

## JUnit Tests

To run, use the following command:

```bash
mvn clean test
```

## Spotbugs

Use the following command:

```bash
mvn spotbugs:gui 
```

## Checkstyle

The following command will generate a report in HTML format that you can open in a web browser.

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`
