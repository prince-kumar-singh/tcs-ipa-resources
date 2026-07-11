# Xplore Practice IPA - Question Papers_2026

## Java Assessment Test 1

### Question 1

Write main method in Solution class.

In the main method, read five values for an integer array and two int value which are the limits (limit1 and limit2). The main method should print the average of integer values which are greater than limitl and less than limit2.

For example if the values are 1,2,3,4,5 and the limits are 2 and 6 then the average is 4((3+4+5)/3). The output should be in the format of sample output.

Note: The returned average value should be of int data type.

### Sample input1:
```
1
2
3
4
5
2
6
```

### Output:
```
4
```

### Sample input2:
```
100
200
300
400
500
100
500
```

### Output:
```
300
```

### Sample code snippet for reference:

Please use below code to build your solution.

```java
public class Solution
{
public static void main(String[] args)
//code to read values
//code to display the result
}
}
```

### Instruction

Kindly mention class name as **MyClass**

---

# Solution

```java
import java.util.Scanner;

public class MyClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = new int[5];

        for (int i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }

        int limit1 = sc.nextInt();
        int limit2 = sc.nextInt();

        int sum = 0;
        int count = 0;

        for (int i = 0; i < 5; i++) {
            if (arr[i] > limit1 && arr[i] < limit2) {
                sum += arr[i];
                count++;
            }
        }

        if (count > 0) {
            int average = sum / count;
            System.out.println(average);
        }

        sc.close();
    }
}
```