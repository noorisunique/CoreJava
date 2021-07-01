package logicMonitor.com;

public class LirstNonRepeatingLetter {
	static final int NO_OF_CHARS = 256;
	static char count[] = new char[NO_OF_CHARS];

	static void get_char_count(String str) {
		for (int i = 0; i < str.length(); i++)
			count[str.charAt(i)]++;
	}

	public static String firstNonRepeatingLetter(String str) {
		get_char_count(str);
		int index = -1, i;

		for (i = 0; i < str.length(); i++) {
			if (count[str.charAt(i)] == 1) {
				index = i;
				break;
			}
		}
		return Character.toString(str.charAt(index));
	}

	public static void main(String[] args) {
		System.out.println(firstNonRepeatingLetter("jsdjshdjsdjs"));

	}

}
