# 6.1 String Manipulation Methods 

Your task is to implement four static methods that perform different string manipulations: reverse a string, test if a string is a palindrome, convert a string to Pig Latin, and create a shorthand version of a string using text abbreviations. Each method must be properly defined, and example function calls with expected outputs are provided for guidance.

#### 1. **Reverse a String** 
Write a method `reverseString(String input)` that returns the reversed version of the given string.

**Example**:
```java
reverseString("hello"); // returns "olleh"
reverseString("Java");  // returns "avaJ"
```
<br></br>
---
#### 2. **Palindrome Check**
Write a method `isPalindrome(String input)` that checks if the given string is a palindrome. A palindrome reads the same forwards and backwards.

**Example**:
```java
isPalindrome("never odd or even");  // returns true
isPalindrome("java");   // returns false
```
<br></br>
---
#### 3. **Pig Latin Conversion**
Write a method `convertToPigLatin(String input)` that converts a given word to Pig Latin. The rules for Pig Latin are as follows:

- **Words That Begin With a Consonant**: Move the first consonant to the end of the word and add "-ay."
  - Example: `"dog"` becomes `"ogday"`
  
- **Words That Begin With a Consonant Cluster**: Move the first consonant cluster (e.g., "pl" in "plant") to the end and add "-ay."
  - Example: `"plants"` becomes `"antsplay"`
  
- **Words That Begin With a Vowel**: Simply add the suffix "-yay" to the end of the word.
  - Example: `"am"` becomes `"amyay"`
  
- **Special Case: Words Without Vowels**: For words that contain no vowels (e.g., "rhythm"), treat the entire word as a consonant cluster. Move all the letters to the end and add "-ay."
  - Example: `"rhythm"` becomes `"rhythmay"`
  
**Example**:
```java
convertToPigLatin("Can you help me?");       // returns "Ancay ouyay elphay emay?"
convertToPigLatin("Am I winning?");     // returns "Amyay Iyay inningway?"
```
<br></br>
---
#### 4. **Shorthand Conversion**
Write a method `convertToShorthand(String input)` that replaces certain words in the string with abbreviations:

- Replace "you" with "u"
- Replace "and" with "&"
- Replace "to" with "2"
- Replace "for" with "4"
- Remove vowels from other words unless it’s the first letter.

**Example**:
```java
convertToShorthand("Are you going to the park for fun and games?");
// returns "Ar u gng 2 th prk 4 fn & gms?"
```


