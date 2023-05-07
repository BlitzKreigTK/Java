package com.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class DescendingStudent implements Comparator<Student> {
	@Override
	public int compare(Student Student1, Student Student2) {
		return Integer.compare(Student2.getId(), Student1.getId());
	}
}

public class StudentMain {
	public static void main(String[] args) {
		List<Student> stud = List.of(new Student(1, "Tulsi Kant"), new Student(10, "Adam Zampa"),
				new Student(2, "Raunit Sriv"));
		List<Student> student = new ArrayList<Student>(stud);
		System.out.println(student);
		Collections.sort(student);
		System.out.println("Sorted by Id Aesc == " + student);
		Collections.sort(student, new DescendingStudent());
		// student.sort(new DescendingStudent());
		System.out.println("Sorted by Id Desc == " + student);
	}
}
