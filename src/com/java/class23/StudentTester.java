package com.java.class23;

class Person {
	private String profession;
	private String schoolName;

	public String getProfession() {
		return profession;
	}

	public void setProfession(String profession) {
		this.profession = profession;
	}

	public String getSchoolName(String schoolName) {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public void diplayPerson() {
		System.out.println("I am a " + profession + " and I study at " + schoolName);
	}

}

public class StudentTester {

	public static void main(String[] args) {
		Person p = new Person();
		p.setProfession("Student");
		p.setSchoolName("SptintQA");

		p.diplayPerson();

	}

}