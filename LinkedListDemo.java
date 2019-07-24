package linkedList;

public class LinkedListDemo {
	public static void main(String[] args) {
	    LinkedList list = new LinkedList();

	    int [] array = {45,12,85,32,89,39,69,44,42,1,6,8,100};
	    int temp;
	    for (int i = 1; i < array.length; i++) {
	     for (int j = i; j > 0; j--) {
	      if (array[j] < array [j - 1]) {
	       temp = array[j];
	       array[j] = array[j - 1];
	       array[j - 1] = temp;
	      }
	     }
	    }
		   for (int i = 0; i < array.length; i++) {
			     list.insertAtHead(array[i]);
			   }

	    System.out.println(list);

	  }

}
