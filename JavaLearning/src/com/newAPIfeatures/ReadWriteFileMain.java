package com.newAPIfeatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadWriteFileMain {

	public static void main(String[] args) throws IOException {
		Path readFile = Paths.get(".\\src\\com\\newAPIfeatures\\data.txt");
		Path newFile = Paths.get(".\\src\\com\\newAPIfeatures\\data_new.txt");
		System.out.println("=======================Read file line=======================");
		String fileContent = Files.readString(readFile);
		System.out.println(fileContent);
		System.out.println("======================Writing new file======================");
		String newFileContent = fileContent.replace("Cat", "Rhino");
		Files.writeString(newFile, newFileContent);
	}

}
