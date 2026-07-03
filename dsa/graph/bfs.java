import java.util.*;
public class bfs {
    public static void main(String[] args) {
        Map<String, List<String>> graph = new HashMap<>();
        graph.put("A", Arrays.asList("B", "C"));
        graph.put("B", Arrays.asList("D", "E"));
        graph.put("C", new ArrayList<>());
        graph.put("D", new ArrayList<>());

        Queue<String> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();
        queue.add("A");
        visited.add("A");

        while (!queue.isEmpty()) {
            String node = queue.poll();
            System.out.print(node + " ");

            for (String next : graph.get(node)) {
                if (!visited.contains(next)) {
                    queue.add(next);
                    visited.add(next);
                }
            }
            
    }
    }
}