package myfirstpackage;




public class Mark {

int markOfTest1;



/*
 * public void markDetails() {
 * 
 * Mark myMark = new Mark();
 * 
 * System.out.println("Enter Test1 Mark");
 * 
 * int test1M = sc.nextInt();
 * 
 * myMark.setmarkOfTest1(test1M);
 * 
 * try {
 * 
 * if (test1M >= 100) {
 * 
 * throw new Exception("Enter mark between 0 to 100");
 * 
 * } else {
 * 
 * }
 * 
 * }
 * 
 * catch (Exception e) {
 * 
 * System.out.println("Invalid " + e.getMessage());
 * 
 * }
 * 
 * }
 */

public void setmarkOfTest1(int markOfTest1) {

this.markOfTest1 = markOfTest1;

}

public int getmarkOfTest1() {

return markOfTest1;

}

}


