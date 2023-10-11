package classes.object.programs;

public class AccessModifiersClass {

	public static void main(String[] args) {
		/*
		 There are 12 Access Modifiers  for Member(variable and Method) and Class 
		 1.public
		 2.protected
		 3.<default>
		 4.private
		 5.abstract
		 6.final
		 7.strictfp
		 8.static
		 9.synchronized
		 10.native
		 11.transient
		 12.volatile
		 
***********************************************************************************************************	 
		 Top - Level Class=> public, <default> ,abstract, final,strictfp
		 
		 public => Accessible Anywhere(package)
		 <default> =>  Accessible In Current packeage
		 abstract => Use achieve abstraction  
		 final => It is final can not be extends [Modify]
		 strictfp => Specify  Float Calculation = Float calculation are platform dependent (32/64)
		 
		 Inner - Level Class => public, <default>,protected ,private,static ,abstract, final,strictfp
		 
		 protected => Accessible Current package + Child Class(Anywhere Package)
		 private  =>  Current Class (Use in Inner Class Only)
		 static => Use with Inner Class.The static belongs to the class.
***********************************************************************************************************		
		 
1.public => Use with variable, method  and Class => Accessible Anywhere Package
2.protected => Use with variable , Method and Inner Class => Accessible Current Package + Child Class can access anywhere package
3.<Default> => Use with variable , Method and Class => Accessible Current Package
4.private => Use with variable , Method and  Inner Class => Accessible Current Class
5.final =>  Use with variable , Method and  Inner Class. Variable value can not modify.Method can not Override and Class can not Extends
6.abstract =>Use with  Method and  Class.Create incomplete Method inside abstract Class
7.strictfp => Specify  Float Calculation = Float calculation are platform dependent (32/64 bit
8.static => Use with variable , Method and  Inner Class.The static keyword belongs to the class.The static keyword in Java is mainly used for memory management.  
9.synchronized => use in method/block for Thread Safety
10.native => Use C/C++ class functionality
11.transient => Use With Variable , it  can't serialize in Serialization Process
12.volatile => Use With Variable ,Overcome data inconstancy problem
		 */ 

	}

}
