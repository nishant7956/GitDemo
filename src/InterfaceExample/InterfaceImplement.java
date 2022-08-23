package InterfaceExample;

public class InterfaceImplement implements TestInterface, OtherInterface {

	@Override
	public int addition(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}

	@Override
	public int substraction(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int multi(int a, int b) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void PrintMe(String Message) {
		// TODO Auto-generated method stub
		System.out.print(Message);
	}

	
}
