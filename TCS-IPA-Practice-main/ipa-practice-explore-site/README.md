# 🎯 TCS iON Explore Portal - IPA Practice Solutions

This directory contains solutions to the official practice programming questions provided by the **TCS iON Explore portal** under the path:
`Explore > Common Announcements > IPA Practice`.

These practice questions mimic the actual format and structure of the **TCS Initial Learning Program (ILP) Internal IPA (Integrated Practice Assessment) exam**.

---

## 📅 Roadmap & Quick Navigation

The practice assessments are structured into **3 Tests**. Each test consists of a **15 Marks** basic problem and a **35 Marks** complex Object-Oriented Programming (OOP) problem.

| Test Series | Marks | Problem Title & Description | Key Java Concepts | Codes & Questions |
| :---: | :---: | :--- | :--- | :---: |
| 🛡️ **Test 1** | **15 Marks** | **Average of Elements within Range**<br>Find the average of numbers greater than `limit1` and less than `limit2`. | Array iteration, arithmetic logic, boundary conditions. | [📝 Question & Sol](./quest1/15marks) \| [☕ MyClass.java](./quest1/15marks/MyClass.java) |
| 🛡️ **Test 1** | **35 Marks** | **Player Lowest Runs & Match Type**<br>Model players, find the lowest runs for a type, and list players by match type in descending order of ID. | Custom objects array, Case-insensitive sorting, lowest-value extraction. | [📝 Question & Sol](./quest1/35marks) \| [☕ MyClass.java](./quest1/35marks/MyClass.java) |
| 🛡️ **Test 2** | **15 Marks** | **Multiple of 3 (Sum of Digits)**<br>Verify if the sum of all digits of an input integer is a multiple of 3. | Digit extraction, modulo arithmetic, string outputs. | [📝 Question & Sol](./quest2/15marks) \| [☕ MyClass.java](./quest2/15marks/MyClass.java) |
| 🛡️ **Test 2** | **35 Marks** | **Laptop filter by Brand & OS search**<br>Filter laptops by brand and rating; sort & search laptops by OS type in descending order of ID. | Nested loop selection sort, object filtration, getters/setters. | [📝 Question & Sol](./quest2/35marks) \| [☕ MyClass.java](./quest2/35marks/MyClass.java) |
| 🛡️ **Test 3** | **15 Marks** | **Sum of Odd Numbers**<br>Sum all odd numbers within an integer array if the sum lies in the range `(8, 50)`, else output `"NA"`. | Conditional array accumulation, sign retention (`+` / `-`). | [📝 Question & Sol](./quest3/15marks) \| [☕ MyClass.java](./quest3/15marks/MyClass.java) |
| 🛡️ **Test 3** | **35 Marks** | **Hotel Wifi & Monthly Bookings selector**<br>Calculate rooms booked in a month (date format: `dd-mon-yyyy`) and find hotel with the **second highest** bill. | String splitting/parsing, second-largest value tracking. | [📝 Question & Sol](./quest3/35marks) \| [☕ MyClass.java](./quest3/35marks/MyClass.java) |

---

## 💡 Crucial Guidelines for TCS IPA

When deploying solutions on the TCS iON portal, pay extra attention to these technical rules:

### 1. Main Class Configuration 🏷️
* **Class Name:** You must name your executable class exactly **`MyClass`** (case-sensitive) unless the problem description specifies otherwise.
* Keep all helper/model classes (e.g. `Player`, `Laptop`, `Hotel`) in the same file as non-public classes.
* Only the `MyClass` can be `public`.

### 2. Scanner Buffer Handling (NextLine Issue) ⚠️
* A common pitfall in TCS assessments is that `Scanner.nextInt()` or `Scanner.nextDouble()` leaves a residual newline character (`\n`) in the input buffer.
* Consecutive calls to `Scanner.nextLine()` will immediately absorb that residual newline instead of reading the intended string.
* **Resolution:** Ensure you call `sc.nextLine()` immediately after reading any non-string numeric element to clear the buffer.
  ```java
  int x = sc.nextInt();
  sc.nextLine(); // Clear buffer
  String name = sc.nextLine(); // Reads correctly
  ```

### 3. Handling Null/Zero Results 🛑
* Every 35-mark question requires custom error text when no matches are found (e.g., `"No such player"`, `"No Player with given matchType"`, or `"The given brand is not available"`).
* Always verify the return value (usually `null` or `0` for arrays/primitives) before calling outputs.

---

## 🛠️ Compiling & Executing Solutions Locally

Follow these commands to test code correctness with compiler compliance.

1. **Compile:**
   ```bash
   javac MyClass.java
   ```
2. **Execute:**
   ```bash
   java MyClass
   ```
3. **Providing Input:** Paste the sample inputs from the corresponding quest folders into your command line stream.
