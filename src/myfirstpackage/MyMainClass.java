package myfirstpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class MyMainClass {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		//Student student = new Student("Student Registration");
		School school = new School();
	
		school.age();
		/*
		 * try { Student myStudent = new Student();
		 * 
		 * myStudent.setstudentName("Esraa");
		 * 
		 * FileOutputStream fileOut = new FileOutputStream(new File("myObjects.txt"));
		 * ObjectOutputStream out = new ObjectOutputStream(fileOut);
		 * 
		 * out.writeObject(myStudent);
		 * 
		 * out.close(); fileOut.close();
		 * 
		 * System.out.println(" Object Serialized and saved in EsraaAbdullah.txt");
		 * 
		 * } catch (Exception e) {
		 * 
		 * e.getMessage();
		 * 
		 * }
		 * 
		 * ////// try {
		 * 
		 * FileInputStream fis = new FileInputStream(new File("myObjects.txt"));
		 * ObjectInputStream ois = new ObjectInputStream(fis); Student std
		 * =(Student)ois.readObject();
		 * 
		 * 
		 * ois.close(); fis.close();
		 * 
		 * System.out.println("student name: "+ std.studentName);
		 * 
		 * } catch (Exception e) {
		 * 
		 * e.getMessage();}
		 */

		/*
		 * Scanner sccan = new Scanner(System.in);
		 * 
		 * boolean isExit = true; boolean isSchoolExit = true; boolean isStudentExit =
		 * true; boolean isSubjectExit = true; ArrayList<School> schoolList = new
		 * ArrayList<>(); ArrayList<Student> listStudent = new ArrayList<>();
		 * ArrayList<Subject> listSubject = new ArrayList<>(); ArrayList<Mark> listMark
		 * = new ArrayList<>();
		 * 
		 * 
		 * 
		 * do {
		 * 
		 * System.out.println("*****************");
		 * System.out.println("**** Welcome ****");
		 * System.out.println("*****************");
		 * System.out.println("\t \t \t Please choose an option \t \t \t");
		 * 
		 * System.out.println("1.Enter student details");
		 * System.out.println("2.Report"); System.out.println("3.Exit");
		 * 
		 * int option = sc.nextInt();
		 * 
		 * switch (option) {
		 * 
		 * case 1: School mySchool = new School();
		 * 
		 * // while School/// while (isSchoolExit) { School mySchool1 = new School();
		 * System.out.println("Enter school name"); String schoolName = sc.next();
		 * mySchool1.setSchoolName(schoolName);
		 * 
		 * //// // // while student while (isStudentExit) { Student myStudent = new
		 * Student(); System.out.println("Enter student name"); String studentName =
		 * sc.next(); myStudent.setstudentName(studentName);
		 * 
		 * System.out.println("Enter student ID"); int studentId = sc.nextInt(); String
		 * stdId = Integer.toString(studentId); myStudent.setstudentId(studentId);
		 * 
		 * // // // while subject while (isSubjectExit) { Subject mySubject = new
		 * Subject(); // object System.out.println("Enter Subject name"); String
		 * subjectName = sc.next(); mySubject.setsubjectName(subjectName); // to access
		 * subject name from class subject
		 * 
		 * Mark myMark = new Mark();
		 * 
		 * System.out.println("Enter Test1 Mark"); int test1M = sc.nextInt(); String
		 * mark1 = Integer.toString(test1M); myMark.setmarkOfTest1(test1M);
		 * 
		 * boolean isExitMark1 = true; try {
		 * 
		 * if (test1M >= 100) {
		 * 
		 * throw new Exception("Enter mark between 0 to 100");
		 * 
		 * } else { isExitMark1 = false; } }
		 * 
		 * catch (Exception e) { System.out.println("Invalid " + e.getMessage());
		 * 
		 * }
		 * 
		 * System.out.println("do you want to add new subject prees 1 if not press 0");
		 * int isExitSubjectinput = sc.nextInt(); if (isExitSubjectinput == 0) {
		 * 
		 * isStudentExit = true; isSubjectExit = true;
		 * 
		 * } listMark.add(myMark);
		 * 
		 * mySubject.setsubMark(listMark); listSubject.add(mySubject);
		 * 
		 * myStudent.setlistSubject(listSubject);
		 * 
		 * System.out.println("do you want to add new Student prees 1 if not press 0");
		 * int isExitStudentinput = sc.nextInt(); if (isExitStudentinput == 1) {
		 * 
		 * isStudentExit = true; isSubjectExit = true; } else { isStudentExit = false;
		 * isSubjectExit = false; } listStudent.add(myStudent); }
		 * 
		 * mySchool1.setListStudent(listStudent); // // // use if condation for while of
		 * school to add more school // // comber with other condation of while student
		 * and subject //
		 * System.out.println("do you want to add new School prees 1 if not press 0");
		 * int isExitSchoolinput = sc.nextInt(); if (isExitSchoolinput == 1) {
		 * isSchoolExit = true; isStudentExit = true; isSubjectExit = true;
		 * 
		 * } else { isSchoolExit = false; isStudentExit = false; isSubjectExit = false;
		 * 
		 * } // // /// close while subject // /// close while student // // close while
		 * school // // while for school // // schoolList.add(mySchool);
		 * 
		 * } } //
		 * 
		 * break;
		 * 
		 * case 2: // report System.out.println("*****Report*****");
		 * 
		 * for (School s : schoolList) { System.out.println("schoolName: \t" +
		 * s.schoolName + "\n");
		 * 
		 * for (Student stud : s.listStudent) { System.out.println( "studentName: \t" +
		 * stud.studentName + "\n" + "studentId: \t" + stud.studentId);
		 * 
		 * for (Subject su : stud.getlistSubject()) {
		 * 
		 * for (Mark m : su.getlistMark()) { System.out.println("subjectName: \t" +
		 * su.subjectName + "\n" + "markOfTest1:  \t" + m.getmarkOfTest1()); } } } }
		 * 
		 * break;
		 * 
		 * case 3: System.out.println(" See You Soon "); System.exit(0);
		 * 
		 * break;
		 * 
		 * } }
		 * 
		 * while (isExit); System.out.println("Thank you");
		 */
/////////////		
	}
}