package myfirstpackage;
import java.util.*;

public class School implements StudentRegistiration {

Scanner sc = new Scanner(System.in);
public void age() {
	System.out.println("Age must be Above 18");
}
String schoolName;

ArrayList<School> schoolList = new ArrayList<>();

ArrayList<Student> listStudent = new ArrayList<>();

ArrayList<Subject> listSubject = new ArrayList<>();

ArrayList<Mark> listMark = new ArrayList<>();

boolean isSchoolExit = true;

boolean isStudentExit = true;

boolean isSubjectExit = true;

public String getSchoolName() {

return schoolName;

}

public void setSchoolName(String schoolName) {

this.schoolName = schoolName;

}

public ArrayList<Student> getListStudent() {

return listStudent;

}

public void setListStudent(ArrayList<Student> listStudent) {

this.listStudent = listStudent;

}

public void schoolDetails1() {

School mySchool = new School();

System.out.println("Enter school name");

String schoolName = sc.next();

mySchool.setSchoolName(schoolName);

}

}
