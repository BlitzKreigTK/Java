package com.files;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class FilesMain {

	public static void main(String[] args) throws IOException {
		Path currentDir = Paths.get(".");
		System.out.println("List of files");
		Files.list(currentDir).forEach(System.out::println);
		Predicate<? super Path> predicate = path -> String.valueOf(path).contains(".java");
		Files.walk(currentDir, 4).filter(predicate).forEach(System.out::println);

		System.out.println("List of files matching .java");
		BiPredicate<Path, BasicFileAttributes> javaMatcher = (path, attributes) -> String.valueOf(path)
				.contains(".java");
		Files.find(currentDir, 4, javaMatcher).forEach(System.out::println);

		System.out.println("List of directories");
		BiPredicate<Path, BasicFileAttributes> DirMatcher = (path, attributes) -> attributes.isDirectory();
		Files.find(currentDir, 4, DirMatcher).forEach(System.out::println);
	}
}
