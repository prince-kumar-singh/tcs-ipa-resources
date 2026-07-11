# Java Assessment Test 1

## Question 2

Create a class Player with below attributes:

- playerld - int
- playerName - String
- runs - int
- playerType - String
- matchType - String

The above attributes should be private, write getters, setters and parameterized constructor as required.

Create class Solution with main method.

Implement two static methods **findPlayer WithLowestRuns** and **findPlayerByMatchType** in Solution class.

### findPlayer WithLowestRuns method:

This method will take array of Player objects and a String value as input parameters.

The method will return the least runs of the Player from array of Player objects for the given player typc. (String parameter passed). If no Player with the above condition are present in array of Player objects, then the method should return 0.

### findPlayerByMatch Type method:

This method will take array of Player objects and String value as input parameters and return the array of Player objects belonging to the match type passed as input parameter in Descending order of playerld.

If no Player with the above condition are present in the array of Player objects, then the method should return null.

**Note:** No two Players will have the same playerId and runs. All the searches should be case insensitive.

The above mentioned static methods should be called from the main method.

For **findPlayer WithLowestRuns** method - The main method should print the returned runs as it is if the returned value is greater than 0 or it should print **"No such player"**.

Eg:
```
25
```

where **25** is the lowest runs of the Player.

For **findPlayerByMatchType** method - The main method should print the **playerId** from the returned Player array for each Player if the returned value is not null.

If the returned value is null then it should print **"No Player with given matchType"**.

Eg:
```
13
11
```

where **13** and **11** are the playerId's.

Before calling these static methods in main, use Scanner object to read the values of four Player objects referring attributes in the above mentioned attribute sequence.

Next, read the value of two String parameter for capturing player type and match Type.

### Consider below sample input and output:

#### Input 1:
```
11
Sachin
100
International
One day
12
Shewag
133
International
Test
13
Varun
78
State
Test
14
Ashwin
67
State
One day
State
One day
```

#### Output:
```
67
14
11
```

#### Input 2:
```
11
Sachin
100
International
One day
12
Shewag
133
International
Test
13
Varun
78
State
Test
14
Aahwin
67
State
One day
District
T20
```

#### Output:
```
No such player
No Player with given matchType
```

### Sample code snippet for reference:

Please use below code to build your Solution.

```java
import java.util.Scanner;

public class Solution
{
    public static void main(String[] args)
    {
        //code to read values

        //code to call required method

        //code to display the result
    }

    //code the first method

    //code the second method
}

//code the class
```

### Note on using Scanner object:

Sometimes scanner does not read the new line character while invoking methods like `nextInt()`, `nextDouble()` etc.

---

# Solution

```java
import java.util.*;

class Player {
    private int playerId;
    private String playerName;
    private int runs;
    private String playerType;
    private String matchType;

    public Player(int playerId, String playerName, int runs,
                  String playerType, String matchType) {
        this.playerId = playerId;
        this.playerName = playerName;
        this.runs = runs;
        this.playerType = playerType;
        this.matchType = matchType;
    }

    public int getPlayerId() {
        return playerId;
    }

    public void setPlayerId(int playerId) {
        this.playerId = playerId;
    }

    public String getPlayerName() {
        return playerName;
    }

    public void setPlayerName(String playerName) {
        this.playerName = playerName;
    }

    public int getRuns() {
        return runs;
    }

    public void setRuns(int runs) {
        this.runs = runs;
    }

    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }

    public String getMatchType() {
        return matchType;
    }

    public void setMatchType(String matchType) {
        this.matchType = matchType;
    }
}

public class MyClass {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Player[] players = new Player[4];

        for (int i = 0; i < 4; i++) {

            int playerId = sc.nextInt();
            sc.nextLine();

            String playerName = sc.nextLine();

            int runs = sc.nextInt();
            sc.nextLine();

            String playerType = sc.nextLine();

            String matchType = sc.nextLine();

            players[i] = new Player(
                    playerId,
                    playerName,
                    runs,
                    playerType,
                    matchType
            );
        }

        String searchPlayerType = sc.nextLine();
        String searchMatchType = sc.nextLine();

        int lowestRuns =
                findPlayerWithLowestRuns(players, searchPlayerType);

        if (lowestRuns > 0) {
            System.out.println(lowestRuns);
        } else {
            System.out.println("No such player");
        }

        Player[] result =
                findPlayerByMatchType(players, searchMatchType);

        if (result != null) {

            for (Player p : result) {
                System.out.println(p.getPlayerId());
            }

        } else {
            System.out.println("No Player with given matchType");
        }

        sc.close();
    }

    public static int findPlayerWithLowestRuns(
            Player[] players, String playerType) {

        int minRuns = Integer.MAX_VALUE;
        boolean found = false;

        for (Player p : players) {

            if (p.getPlayerType().equalsIgnoreCase(playerType)) {

                if (p.getRuns() < minRuns) {
                    minRuns = p.getRuns();
                }

                found = true;
            }
        }

        if (found) {
            return minRuns;
        }

        return 0;
    }

    public static Player[] findPlayerByMatchType(
            Player[] players, String matchType) {

        int count = 0;

        for (Player p : players) {

            if (p.getMatchType().equalsIgnoreCase(matchType)) {
                count++;
            }
        }

        if (count == 0) {
            return null;
        }

        Player[] result = new Player[count];

        int index = 0;

        for (Player p : players) {

            if (p.getMatchType().equalsIgnoreCase(matchType)) {
                result[index++] = p;
            }
        }

        // Sort by playerId in descending order
        for (int i = 0; i < result.length - 1; i++) {

            for (int j = i + 1; j < result.length; j++) {

                if (result[i].getPlayerId()
                        < result[j].getPlayerId()) {

                    Player temp = result[i];
                    result[i] = result[j];
                    result[j] = temp;
                }
            }
        }

        return result;
    }
}
```