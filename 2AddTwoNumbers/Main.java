import java.util.List;

class ListNode {
    int val;
    ListNode next;
    ListNode() {
        //empty constructor     
    }
    ListNode(int val) { 
        this.val = val; 
    }
    ListNode(int val, ListNode next) { 
        this.val = val; 
        this.next = next; 
    }
 }



    class Solution {
        
        public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

            ListNode l3 = new ListNode(0);
            ListNode head = l3;

            int carry = 0;
            while(l1!=null || l2!=null) {

                if (l1 == null) {
                    l1 = new ListNode(0);
                }

                if (l2 == null) {
                    l2 = new ListNode(0);         
                }

                int sum = l1.val + l2.val + carry;
                carry = sum/10;
                int lastDigit = sum % 10;
                
                ListNode newNode = new ListNode(lastDigit);
                l3.next = newNode;

                if (l1!=null) //if its alr null, just use the same node, you can't create a null.next anyways.
                    l1 = l1.next;
                if (l2!=null) //if its alr null, just use the same node, you can't create a null.next anyways.
                    l2 = l2.next;
                l3 = l3.next;
            }

            if (carry > 0) {
                l3.next = new ListNode(1);
            }

            return head.next;
            
        }
    }