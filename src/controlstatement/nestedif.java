package controlstatement;

public class nestedif {
public static void main(String[] args) {
	String un="abc";
	String pwd="xyz";
	if(un=="abc"){
	
		if(pwd=="xyz") {
			System.out.println("login successfull");
		}
	
		else {
			System.out.println("wrong pwd");
		}
		 {
			System.out.println("wrong un");
		}
	}
}}


