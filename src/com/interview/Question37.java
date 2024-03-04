package com.interview;

import java.util.*;

public class Question37 {
    public static String GraphChallenge(String[] strArr) {
        // Check if the array is empty or null
        if (strArr == null || strArr.length == 0) {
            return "-1";
        }

        int numNodes = Integer.parseInt(strArr[0]);
        Map<String, List<String>> graph = new HashMap<>();

        // Build the graph
        for (int i = 1; i <= numNodes; i++) {
            graph.put(strArr[i], new ArrayList<>());
        }

        // Add connections to the graph
        for (int i = numNodes + 1; i < strArr.length; i++) {
            String[] connection = strArr[i].split("-");
            graph.get(connection[0]).add(connection[1]);
            graph.get(connection[1]).add(connection[0]);
        }

        // Perform BFS to find the shortest path
        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        Map<String, String> parentMap = new HashMap<>();

        queue.add(strArr[1]); // Start from the first node
        visited.add(strArr[1]);

        while (!queue.isEmpty()) {
            String currentNode = queue.poll();

            for (String neighbor : graph.get(currentNode)) {
                if (!visited.contains(neighbor)) {
                    queue.add(neighbor);
                    visited.add(neighbor);
                    parentMap.put(neighbor, currentNode);
                }
            }
        }

        // Reconstruct the path
        String lastNode = strArr[numNodes];
        if (!parentMap.containsKey(lastNode)) {
            return "-1"; // No path exists
        }

        List<String> path = new ArrayList<>();
        while (lastNode != null) {
            path.add(lastNode);
            lastNode = parentMap.get(lastNode);
        }

        Collections.reverse(path);
        return String.join("-", path);
    }
    public static void main(String[] args) {
        String[] input1 = {"4", "A", "B", "C", "D", "A-B", "B-D", "B-C", "C-D"};
        String result1 = GraphChallenge(input1);
        System.out.println(result1); // Output: A-B-D

        String[] input2 = {"7", "A", "B", "C", "D", "E", "F", "G", "A-B", "A-E", "B-C", "C-D", "D-F", "E-D", "F-G"};
        String result2 = GraphChallenge(input2);
        System.out.println(result2); // Output: A-E-D-F-G
    }
    }

