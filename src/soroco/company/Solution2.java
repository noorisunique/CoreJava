package soroco.company;

import java.util.*;

import scjp.Worker31;

class Solution2 {
	public static boolean areSentencesSimilarTwo(List<String> words1, List<String> words2, List<List<String>> pairs) {
		if (words1.size() != words2.size()) {
			return false;
		}

		Map<String, Set<String>> graph = new HashMap<>();

		for (List<String> pair : pairs) {
			graph.putIfAbsent(pair.get(0), new HashSet<>());
			graph.putIfAbsent(pair.get(1), new HashSet<>());

			graph.get(pair.get(0)).add(pair.get(1));
			graph.get(pair.get(1)).add(pair.get(0));
		}

		for (int i = 0; i < words1.size(); i++) {
			if (words1.get(i).equals(words2.get(i))) {
				continue;
			}

			if (!graph.containsKey(words1.get(i)) || !graph.containsKey(words2.get(i))) {
				return false;
			}
			Set<String> visited = new HashSet<>();

			if (!dfs(words1.get(i), words2.get(i), graph, visited)) {
				return false;
			}
		}
		return true;
	}

	public static boolean dfs(String startWord, String endWord, Map<String, Set<String>> graph, Set<String> visited) {
		if (graph.get(startWord).contains(endWord)) {
			return true;
		}

		if (visited.contains(startWord)) {
			return false;
		}

		visited.add(startWord);
		for (String nextWord : graph.get(startWord)) {
			if (dfs(nextWord, endWord, graph, visited)) {
				return true;
			}
		}
		return false;
	}

	public static void main(String[] args) {
		List<String> words1 = Arrays.asList("amazing", "acting", "abilities");
		List<String> words2 = Arrays.asList( "fine", "threatrics", "talent" );
		List list1=Arrays.asList("amazing", "fine");
		List list2=Arrays.asList("fine", "good");
		List list3=Arrays.asList("acting", "threatrics");
		List list4=Arrays.asList("abilities", "talent");
		
		List<List<String>> pairs = Arrays.asList(list1,list2,list3,list4);

		System.out.println(areSentencesSimilarTwo(words1, words2, pairs));
	}
}