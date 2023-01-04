package myfirstpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Student implements Serializable {

	//transient Scanner sc = new Scanner(System.in);
String studentName;
int studentId;



boolean studentIdTrue = true;
ArrayList<Subject> listSubject = new ArrayList<>();

ArrayList<Student> listStudent = new ArrayList<>();

/*
 * public void studentDetails1() {
 * 
 * Student myStudent = new Student(); System.out.println("Enter student name");
 * String studentName = sc.next(); myStudent.setstudentName(studentName);
 * 
 * System.out.println("Enter student ID"); int studentId = sc.nextInt();
 * myStudent.setstudentId(studentId);
 * 
 * }
 */

/// getters and setters

public void setstudentName(String name) {
this.studentName = name;

}

public String getstudentName() {
return studentName;
}
//

public void setstudentId(int Id) {
this.studentId = Id;

}

public int getstudentId() {
return studentId;

}

public void setlistSubject(ArrayList<Subject> listSubject) {

this.listSubject = listSubject;

}

public List<Subject> getlistSubject() {

return listSubject;

}

public void studentDetails() {
// TODO Auto-generated method stub

}

}
