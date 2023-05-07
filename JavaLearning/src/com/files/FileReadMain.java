package com.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileReadMain {

	public static void main(String[] args) throws IOException {
		System.out.println("=======================Read in a single line=======================");
		Path currentDir = Paths.get(".\\src\\com\\files\\data.txt");
		List<String> lines = Files.readAllLines(currentDir);
		System.out.println(lines);
		System.out.println("=======================Read with a new line========================");
		Files.lines(currentDir).forEach(System.out::println);
		System.out.println("=======================Read with a filters=========================");
		Files.lines(currentDir).filter(str -> str.contains("on")).map(String::toLowerCase).forEach(System.out::println);
	}
}
