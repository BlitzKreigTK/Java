package com.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDate;
import java.util.List;

public class FileWriteMain {

	public static void main(String[] args) throws IOException {
		LocalDate time = LocalDate.now();
		String currtime = String.valueOf(time);
		System.out.println("=======================Write in a file=======================");

		Path currentDir = Paths.get(".\\src\\com\\files\\data_" + currtime + ".txt");
		List<String> content = List.of("Cat", "Elephant", "Zebra");
		Files.write(currentDir, content);
		System.out.println("=====================Written in data_" + currtime + ".txt file=====================");
	}
}
