
🚀 Sauce Demo Automation Framework
👤 Author

Hadia Saqib

📌 Project Overview

This project is an automation testing framework for the
👉 Sauce Demo application

It is built using:

Cucumber

Selenium

Java

Maven

The framework follows Behavior Driven Development (BDD) using Gherkin syntax.

🎯 Features

Login functionality testing

Positive and negative test scenarios

BDD-style test cases using feature files

Automation using Selenium WebDriver

Test execution using JUnit

HTML and JSON report generation

🧪 Test Scenarios Covered

Valid login

Invalid login

Locked user login

Empty username

Empty password

📁 Project Structure
src
└── test
    ├── java
    │   ├── stepDefinitions
    │   └── runners
    └── resources
        └── features
            └── login.feature

pom.xml
⚙️ Prerequisites

Java installed

Maven installed

IntelliJ IDEA or Eclipse

Chrome browser

ChromeDriver (matching your browser version)

🚀 How to Run
1. Clone the repository
git clone https://github.com/HadiaSaqib/sauce-demo-automation.git
2. Open project in IntelliJ IDEA

👉 Use IntelliJ IDEA

3. Install dependencies
mvn clean install
4. Run Tests

Run TestRunner.java

OR click Run button in IntelliJ

📊 Reports

Reports are generated in:

target/

Open the HTML report:

target/report.html
🧠 Concepts Used

BDD (Behavior Driven Development)

Gherkin Language

Selenium WebDriver

Test Automation concepts

Page Object Model (optional)

📌 Future Improvements

Add more test scenarios

Integrate CI/CD (GitHub Actions / Jenkins)

Add cross-browser testing

Integrate with Jira for test management

