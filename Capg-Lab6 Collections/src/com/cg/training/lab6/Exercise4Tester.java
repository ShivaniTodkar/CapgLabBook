package com.cg.training.lab6;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import com.cg.training.lab6.service.Student;
import com.cg.training.lab6.service.StudentMedal;
public class Exercise4Tester {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		HashMap<Integer,Student> obj=new HashMap<>();
		HashMap<Integer,Student> obj2=getStudents(obj);
		for(Map.Entry<Integer,Student> list:obj2.entrySet()) {
			System.out.println(list.getKey()+":"+list.getValue());
		}
	}
	private static HashMap<Integer, Student> getStudents(HashMap<Integer, Student> obj) {
		Student student=new Student();
		System.out.println("Enter the name,rollno,marks of student :");
		String name=sc.nextLine();
		int rollNo=sc.nextInt();
		int mark=sc.nextInt();
		student.setName(name);
		student.setRollNo(rollNo);
		student.setMarks(mark);
		if(student.getMarks()>=90) {
			student.setMedal(StudentMedal.Gold);
			
		}else if(student.getMarks()>=80 && student.getMarks()<90) {
			student.setMedal(StudentMedal.Silver);
			
		}else if(student.getMarks()>=70 && student.getMarks()<80) {
			student.setMedal(StudentMedal.Bronze);
			
		}else {
			student.setMedal(StudentMedal.No_Medal);
		}
		Student newStudent=new Student("Student",101,80,StudentMedal.Silver);
		Student student1[]=new Student[]{student,newStudent};
		for(int i=0;i<student1.length;i++) {
			if(student1[i].getMarks()<60) {
				System.out.println("Marks are less, not applicable for scholorship");
			}
			else {
				obj.put(student1[i].getRollNo(),student1[i]);
			}
		}
		obj.put(student.getRollNo(),student);
		obj.put(newStudent.getRollNo(),newStudent);
		return obj;

	}
}
