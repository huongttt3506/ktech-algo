package practices;

import java.util.HashMap;
import java.util.Map;

// https://school.programmers.co.kr/learn/courses/30/lessons/178871
public class Solution178871 {

    // 시간 초과
    public String[] solution(String[] players, String[] callings) {
        for (String calling : callings) {
            for (int i = 0; i < players.length; i++) {
                if (calling.equals(players[i])) {
                    String temp = players[i];
                    players[i] = players[i-1];
                    players[i-1] = temp;
                    break;
                }
            }
        }
        return players;
    }
    //Use hashmap
    public String[] solution1(String[] players, String[] callings) {
        //Create a hashmap to track the position of each player
        Map<String, Integer> playerPositions = new HashMap<>();
        for (int i = 0; i < players.length; i++) {
            playerPositions.put(players[i], i);
        }
        // Process each calling
        for (String calling : callings) {
            int currentPosition = playerPositions.get(calling);
            if (currentPosition > 0) {
                // Swap positions with the player in front
                String playerInFront = players[currentPosition - 1];
                players[currentPosition - 1] = calling;
                players[currentPosition] = playerInFront;

                //Update the positions in hashmap
                playerPositions.put(calling, currentPosition - 1);
                playerPositions.put(playerInFront, currentPosition);

            }
        }
        return players;
    }
}
