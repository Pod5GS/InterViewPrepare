package GetOffer;

import util.ListNode;

public class Q11 {
	public static void deleteListNode(ListNode pHead, ListNode pToBeDeleted){
		if(pHead == null || pToBeDeleted == null)
			return;
		ListNode pNext = pToBeDeleted.next;
		if(pNext != null){//删除的不是尾节点
			pToBeDeleted.key = pNext.key;
			pToBeDeleted.next = pNext.next;
			pNext = null;
		}else if(pHead == pToBeDeleted){//链表中只有一个元素
			pToBeDeleted = null;
			pHead = null;
		}else{//链表中有多个节点，要删除的是尾节点
			ListNode currentNode = pHead;
			while(currentNode.next != pToBeDeleted){
				currentNode = currentNode.next;
			}
			currentNode.next = null;
			pToBeDeleted = null;
		}
	}
}

