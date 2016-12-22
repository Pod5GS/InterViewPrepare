package GetOffer;

import util.ListNode;

public class Q15 {
	public ListNode Merge(ListNode pHead1, ListNode pHead2){
		if(pHead1 == null)
			return pHead2;
		else if(pHead2 == null)
			return pHead1;
		ListNode pMergedHead = null;
		if(pHead1.key <= pHead2.key){
			pMergedHead = pHead1;
			pMergedHead.next = Merge(pHead1.next,pHead2);
		}else{
			pMergedHead = pHead2;
			pMergedHead.next = Merge(pHead1,pHead2.next);
		}
		return pMergedHead;
	}
}
