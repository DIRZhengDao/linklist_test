package com.zheng;

public class SortedLinkedList<T extends Comparable<T> > implements ISortedLinkedList<T> {
	/**
	 *@Author zhengzhou
	 *@Descripiton
	 *@Data:16:53 2017/10/24
	 */

	private Node<T> head=null;

	private int size=0;
	/*元素个数*/

	private int nodCount=0;
	/*节点个数*/

	Boolean isReversed=false;
	/*判断链表是否反转*/

	private static class Node<T>{

		private T data;

		private Node<T> next;

		public Node(T data, Node<T> next) {
			this.data = data;
			this.next = next;
		}
	}

	@Override
	public void add(T element) {

		Node<T> newNode=new Node<T>(element, null);
		Node<T> preNode=null;
		Node<T> current=head;

		while (current != null&&element.compareTo(current.data) > 0&&(isReversed==false)) {
				preNode = current;
				current = current.next;
		}

		while(current!=null&&element.compareTo(current.data)<0&&isReversed) {
			preNode=current;
			current=current.next;
		}

		if(preNode==null) {
			head=newNode;
		}else {
			preNode.next=newNode;
		}

		newNode.next=current;
		nodCount++;
		this.size++;
	}


	private Node<T> getNode(int index){
		Node<T> node=new Node<T>(null, null);
		if(index>=this.size||index<0) {
			System.out.println("not satisfied");
		}else {
			Node<T> current=this.head;
			for (int i = 0; i < index; i++) {
				current=current.next;
			}
			node=current;
		}
		return node;
	}

	@Override
	public T get(int index) {
		return this.getNode(index).data;
	}

	@Override
	public T remove(int index) {
		Node<T> node = this.getNode(index);
		if(this.size==1) {
			this.head=null;
		}else {
			Node<T> preNode = this.getNode(index-1);
			preNode.next=node.next;
		}
		this.size--;
		return node.data;
	}

	@Override
	public int size() {
		return this.size;
	}

	@Override
	public void reverse() {
		if(head==null||head.next==null){
			System.out.print("no need reverse");
			return;
		}
		Node<T> preNode = head;
		Node<T> current = head.next;
		Node<T> tmp;
		while (current!=null) {
			tmp = current.next;
			current.next=preNode;
			preNode = current;
			current = tmp;
		}

		head.next=null;			//将原链表的头节点的下一个节点置为null，再将反转后的头节点赋给head
		head = preNode;

		isReversed=true;

	}
}
