package com.zheng;

import java.util.Arrays;

public class SortedLinkedListTest {
	/**
	 *@author zhengzhou
	 *@descripiton
	 *@date 11:21 2017/10/25
	 */
	public static void main(String[] args) {
		SortedLinkedList<City> sortedLinkedList=new SortedLinkedList<City>();
		sortedLinkedList.add(new City(11,"beijing"));
		sortedLinkedList.add(new City(10,"shenzhen"));
		sortedLinkedList.add(new City(15,"shanghai"));
		sortedLinkedList.add(new City(20,"guangzhou"));

		//		City city1 = sortedLinkedList.get(0);
		//		City city2 = sortedLinkedList.get(1);
		//		City city3 = sortedLinkedList.get(2);
		//		City city4 = sortedLinkedList.get(3);

		System.out.println(sortedLinkedList.get(0));
		System.out.println(sortedLinkedList.get(1));
		System.out.println(sortedLinkedList.get(2));
		System.out.println(sortedLinkedList.get(3));
		System.out.println(sortedLinkedList.get(-1));


		System.out.println("*****************************************");

		System.out.println("反转后：");
		sortedLinkedList.reverse();

		System.out.println(sortedLinkedList.get(0));
		System.out.println(sortedLinkedList.get(1));
		System.out.println(sortedLinkedList.get(2));
		System.out.println(sortedLinkedList.get(3));
		//System.out.println(sortedLinkedList.get(4));

		sortedLinkedList.add(new City(21,"wuhan"));

		System.out.println("链表中元素个数："+sortedLinkedList.size());

		System.out.println("*****************************************");
		//sortedLinkedList.remove(1);
		System.out.println(sortedLinkedList.get(0));
		System.out.println(sortedLinkedList.get(1));
		System.out.println(sortedLinkedList.get(2));
		System.out.println(sortedLinkedList.get(3));
		System.out.println(sortedLinkedList.get(4));




	}

}
