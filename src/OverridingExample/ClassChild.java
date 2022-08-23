package OverridingExample;

public class ClassChild extends ClassParent {
	@Override
	public int addition(int a,int b)
	{
		System.out.println("i am child class addition");
		return a+b;
	}
}
