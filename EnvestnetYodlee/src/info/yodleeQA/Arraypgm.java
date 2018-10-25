package info.yodleeQA;

public class Arraypgm {

	public static void main(String[] args) {
		String[] chars = { "a", "b", "c", "a", "d", "c" };
		for (int i = 0; i < chars.length; i++) {
			for (int j = i + 1; j < chars.length; j++) {
				if (chars[i].compareTo(chars[j]) == 0) {
					System.out.print(chars[j]+" ");
				}
			}
		}

	}

}
