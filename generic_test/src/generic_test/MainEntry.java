package generic_test;

import generic_test.Mygenclass;
import generic_test.Mygeninterface;
import generic_test.Regularclass;

public class MainEntry {
	
	public static void main(String[] args){
		Mygeninterface<Integer,String> mgi1 = new Mygenclass<Integer,String>(1, "yourname");
		Mygeninterface<Integer,Integer> mgi2 = new Mygenclass<Integer,Integer>(1,2017);
		Integer i1 = Regularclass.getsum(10,20);
		Float f1 = Regularclass.getsum(100f,200f);
		System.out.println(mgi1.getkey() + " " + mgi2.getvalue());
		System.out.println(i1 + " " + f1);
	}

}
