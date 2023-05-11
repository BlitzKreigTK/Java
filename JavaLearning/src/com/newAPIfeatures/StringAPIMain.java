package com.newAPIfeatures;

public class StringAPIMain {

	public static void main(String[] args) {
		System.out.println("String is Blank --> " + " ".isBlank());
		System.out.println("String is stripped --> " + " L R ".strip().replace(" ", "-"));
		System.out.println("String is lead stripped --> " + " L R ".stripLeading().replace(" ", "-"));
		System.out.println("String is trail stripped --> " + " L R ".stripTrailing().replace(" ", "-"));
		System.out.println("String is transformed --> " + "UPPER".transform(s -> s.substring(2)));
		System.out.println("String is formatted --> " + "My Name is %s".formatted("Tulsi"));
		System.out.println("====Lines seperated=====");
		"Line1\nLine2\nLine3".lines().forEach(System.out::println);
		System.out.println("====Lines seperated=====");
	}
}
