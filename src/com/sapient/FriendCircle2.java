package com.sapient;

public class FriendCircle2 {

	public static int getFC(int[][] f) {
		if (f == null || f.length < 1)
			return 0;

		int noOfCircle = 0;
		boolean visited[] = new boolean[f.length];
		for (int i = 0; i < visited.length; i++) {
			visited[i] = false;
		}

		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				noOfCircle++;
				visited[i] = true;
				findFriends(f, visited, i);
			}
		}
		return noOfCircle;
	}

	public static void findFriends(int[][] friends, boolean[] visited, int id) {
		for (int j = 0; j < friends.length; j++) {
			if (!visited[j] && j != id && 1 == friends[id][j]) {
				visited[j] = true;
				findFriends(friends, visited, j);
			}
		}
	}

	public static void main(String[] args) {
		int[][] f = { { 1, 1, 0 }, { 1, 1, 1 }, { 0, 0, 1 } };
		System.out.println(getFC(f));

	}
}
