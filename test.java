package basic.pckg.stc;
import basic.pckg.*;
//import basic.pckg.My_first;
import static basic.pckg.My_first.*;
//import static basic.pckg.My_first.i;
// import static basic.pckg.*;
public class test {
	int var1=2;
		static int s = 5;
	public static int h=10;
	 void test1(){System.out.println("GM");
	 int var1 = 5;
	 System.out.println(var1);
	}
public static void main(String args[]){
	My_first j1 = new My_first();
	test t1 = new test();
	j1.apply(10);
	j1.apply(i);
	t1.test1();
	// j1.test1(); -------- error ---- //The method test1() is undefined for the type My_first
	//   so for perticular object we can use only its instance method and veriables
    
	System.out.println(j1.sum_i(15));	
	Azim a1=new Azim();
	a1.main(args);	
}
}
class Azim extends  My_first{
      test d;  // class declaration
      
	public   void main(String args[]){    // main method with public class is executed
		System.out.println(p);	// protected accessed
		My_first f = new My_first();
		//System.out.println(f.p); protected cant be access in extended class with refernce object
	System.out.println(d.s);  // static variable(class varble)referred with class
		System.out.println(h);
		System.out.println(d.h);	
	}	
}
class abdul{
	public static void main (){
		test d = null; 
		System.out.println(d.h);
	
	
	/// code commited again
	//}
}
