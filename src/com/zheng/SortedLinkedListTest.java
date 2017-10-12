package com.zheng;

public class SortedLinkedListTest {

	public static void main(String[] args) {
		SortedLinkedList<City> sortedLinkedList=new SortedLinkedList<City>();
		sortedLinkedList.add(new City(11,"beijing"));
		sortedLinkedList.add(new City(10,"shenzhen"));
		sortedLinkedList.add(new City(15,"shanghai"));
		sortedLinkedList.add(new City(16,"guangzhou"));

		//		City city1 = sortedLinkedList.get(0);
		//		City city2 = sortedLinkedList.get(1);
		//		City city3 = sortedLinkedList.get(2);
		//		City city4 = sortedLinkedList.get(3);

		System.out.println(sortedLinkedList.get(0));
		System.out.println(sortedLinkedList.get(1));
		System.out.println(sortedLinkedList.get(2));
		System.out.println(sortedLinkedList.get(3));
		//System.out.println(sortedLinkedList.get(4));


		System.out.println("*****************************************");

		System.out.println("反转后：");
		sortedLinkedList.reverse();
		System.out.println(sortedLinkedList.get(0));
		System.out.println(sortedLinkedList.get(1));
		System.out.println(sortedLinkedList.get(2));
		System.out.println(sortedLinkedList.get(3));

		System.out.println("链表中元素个数："+sortedLinkedList.size());

	}

}
