package com.pack1;

public class ClassA
{
void meth1()
{
	System.out.println("meth1() called");
	System.out.println(10);
	System.out.println(20);
	ClassA aobj=new ClassA();
	aobj.meth2();
}
void meth2()
{
	System.out.println("meth2() called");
	System.out.println(30);
	System.out.println(40);
}
public static void main(String[] args)
{
System.out.println("START");
System.out.println("JAVA IS AWESOME");
ClassA aobj=new ClassA();
aobj.meth1();
System.out.println("END");
}
}
