package logical;

public class reverseoddnostring2 {
	
	
public static void main(String[] args) {
	 String str = "abc xyz lmn abc1";
	 String ar[] = str.split(" ");
	


 
	for (int i = 0; i <= ar.length - 1; i++) {
		if ((i % 2) != 0) {
			String str11 = ar[i];
			ar[i] = RevString(str11);
		}
	}

	for (int i = 0; i < ar.length; i++) {
		System.out.print(ar[i] + " ");
	}

	// TODO Auto-generated method stub
	
	
}

private static String RevString(String inp) {
	String rev=" ";
	for (int j = inp.length()-1;j>=0; j--) {
		rev=rev+inp.charAt(j);
		
		
	}
	// TODO Auto-generated method stub
	return rev;
}

}

