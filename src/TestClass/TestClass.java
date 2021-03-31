package TestClass;

import java.io.*;
import java.util.*;

public class TestClass {

	static int minReservationTables(int[][] reservationStartEndTimes) {
		for (int row = 0; row < reservationStartEndTimes.length; row++)
			for (int col = 0; col < reservationStartEndTimes[row].length; col++) {

				System.out.println(reservationStartEndTimes[row][col]);
				return reservationStartEndTimes[row][col];
			}
		
		for (int row = 0; row < reservationStartEndTimes.length; row++)
			for (int col = 0; col < reservationStartEndTimes[row].length; col++) {

				System.out.println(reservationStartEndTimes[row][col]);
			}
		return 0;
	}

	// DO NOT MODIFY ANYTHING BELOW THIS LINE!!

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter wr = new PrintWriter(System.out);
		int n = Integer.parseInt(br.readLine().trim());
		int[][] reservationStartEndTimeList = new int[n][2];
		String[] reservationStartEndTimes = br.readLine().split(" ");
		for (int i = 0; i < n; i++) {
			String[] reservationStartEndTime = reservationStartEndTimes[i].split(",");
			for (int j = 0; j < reservationStartEndTime.length; j++) {
				reservationStartEndTimeList[i][j] = Integer.parseInt(reservationStartEndTime[j]);
			}
		}

		int out = minReservationTables(reservationStartEndTimeList);
		System.out.println(out);

		wr.close();
		br.close();
	}
}