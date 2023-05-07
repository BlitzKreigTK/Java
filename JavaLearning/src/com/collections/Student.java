package com.collections;

public class Student implements Comparable<Student> {
	private String Name;
	private int Id;

	public Student(int id, String name) {
		super();
		Name = name;
		Id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public int getId() {
		return Id;
	}

	public void setId(int id) {
		Id = id;
	}

	@Override
	public String toString() {
		return "[Id = " + Id + " Name = " + Name + "]";
	}

	@Override
	public int compareTo(Student that) {
		return Integer.compare(this.Id, that.Id);
	}

}
