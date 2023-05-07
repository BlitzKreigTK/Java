package com.files;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class FileAppendMain {

	public static void main(String[] args) {
		List<String> stringsToAppend = Arrays.asList("Line 1", "Line 2", "Line 3");
		String currentDir = ".\\src\\com\\files\\data.txt";
		try (FileWriter fileWriter = new FileWriter(currentDir, true)) {
			for (String line : stringsToAppend) {
				fileWriter.write(line + System.lineSeparator());
				System.out.println("Append --> " + line);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
