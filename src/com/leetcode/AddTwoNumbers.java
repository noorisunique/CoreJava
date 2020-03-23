package com.leetcode;

class ListNode {
	int val;
	ListNode next;

	ListNode(int data) {
		this.val = data;
	}
}

public class AddTwoNumbers {

	public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {

		ListNode dummy_head = new ListNode(0);
		ListNode l3 = dummy_head;
		int carry = 0;
		while (l1 != null || l2 != null) {

			int l1_value = (l1 != null) ? l1.val : 0;
			int l2_value = (l2 != null) ? l2.val : 0;

			int current_sum = l1_value + l2_value + carry;
			carry = current_sum / 10;
			int last_digit = current_sum % 10;

			ListNode new_node = new ListNode(last_digit);
			l3.next = new_node;

			if (l1 != null)
				l1 = l1.next;
			if (l2 != null)
				l2 = l2.next;
			l3 = l3.next;
		}

		if (carry > 0) {
			ListNode new_node = new ListNode(carry);
			l3.next = new_node;
			l3 = l3.next;
		}
		return dummy_head.next;
	}

	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		ListNode l2 = new ListNode(4);
		ListNode l3 = new ListNode(3);
		l1.next = l2;
		l2.next = l3;
		ListNode l11 = new ListNode(5);
		ListNode l12 = new ListNode(6);
		ListNode l13 = new ListNode(4);
		l11.next = l12;
		l12.next = l13;
		ListNode o=addTwoNumbers(l1, l11);
		while(o!=null){
			System.out.println(o.val);
			o=o.next;
		}
		
	}

}
