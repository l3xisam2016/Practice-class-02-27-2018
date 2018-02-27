
public class Students {

	String Firstname;
	String Middleintial;
	String Lastname;
	int StudentsID;
	String Major;
	String Classification;
	
	public Students(String Firstname2,String Middleintial2,String Lastname2,int StudentsID2) {

		Firstname=Firstname2;
		Middleintial=Middleintial2;
		Lastname=Lastname2;
		StudentsID=StudentsID2;
		 
	}
public String Fullname() {
	return Firstname + Middleintial + Lastname;
	
}
	public void setMajor(String a) {
		Major=a;
	}
public void satClassification(String b) {
	Classification=b;
}
	
}
