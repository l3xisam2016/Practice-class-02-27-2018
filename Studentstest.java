import java.util.Scanner;
public class Studentstest {

	public static void main(String[] args) {
		
Students St1=new Students("Anthony "," Francis "," Smith",4567);
Students St2=new Students("Alexus "," Cristina "," Stone",7895);

Scanner scanner= new Scanner(System.in);


System.out.println("Hello " + St2.Fullname() + " How are you?");




System.out.println("Enter:1-view name, major,classification, 2-set major, 3-set classification, 4- Exit");
int number=scanner.nextInt();




	}

}
