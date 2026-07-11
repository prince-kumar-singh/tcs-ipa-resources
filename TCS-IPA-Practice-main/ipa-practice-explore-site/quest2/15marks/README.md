# Java Assessment Test 2

## Question 1

Write main method in Solution class.

In the main method, read an integer (containing only numeric digits without decimal and special characters) and check whether the sum of its digits is in multiple of 3.

If the given input is in multiple of 3, then print TRUE(as a String) else print FALSE(as a String).

For example if the given value is 333, 3+3+3 is 9, which is multiple of 3, hence TRUE has to be printed.

---

## Sample input1:
```
333
```

## Output:
```
TRUE
```

---

## Sample input2:

### Input:
```
200
```

### Output:
```
FALSE
```

---

## Sample code snippet for reference:

Please use below code to build your solution.

```java
public class Solution {

    public static void main(String[] args)

    {

        //code to read values

        //code to display the result

    }

}
```

---

## Instruction:

Kindly mention class name as **MyClass**.

---

# Solution

```java
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int sum = 0;

        while (num > 0) {
            int digit = num % 10;
            sum = sum + digit;
            num = num / 10;
        }

        if (sum % 3 == 0) {
            System.out.println("TRUE");
        } else {
            System.out.println("FALSE");
        }

        sc.close();
    }
}
```