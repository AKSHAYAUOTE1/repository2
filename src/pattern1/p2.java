package pattern1;

public class p2 {
	public static void main(String[] args) {
		int star;
		star=3;
		for(int i=1;i<=2;i++){
			for(int j=1;j<=star;j--) {
				System.out.print('*');
				
			}
			
			System.out.println(star--);
		}
		
	}

}
