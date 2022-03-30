Feature: perform a google search

Scenario Outline: Simple keyword search

Given i am on google homepage
When i enter a search "<keyword>"
And i click on search button
Then I see the number of results return

Examples:

|Keyword               |
|Quality Assurance     |
|Software Testing      |