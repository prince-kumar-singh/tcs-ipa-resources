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