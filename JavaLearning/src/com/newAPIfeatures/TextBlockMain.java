package com.newAPIfeatures;

public class TextBlockMain {

	public static void main(String[] args) {
		String textBlock = """
				Line1:
					Line2
						"Line3"
					Line4
				Line5\nLine6
				""";
		String textBlock2 = """
				Line1: %s
					Line2
						"Line3"
					Line4
				Line5\nLine6
				""".formatted("Some Text");
		System.out.println("Textblock " + textBlock);
		System.out.println("Formatted textblock " + textBlock2);
	}
}
