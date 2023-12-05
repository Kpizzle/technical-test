Questions - 

- Is there a string Max Length?
- is there a string Min Length?
- What should happen with special Chars
- What should happen with Numbers
- Are we catering for non english languages
- what is supposed to happen when no strings are passed into the application

Acceptance Criteria - 
- AC01 - PASSED
- AC02 - FAILS - User is unable to enter 4 strings. 

Defects found - 
- user is unable to enter 4 strings (can provide fix)
- When just numbers they are still included in the word count, but are not valid words
- When just special chars they are still included in the word count, but are not valid words
- Input is case-sensitive, so capital letters are not counted (can provide fix) 

improvements to consider - 
- getVowelListWithCount method should return a clearer error message informing the user of the issue
- when no strings are passed update the logic to advise the user that they need to pass in a min of one string
- If no valid words are provided we should advise the user to enter only valid words
- in the output maybe we should include a total word count? 
- In the output should we add total vowels and consonants?

Other Notes - 

I'm afraid I don't really have experience writing unit tests or i'm unsure how to write command line automated tests. 
But I've provided the tests cases I would use for testing this. 

Test Cases - More Test cases can be added depending on the outcome of questions sent to the product owner

Feature: Vowel and Consonant Counter

Scenario: Count vowels and consonants for a single word
Given the application is running
When I provide the word "hello"
Then the result should be "[CountResult{word='hello', vowelCount=2, consonantCount=3}]"

Scenario: Count vowels and consonants for multiple words
Given the application is running
When I provide the words "hello world"
Then the result should be "[CountResult{word='hello', vowelCount=2, consonantCount=3}, CountResult{word='world', vowelCount=1, consonantCount=4}]"

Scenario: Count vowels and consonants for an empty string
Given the application is running
When I provide an empty string
Then the result should be "[]"

Scenario: Count vowels and consonants for four words
Given the application is running
When I provide the words "apple banana cherry date"
Then the result should be "[CountResult{word='hello', vowelCount=2, consonantCount=3}, CountResult{word='world', vowelCount=1, consonantCount=4}, CountResult{word='test', vowelCount=1, consonantCount=3}, CountResult{word='data', vowelCount=2, consonantCount=2}]"

Scenario: Count vowels and consonants for greater than four strings
Given the application is running
When I provide an empty string
Then the result should be "Extra arguments passed."

Scenario: Count only vowels
Given the application is running
When I provide the world "aeiou"
Then the result should be "[CountResult{word='aeiou', vowelCount=5, consonantCount=0}]"

Scenario: Count only consonants
Given the application is running
When I provide the world "bcdfg"
Then the result should be "[CountResult{word='bcdfg', vowelCount=0, consonantCount=5}]"

