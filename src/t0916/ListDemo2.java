package t0916;

import java.util.ArrayList;
import java.util.Iterator;
public class ListDemo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ArrayList ���޶��洢���ͣ���ô�洢����Object����
		ArrayList ll=new ArrayList();
		ll.add("hi");
		ll.add(1000);
		ll.add(78.9999);
		
		
		ArrayList<Integer> list = new ArrayList<Integer>(); 
		//����������5��IntԪ��
		for(int i=0;i <5;i++ ) 
		list.add(i); 
		System.out.println(list.toString());
	}

}
