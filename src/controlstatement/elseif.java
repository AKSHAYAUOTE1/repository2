package controlstatement;

public class elseif {
	public static void main(String[] args) {
		int marks=70;
		if(marks>=70) {
			System.out.println("distinction");
		}
		else if (marks>=60) {
			System.out.println("first class");
		}
		else if(marks>=50) {
			System.out.println("2nd class");
		}
		else	if(marks>=35) {
			System.out.println("pass class");
		}
		else{
			System.out.println("pass");
			
		}

	}
}
