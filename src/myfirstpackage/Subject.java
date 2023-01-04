package myfirstpackage;


import java.util.ArrayList;
import java.util.List;


public class Subject   {

String subjectName;

ArrayList<Mark> listMark = new ArrayList<>();

/*
 * public void subjectDetails() {
 * 
 * Subject mySubject = new Subject(); // object
 * System.out.println("Enter Subject name"); String subjectName = sc.next();
 * mySubject.setsubjectName(subjectName); // to access subject name from class
 * subject
 * 
 * }
 */

/// getters and setters

public void setsubjectName(String name) {
this.subjectName = name;

}

public String getsubjectName() {
return subjectName;
}



public List<Mark> getlistMark() {
return listMark;

}

public void setsubMark(ArrayList<Mark> listMark2) {
// TODO Auto-generated method stub

}


}
