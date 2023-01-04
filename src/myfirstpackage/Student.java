package myfirstpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Student implements Serializable {
	Student(String comment){ 
		 System.out.println(comment );
		 }

	//transient Scanner sc = new Scanner(System.in);
String studentName;
int studentId;
private String studentEmail;



boolean studentIdTrue = true;
ArrayList<Subject> listSubject = new ArrayList<>();

ArrayList<Student> listStudent = new ArrayList<>();



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

public String getStudentEmail() {
	return studentEmail;
}

public void setStudentEmail(String studentEmail) {
	this.studentEmail = studentEmail;
}





}
