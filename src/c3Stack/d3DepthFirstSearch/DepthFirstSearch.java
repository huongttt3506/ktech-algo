package c3Stack.d3DepthFirstSearch;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DepthFirstSearch {
    public static void main(String[] args) {
        int nodes = 7;
        String[] edges ={
                "1 2",
                "1 3",
                "2 4",
                "2 5",
                "3 7",
                "4 6",
                "5 6",
                "6 7"
        };
        //각 점이 열결되어 있는지를 판단하는 방법
        // 1. 이치원배열 int[] adjMap
        //adjMap[i][j] == 1 이면 i와 j가 열결되어 있다.
        int[][] adjMap = new int[nodes + 1][nodes + 1];
        //2. list list adjList
        //i 에 열결한 점들은 adjList.get(i)안ㅇㅔ 있다
        List<List<Integer>> adjList = new ArrayList<>();
        //1. 데이더 수집
        //1-1 주어진 edge 만큼 반복하며 edge 를 찾는다
        for (int i = 0; i < edges.length; i++) {
            // 6 7
            String edge = "6 7";
            //1-2 edge 에서 각 node 정조를 찾는다
            String[] edgeInfo = edge.split(" ");
            //left = Integer.parseInt("6");
            int left = Integer.parseInt(edgeInfo[0]);
            int right = Integer.parseInt(edgeInfo[1]);
            //1-3 adjMap 에 기록한다
            adjMap[left][right] = 1;
            adjMap[right][left] = 1;
        }

        //2. DFS 주비
        //2-1 다음 방문할 곳을 기록하가 위한 스택
        Stack<Integer> toVisit = new Stack<>();
        //2-2. 방문했다는 사실을 기록하기 위한 배열
        boolean[] visited = new boolean[nodes + 1];
        //2-3. 방문 순서를 기록하기 위한 리스트
        List<Integer> visitOrder = new ArrayList<>();

        //3. DFS 시작
        //3-1. 가장 먼저 방문할 곳을 toVisit에 추가
        toVisit.push(1);
        //3-2 toVisit가 비어있을 때 까지 반복한다
        while (!toVisit.empty()) {
            //3-3 다음 방문할 범을 pop 한다
            int now = toVisit.pop();
            //3-4 방문 여부를 visited 로 판단한다
            if (visited[now]) {
                continue;
            }
            // 방문 한적 없으면 방문표시
            visited[now] = true;
            //3-5. 방문 순서를 기록한다
            visitOrder.add(now);
            //3-6. 다음 방문 대상을 toVisit에 push 한다
            for (int next = nodes; next > 0; next--) {
                //이미 방뭉한곳은 push 하지 않으며
                if (visited[next]) continue;
                //내가 열결될 것만 push 한다
                if (adjMap[now][next] == 1) toVisit.push(next);
            }
        }
    }
}
