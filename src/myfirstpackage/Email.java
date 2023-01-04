package myfirstpackage;
import java.util.ArrayList;
import java.util.List;
import java.util.HashSet;
import java.util.Set;
public class Email {
List<String> listDuplicateEmail = new ArrayList<>();
Set<String> hashEmailSet = new HashSet<String>();
	
	public void duplicatEmail() {
	for (String email : listDuplicateEmail) {
		if (hashEmailSet.add(email) == false) {
			System.out.println("Deplicate email is: " + " " + email);

		}
	}
}
}
