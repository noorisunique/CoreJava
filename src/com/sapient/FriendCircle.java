package com.sapient;

public class FriendCircle {

	public static int getFC(char[][] f) {
		if (f == null || f.length < 1)
			return 0;

		int noOfCircle = 0;
		boolean visited[] = new boolean[f.length];
		for (int i = 0; i < visited.length; i++) {
			visited[i] = false;
		}

		for (int i = 0; i < visited.length; i++) {
			if (!visited[i]) {
				
				visited[i] = true;
				findFriends(f, visited, i);
				noOfCircle++;
			}
		}
		return noOfCircle;
	}

	public static void findFriends(char[][] friends, boolean[] visited, int id) {
		for (int j = 0; j < friends.length; j++) {
			if (!visited[j] && j != id && 'Y' == friends[id][j]) {
				visited[j] = true;
				findFriends(friends, visited, j);
			}
		}
	}

	public static void main(String[] args) {
		char[][] f = { { 'Y', 'Y', 'N' }, { 'Y', 'Y', 'Y' }, { 'N', 'N', 'Y' } };
		System.out.println(getFC(f));

	}
}
