

public class KReverseLinkedList2 {
	static ListNode head=null;
	static int size=0;
    static class ListNode{
      int val;
      ListNode next;
      ListNode(int val){
    	 this.val=val;
    	 next=null;
      }
    }
    public static void insertBegining(int value) {
    	ListNode newNode=new ListNode(value);
    	if(head==null){
    	  head=newNode;
    	  return;
    	}
    	newNode.next=head;
    	head=newNode;
    }
	public static void print(ListNode head) {
	      ListNode temp=head;
	      while(temp!=null){
	    	 System.out.print(temp.val+" ");
	    	  temp=temp.next;
	      }
	      System.out.println();
	    } 
    public static ListNode reverseKGroup(ListNode A, int B) {
        if(A==null || A.next==null) return A;
        int n=countNode(A);
        n=n/B;   
        ListNode curr=A;
        A=null;
        ListNode ptr=null,temp=null,prev=null,Next=null;
        while(n>0){
       	int pos=1; 
           temp=curr;
       	while(curr!=null && pos<=B){
       	  Next=curr.next;
       	  curr.next=prev;
       	  prev=curr;
       	  curr=Next;
       	  pos+=1;	
       	}
       	if(A==null){
       	  A=prev;
       	}
       	else{	
       	 ptr.next=prev;
    
       	}
       	ptr=temp;
       	ptr.next=null;	
         n-=1;   
        }
        temp.next=curr;
        head=A;
        return A;	      
       }
       public static int countNode(ListNode A){
          int count=0;
          ListNode temp=A;
           while(temp!=null){
             count+=1; 
             temp=temp.next;  
           }
           return count;
       }	
	
	
	public static void main(String[] args) {
		insertBegining(10);
		insertBegining(9);
		insertBegining(8);
		insertBegining(7);
		
		insertBegining(6);
		insertBegining(5);
		
		insertBegining(4);
		insertBegining(3);
		
		insertBegining(2);
		insertBegining(1);
		print(head);
		
		reverseKGroup(head,4);
        print(head);

	}

}
