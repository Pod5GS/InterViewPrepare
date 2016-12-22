package GetOffer;

import util.ListNode;

public class Q13 {
	ListNode FindKthToTail(ListNode pListHead, int k){
		if(pListHead == null || k <= 0)
			return null;
		ListNode pAhead = pListHead;
		ListNode pBehind = pListHead;
		for(int i = 0; i < k - 1; i++){
			if(pAhead.next != null)
				pAhead = pAhead.next;
			else
				return null;
		}
		while(pAhead.next != null){
			pAhead = pAhead.next;
			pBehind = pBehind.next;
		}
		return pBehind;
	}
}
