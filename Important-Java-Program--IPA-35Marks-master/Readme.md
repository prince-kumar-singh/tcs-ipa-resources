# 🚀 Important Java Programs (35 Marks) for TCS Xplore IPA Exam

This sub-repository contains comprehensive, object-oriented Java solutions for the **TCS Xplore IPA 35-Marks Coding Assessment**. The exercises cover multi-tiered class architecture, standard array filtering, business logic validation, and object sorting algorithms.

---

## 📌 Exam Section Overview
The **35-Marks Coding Question** is the core component of the TCS IPA exam. It tests your intermediate object-oriented design and processing skills. 

A standard 35-marks problem requires you to:
1. **Define a Custom Entity Class**:
   - 4 to 6 attributes of diverse types (e.g., `int`, `String`, `double`, `boolean`).
   - Private access modifiers for all fields.
   - A parameterized constructor to initialize all values.
   - Getter and Setter methods for all variables.
2. **Implement a Driver Class** (containing the `main` method):
   - Instantiate an array of objects of the Entity Class by parsing console inputs using `Scanner`.
   - Read supplementary query parameters from the console.
   - Call two static helper methods to process the data.
3. **Write Two Static Query Methods**:
   - **Method 1**: Performs mathematical calculations or aggregations (e.g. average, sum, minimum) based on a search parameter. Returns a primitive or helper type.
   - **Method 2**: Filters and sorts objects based on a criteria parameter. Returns an array of objects or a single matching object.
4. **Handle Edge Cases**:
   - Print appropriate failure messages (e.g., `"No Course found."` or `"No Course found with mentioned attributes."`) if the search methods return `0` or `null`.

Expected Completion Time: **40 - 50 minutes**.

---

## 📂 Repository Contents

### 1. Main Course Programs
These directories contain standard model programs based on the official TCS preparation track:

* 📂 [`IPA1 - Course Program`](./IPA1%20-%20Course%20Program) - Evaluates course objects, computes averages of quiz questions by admin, and sorts by hands-on values.
* 📂 [`IPA2 - Footwear Program`](./IPA2%20-%20Footwear%20Program) - Processes footwear inventory and matches elements by price and type.
* 📂 [`IPA3 - Scholar Student Program`](./IPA3%20-%20Scholar%20Student%20Program) - Manages student details and calculates scholarship tier levels.
* 📂 [`IPA4 - College Program`](./IPA4%20-%20College%20Program) - Filters colleges by seat capacity and location.
* 📂 [`IPA42 - Student and Faculty Program`](./IPA42%20-%20Student%20and%20Faculty%20Program) - Represents inheritance models between students and academic staff.
* 📂 [`IPA5 - Hotel Program`](./IPA5%20-%20Hotel%20Program) - Filters hotels by cab facility and rating.
* 📂 [`IPA6 - Rapid Response Team Program`](./IPA6%20-%20Rapid%20Response%20Team%20Program) - Coordinates disaster relief units based on proximity coordinates.
* 📂 [`IPA7 - Sim Program`](./IPA7%20-%20Sim%20Program) - Manages data balance and tariff plans for cellular accounts.
* 📂 [`IPA8 - Hotel Program 2`](./IPA8%20-%20Hotel%20Program%202) - Extended reservation scheduling.

---

### 2. Extra Practice Portal (55+ Tasks)
**Directory**: [`Extra/`](./Extra)  
This folder hosts direct exam-style mock questions and answers. Each task contains a problem description text file (`Question.txt`) and a fully functional source script (`Solution.java` or `Solution-Name.java`).

* **High-Yield Practice Areas**:
  * **Employee Salary Matching**: Finding the 2nd lowest salary, grouping employees by location, calculating bonuses.
  * **Inventory Systems**: Managing book catalogs, filtering medicine by expiry date, matching phone items.
  * **Media Portals**: Managing movie details, sorting players by ranking, rating channels.

---

## 💡 Important Coding Conventions & Tips

> [!TIP]
> **Reading String Inputs**:
> When using `Scanner` to read integers followed by strings, always clear the input buffer.
> ```java
> int num = sc.nextInt();
> sc.nextLine(); // Consumes the remaining newline character
> String str = sc.nextLine();
> ```

> [!TIP]
> **Object Sorting**:
> Use `Comparable` or standard custom bubble sorting loops on object arrays based on target properties.
> ```java
> // Simple custom bubble sort on Courses array based on handsOn field
> for(int i=0; i<courses.length-1; i++) {
>     for(int j=0; j<courses.length-i-1; j++) {
>         if(courses[j].getHandsOn() > courses[j+1].getHandsOn()) {
>             Course temp = courses[j];
>             courses[j] = courses[j+1];
>             courses[j+1] = temp;
>         }
>     }
> }
> ```

---

## 🛠️ Prerequisites & Local Execution
Ensure you have Java JDK (version 8 or above) installed. Open any subfolder containing the `Main.java` or `Solution.java` files and execute in your terminal:

```bash
# Navigate to program source
cd "IPA1 - Course Program/src"

# Compile class files
javac Main.java

# Run class file
java Main
```
Provide the inputs line-by-line as defined in the companion `Question` files.
