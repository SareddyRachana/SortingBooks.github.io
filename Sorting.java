package com.tap.emptest1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Sorting {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int noOfStudents = scanner.nextInt();
		scanner.nextLine();
		
		List<Student> listOfStudents = new ArrayList<>();
		
	        for(int i=0; i<noOfStudents; i++){
	            String input = scanner.nextLine();
	            String[] parts = input.split(" ");
//	            if(parts.length < 3) {
//	            	System.out.println("Invalid input. Please enter : name age gpa");
//	            	continue;
//	            }
	            String sname = parts[0];
	            int sage =Integer.parseInt(parts[1]);
	            double sgpa =Double.parseDouble(parts[2]);
	            Student stu = new Student(sname, sage, sgpa);
	            listOfStudents.add(stu);
	        }
	        
	        Collections.sort(listOfStudents, new StudentComparator());
	        for(Student student : listOfStudents) {
	        	System.out.println(student.getName()+ " "+student.getAge()+" "+student.gpa);
	        }
	        
	}
}

class Student{
    String name;
    int age;
    double gpa;

    public Student(String name, int age, double gpa){
        this.setName(name);
        this.setAge(age);
        this.gpa = gpa;
    }

    public String toString(){
        return getName()+" "+getAge()+" "+gpa;
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}

class StudentComparator implements Comparator<Student>{
	public int compare(Student s1, Student s2) {
		if(s1.gpa != s2.gpa) {
			return Double.compare(s2.gpa,s1.gpa);
		}
		if(s1.age != s2.age) {
			return Integer.compare(s1.age, s2.age);
		}
		
		return s1.name.compareTo(s2.name);
	}
	
}
