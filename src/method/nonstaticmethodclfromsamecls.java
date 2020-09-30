package method;

public class nonstaticmethodclfromsamecls {
	public static void main(String[] args) {
		nonstaticmethodclfromsamecls	a  = new nonstaticmethodclfromsamecls();
		a.test5();
		a.test6();
		
	}
public void test5() {
	System.out.println("non static method running");
}
public void test6() {
	System.out.println("non static method runing");
}
}
