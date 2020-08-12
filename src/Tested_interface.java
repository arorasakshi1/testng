
public class Tested_interface implements class2.message{
	public void msg() {
		System.out.println("hello this is a nested interface");
		
	}

	public static void main(String[] args) {
		class2.message obj=new Tested_interface();
		obj.msg();

	}

	
	

}
