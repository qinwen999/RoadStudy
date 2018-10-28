package t0916;

import java.util.ArrayList;

public class Demo{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a=(String) getOb("a");
		System.out.println(a);
		String b= getObj("b");
		System.out.println(b);
		
	
		

	}
	
	public static Object getOb(Object o){
		return o;
	}
	

	
	public static <T> T getObj(T t) { //返回值类型 
		return t;
	}

}
