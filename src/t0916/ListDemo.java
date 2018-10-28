package t0916;

import java.awt.List;
import java.util.ArrayList;

public class ListDemo {

	// TODO Auto-generated method stub

	static final int N = 50000;

	long timeList(List list) {
		long start = System.currentTimeMillis();
		Object o = new Object();
		for (int i = 0; i < N; i++) {
			list.add(0, o);
		}
		return System.currentTimeMillis() - start;
	}

	long readList(List list) {
		long start = System.currentTimeMillis();
		for (int i = 0, j = list.size(); i < j; i++) {

		}
		return System.currentTimeMillis() - start;
	}

	List addList(List list) {
		Object o = new Object();
		for (int i = 0; i < N; i++) {
			list.add(0, o);
		}
		return list;
	}

	public static void main(String[] args) {
		System.out.println("ArrayList添加" + N + "条耗时：" + timeList(new ArrayList()));
		System.out.println("LinkedList添加" + N + "条耗时：" + timeList(new LinkedList()));

		List list1 = addList(new ArrayList<>());
		List list2 = addList(new LinkedList<>());
		System.out.println("ArrayList查找" + N + "条耗时：" + readList(list1));
		System.out.println("LinkedList查找" + N + "条耗时：" + timeList(list2));
	}
}
