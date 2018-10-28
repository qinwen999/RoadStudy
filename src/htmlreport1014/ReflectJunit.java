package htmlreport1014;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectJunit {

	public static void main(String[] args) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException, InstantiationException {
		// TODO Auto-generated method stub
		
		 Class<?> testClass = DemoJunit.class;
	        Method[] methods = testClass.getMethods();
	        for (Method method : methods) {
	        	if ((method.getName()).startsWith("test")){
	        		System.out.println(method.getName());
	        		method.invoke(testClass.newInstance());   		
	        	}
	        		
	        	
	        }
		

	}

}
