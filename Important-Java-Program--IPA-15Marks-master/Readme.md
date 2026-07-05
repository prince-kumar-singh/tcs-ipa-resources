# 🚀 Important Java Programs - IPA (15 Marks)

This sub-repository contains **76 beginner-friendly Java programs** targeting the **TCS Xplore IPA 15-Marks Assessment**. These exercises focus on building fundamental coding competency, writing clean loop logic, solving arithmetic queries, and parsing strings.

---

## 📌 Exam Section Overview
The **15-Marks Coding Question** in the TCS IPA exam is designed to test your core programming fundamentals in Java. It usually requires:
- Basic input parsing using the `Scanner` class.
- Basic conditional blocks (`if-else`, `switch`) and iterative loops (`for`, `while`).
- Simple algorithm execution (e.g., searching, sorting, counting, reversing).
- Expected Completion Time: **15 - 20 minutes**.

---

## 📂 Categorized Practice Catalogue

All source files are located in the [`src/`](./src) directory. Below is a thematic index of the programs:

### 🔤 1. String Manipulation & Parsing
These scripts cover counting patterns, modifying characters, extracting sequences, and formatting string values.

* **Counting & Statistics**:
  * [`Count_LowerCase.java`](./src/Count_LowerCase.java) & [`Count_UpperClass.java`](./src/Count_UpperClass.java) - Counts case-specific letters.
  * [`Find_the_Count_of_Vowels_Consonants_and_Digits_in_a_String.java`](./src/Find_the_Count_of_Vowels_Consonants_and_Digits_in_a_String.java) - Comprehensive character classification.
  * [`Count_the_number_of_spaces_in_a_string.java`](./src/Count_the_number_of_spaces_in_a_string.java) - Space counter.
  * [`Consecutive_two_vowels.java`](./src/Consecutive_two_vowels.java) - Finds words containing adjacent vowels.
  * [`Count_Words_Start_and_End_with_Same_letter.java`](./src/Count_Words_Start_and_End_with_Same_letter.java) - Checks prefix/suffix character match.

* **Reversal, Sorting & Search**:
  * [`Reverse_the_String.java`](./src/Reverse_the_String.java) & [`Reverse_the_words_in_a_String.java`](./src/Reverse_the_words_in_a_String.java) - Reversal algorithms.
  * [`Anagram.java`](./src/Anagram.java) - Checks if two strings are anagrams.
  * [`Palindrome_In_String.java`](./src/Palindrome_In_String.java) - Checks if a string reads the same backward.
  * [`First_NonRepeated_Char.java`](./src/First_NonRepeated_Char.java) - Finds unique characters in sequence.

* **String Filtering & Duplication**:
  * [`Remove_Vowel.java`](./src/Remove_Vowel.java) - Vowel deletion.
  * [`Remove_the_Duplicate_Character_From_the_String.java`](./src/Remove_the_Duplicate_Character_From_the_String.java) - De-duplicates sequence.

---

### 🔢 2. Number Theory & Core Mathematics
Programs related to prime checks, series generation, and basic statistical computations.

* **Sequence & Series**:
  * [`Fibonacci.java`](./src/Fibonacci.java) - Fibonacci sequence printer.
  * [`CountPrime.java`](./src/CountPrime.java) - Counts prime numbers within a range.
  * [`Sum_Prime_Digit.java`](./src/Sum_Prime_Digit.java) - Sums the digits of a number that are prime.

* **Perfect & Armstrong Validations**:
  * [`ArmStong.java`](./src/ArmStong.java) - Validates Armstrong criteria.
  * [`Find_the_given_number_is_perfect_number.java`](./src/Find_the_given_number_is_perfect_number.java) - Checks if a number equals the sum of its proper divisors.
  * [`Perfect_Square_Or_Not.java`](./src/Perfect_Square_Or_Not.java) - Square validation.

* **Summations & Averages**:
  * [`Average.java`](./src/Average.java) - General average calculator.
  * [`Sum_of_Even_Digit.java`](./src/Sum_of_Even_Digit.java) - Sums even components of a larger integer.

---

### 📊 3. Matrix Operations & Array Algorithms
Complex array storage, multi-dimensional structures, and sorting datasets.

* [`MaximumPrimeInDiagonalMatrix.java`](./src/MaximumPrimeInDiagonalMatrix.java) - Scans diagonal cells in a matrix to isolate the highest prime value.
* [`Sorting_Name.java`](./src/Sorting_Name.java) - Sorts array elements alphabetically.
* [`Intersection_of_set.java`](./src/Intersection_of_set.java) - Extracts shared values between two integer arrays.

---

## 🛠️ Compilation & Local Testing
To test any script locally, open your command-line workspace and run the standard SDK commands:

```bash
# Navigate to source folder
cd src

# Compile the target file
javac Anagram.java

# Run program
java Anagram
```

Make sure to provide inputs in the terminal prompt as defined in the standard program parameters.
