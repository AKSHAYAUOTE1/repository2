package logical;

public class armstrongnumber {
	public static void main(String[] args) {
		int num=153;
		int sum=0;
		int rem;
		for (int i = num; i >0;i= i/10) {
			rem=i%10;
			sum=sum+rem*rem*rem;
			if(sum==num) {
				System.out.println("given num is armstrong");
			}
			else {
				System.out.println("not armstrong num");
			}
			
		}
				
	}

}
