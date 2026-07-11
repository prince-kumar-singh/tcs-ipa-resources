# Java Assessment 3

## Question 1

Write main method in the Solution class.

In the main method, read five values for an integer array. The main method should print the sum of odd numbers from the array of integers only if the sum value is greater than 8 and less than 50. Else it should print **"NA"**.

For example, if the values are 1,2,3,5,7 the sum of odd numbers should be printed as 16. As in the array, 1,3,5,7 are odd numbers so their sum is 16(1+3+5+7) which is greater than 8 and less than 50. The output should be in the format of sample output.

**Note:** Sum of integers is based on their sign(+ or -)

Example: If two numbers are 11 and -18, their sum will be -7.

---

## Sample input1:
```
1
2
3
5
7
```

## Output:
```
Sum of odd numbers:16
```

---

## Sample input2:
```
1
2
3
4
8
```

## Output:
```
NA
```

---

## Sample code snippet for reference:

Please use below code to build your solution.

```java
public class Solution

public static void main(String[] args)

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

        int[] arr = new int[5];
        int sum = 0;

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();

            if (arr[i] % 2 != 0) {
                sum = sum + arr[i];
            }
        }

        if (sum > 8 && sum < 50) {
            System.out.println("Sum of odd numbers:" + sum);
        } else {
            System.out.println("NA");
        }

        sc.close();
    }
}
```