package soroco.company;

import java.util.*;

import scjp.Worker31;

class Solution {
	public static boolean areSentencesSimilarTwo(String[] words1, String[] words2, String[][] pairs) {
		if (words1.length != words2.length) {
			return false;
		}

		Map<String, Set<String>> graph = new HashMap<>();

		for (String[] pair : pairs) {
			graph.putIfAbsent(pair[0], new HashSet<>());
			graph.putIfAbsent(pair[1], new HashSet<>());

			graph.get(pair[0]).add(pair[1]);
			graph.get(pair[1]).add(pair[0]);
		}

		for (int i = 0; i < words1.length; i++) {
			if (words1[i].equals(words2[i])) {
				continue;
			}

			if (!graph.containsKey(words1[i]) || !graph.containsKey(words2[i])) {
				return false;
			}
			Set<String> visited = new HashSet<>();

			if (!dfs(words1[i], words2[i], graph, visited)) {
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
		String[] words1 = { "great", "acting", "skills" };
		String[] words2 = { "fine", "drama", "talent" };
		String[][] pairs = { { "great", "good" }, { "fine", "good" }, { "acting", "drama" }, { "skills", "talent" } };

		System.out.println(areSentencesSimilarTwo(words1, words2, pairs));
	}
}