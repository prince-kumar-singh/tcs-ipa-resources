# ☕ TCS Integrated Practice Assessment (IPA) - Java Preparation Hub

Welcome to the **TCS IPA Java Practice Repository**! This folder is dedicated to helping Java developers ace their TCS Integrated Practice Assessment (IPA) exam. It contains correct, structured, and compiled Java solutions categorized by complexity and scoring marks.

---

## 🌟 Repository Overview

The preparation files are structured into two distinct sections:

1. **🏆 TCS iON Explore Portal Solutions (`/ipa-practice-explore-site`)**
   * These solutions correspond to the official practice questions available directly on the TCS iON portal: `Explore > Common Announcements > IPA Practice`.
   * Features solved questions for **Assessment Test 1, 2, and 3** broken down into **15-mark & 35-mark** structures.
   * Access the dedicated sub-README: **[Explore Site README](./ipa-practice-explore-site/README.md)**.
   
2. **📁 General Practice Questions (`/quest1` to `/quest8` + `/CharFrequency`)**
   * Intermediate-level OOP programming questions covering course registration, employee travel trackers, hotel services, car diagnostics, cricket stats, and agricultural systems.
   * Focuses on coding constructs commonly asked in actual live assessments (array of custom objects, nested iteration, and filtering).

---

## 📂 Navigation & Assessment Catalog

### 1. TCS iON Explore Portal Practice Quest Solutions

These solutions are tailored to exact portal instructions where the primary class must be named **`MyClass`**.

| Quest Name | Marks | Topics & Focus Area | Problem Details | Source Code |
| :--- | :---: | :--- | :---: | :---: |
| **Quest 1 (Test 1)** | **15** | Average of elements between custom range | [Question](./ipa-practice-explore-site/quest1/15marks/README.md) | [MyClass.java](./ipa-practice-explore-site/quest1/15marks/MyClass.java) |
| **Quest 1 (Test 1)** | **35** | Player lowest runs & match type filter | [Question](./ipa-practice-explore-site/quest1/35marks/README.md) | [MyClass.java](./ipa-practice-explore-site/quest1/35marks/MyClass.java) |
| **Quest 2 (Test 2)** | **15** | Sum of digits is multiple of 3 | [Question](./ipa-practice-explore-site/quest2/15marks/README.md) | [MyClass.java](./ipa-practice-explore-site/quest2/15marks/MyClass.java) |
| **Quest 2 (Test 2)** | **35** | Laptop query by brand & OS (descending ID sort) | [Question](./ipa-practice-explore-site/quest2/35marks/README.md) | [MyClass.java](./ipa-practice-explore-site/quest2/35marks/MyClass.java) |
| **Quest 3 (Test 3)** | **15** | Sum of odd numbers in range (sign preserved) | [Question](./ipa-practice-explore-site/quest3/15marks/README.md) | [MyClass.java](./ipa-practice-explore-site/quest3/15marks/MyClass.java) |
| **Quest 3 (Test 3)** | **35** | Hotel total monthly booking & second highest bill | [Question](./ipa-practice-explore-site/quest3/35marks/README.md) | [MyClass.java](./ipa-practice-explore-site/quest3/35marks/MyClass.java) |

### 2. General Practice Problems (15 & 35 Marks Mix)

These challenges focus on object arrays, advanced filters, getters/setters/constructors, and descending/ascending order calculations.

| Question Index | Problem Core Concept | Problem Description | Solution Code |
| :---: | :--- | :---: | :---: |
| **Warmup** | Character Frequency Using HashMaps | [N/A (Simple task)]() | [Main.java](./CharFrequency/Main.java) |
| **Quest 1** | Course average calculation & sorting by attributes | [question.md](./quest1/question.md) | [Main.java](./quest1/Main.java) |
| **Quest 2** | Employee findingTransport & second highest rating seeker | [qust2.txt](./quest2/qust2.txt) | [Main.java](./quest2/Main.java) |
| **Quest 3** | Hotel matching wifi availability in a specific month | [Qust.txt](./quest3/Qust.txt) | [Main.java](./quest3/Main.java) |
| **Quest 4** | Car diagnostic metrics relative to test environments | [quest.txt](./quest4/quest.txt) | [Main.java](./quest4/Main.java) |
| **Quest 5** | SIM cards listing, sorting by balance & checking circle | [question.md](./quest5/question.md) | [Main.java](./quest5/Main.java) |
| **Quest 6** | Cricket Player performance tracker by match average | [question.md](./quest6/question.md) | [Main.java](./quest6/Main.java) |
| **Quest 7** | Composite Person model (Student & Faculty salary/GPA stats) | [Question.md](./quest7/Question.md) | [Main.java](./quest7/Main.java) |
| **Quest 8** | Vegetable processing (second minimum price filter & sort) | [question.md](./quest8/question.md) | [Main.java](./quest8/Main.java) |

---

## 💡 Top 5 Coding Pitfalls to Avoid in TCS IPA

### 1. Naming Guidelines
Always match the naming exactly as mentioned.
* If the description says `MyClass`, do not name it `Solution` or `Main`.
* Keep the main driver file as `public class MyClass`. Additional entity classes should not be public and must be included in the same file.

### 2. Clearing Scanner Buffer
When scanning numerical inputs followed by a string input using `nextLine()`, you must flush the remaining newline symbol from the stream.
```java
int size = sc.nextInt();
sc.nextLine(); // Critical flush call
String value = sc.nextLine();
```

### 3. Case Insensitivity
Ensure all string matching queries (like brand name, os type, wifi choice) use `.equalsIgnoreCase()` rather than `.equals()`.

### 4. Null Checks
Always verify if any query returned a `null` array/object before trying to access its elements. Trying to read attributes of a null object throws a `NullPointerException` and results in test case failures.

### 5. Sorting Array of Objects
In TCS IPA, you often need to sort selected elements. Use simple sorting algorithms (like Bubble Sort or Selection Sort) or `Arrays.sort` with custom comparators, but keep it basic to avoid logic bugs.
```java
// Descending sort based on Id
for (int i = 0; i < array.length - 1; i++) {
    for (int j = i + 1; j < array.length; j++) {
        if (array[i].getId() < array[j].getId()) {
            CustomObject temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
    }
}
```

---

## 🧪 How to run

Ensure you have the JDK installed correctly on your system.

```bash
# Navigate to the chosen quest, for instance:
cd ipa-practice-explore-site/quest1/15marks/

# Compile
javac MyClass.java

# Run
java MyClass
```
pasting test inputs directly into the standard input stream when requested.
