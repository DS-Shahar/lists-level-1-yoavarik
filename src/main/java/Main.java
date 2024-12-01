import java.util.Scanner;
class Main 
{
  public static void main(String[] args) 
  {
  int [] a ={1,2,3,4,5,5};
    arrayToList(a);
  }
    public static Node<Integer> arrayToList(int[] array) 
  {
        Node<Integer> dummy = new Node<Integer>(0); 
        Node<Integer> current = dummy;
        for (int i=0; i<array.length();i++) 
        {
            current.setNext(new Node<Integer>(num));
            current = current.getNext();
        }
        return dummy.getNext();
    }

    public static void printList(Node<Integer> head) 
  {
        Node<Integer> current = head;
        while (current != null) 
        {
            System.out.println(current.getValue());
            current = current.getNext();
        }
    }
    public static void printReverseRecur(Node<Integer> head) 
  {
        if (head == null) 
          return;
        printReverse(head.getNext());
        System.out.println(head.getValue());
    }
  public static Node<Integer> buildList() 
  {
        Scanner scanner = new Scanner(System.in);
        Node<Integer> dummy = new Node<>(0); 
        Node<Integer> current = dummy;
        while (true) 
        {
            int num = scanner.nextInt();
            if (num == -1) break;
            current.setNext(new Node<>(num));
            current = current.getNext();
        }
        return dummy.getNext();
    }
  public static void printEven(Node<Integer> head) 
  {
        Node<Integer> current = head;
        while (current != null) 
        {
            if (current.getValue() % 2 == 0) 
            {
                System.out.println(current.getValue());
            }
            current = current.getNext();
        }
    }
  public static boolean containsRecur(Node<Integer> head, int num) 
  {
        if (head == null) return false;
        if (head.getValue() == num) return true;
        return contains(head.getNext(), num);
    }
  public static Node<Integer> dell(Node<Integer> head, int p)
  {
   head = new Node<Integer>(null, head);
   Node<Integer> curr = head;
   while (curr != null) 
   {
      if(curr.getNext().getValue()==p+.)
      {
         curr.setNext(curr.getNext().getNext());
         return head.getNext();
       }
      curr = curr.getNext();
   }
    return head.getNext();
  } 
public static Node<Integer> removeAtPosition(Node<Integer> head, int pos) 
  {
        if (head == null || position < 1)
          return head;
        Node<Integer> dummy = new Node<>(0, head);
        Node<Integer> current = dummy;
        for (int i = 1; i < pos; i++) 
        {
            if (current.getNext() == null) 
              return head;
            current = current.getNext();
        }
        if (current.getNext() != null) 
        {
            current.setNext(current.getNext().getNext());
        }
        return dummy.getNext();
    }
    public static boolean allInList(Node<Integer> l1, Node<Integer> l2) 
  {
        if (l1 == null) 
          return true;
        return isInList(l2, l1.getValue()) && allInList(l1.getNext(), l2);
    }
    private static boolean isInList(Node<Integer> head, int val) 
  {
        if (head == null) 
          return false;
        if (head.getValue() == val) 
          return true;
        return isInList(head.getNext(), val);
    }
    public static void printCommonValues(Node<Integer> l1, Node<Integer> l2) 
  {
        Node<Integer> current1 = l1;
        while (current1 != null) 
        {
            Node<Integer> current2 = l2;
            while (current2 != null)
              {
                if (current1.getValue().equals(current2.getValue())) 
                {
                    System.out.println(current1.getValue());
                }
                current2 = current2.getNext();
            }
            current1 = current1.getNext();
        }
    }
  public static Node<Integer> createCommonList(Node<Integer> l1, Node<Integer> l2) 
  {
        Node<Integer> dummy = new Node<>(0);
        Node<Integer> p = dummy;
        Node<Integer> current1 = l1;
        while (current1 != null) 
        {
            Node<Integer> current2 = l2;
            while (current2 != null) 
            {
                if (current1.getValue().equals(current2.getValue())) 
                {
                    p.setNext(new Node<>(current1.getValue()));
                    p = p.getNext();
                }
                current2 = current2.getNext();
            }
            current1 = current1.getNext();
        }
        return dummy.getNext();
    }
   public static Node<Integer> removeCommonValues(Node<Integer> l1, Node<Integer> l2) 
  {
        Node<Integer> dummy = new Node<>(0, l1);
        Node<Integer> current = dummy;
        while (current != null && current.getNext() != null)
          {
            Node<Integer> check = l2;
            boolean found = false;
            while (check != null) 
            {
                if (current.getNext().getValue().equals(check.getValue())) 
                {
                    found = true;
                    break;
                }
                check = check.getNext();
            }
            if (found) 
            {
                current.setNext(current.getNext().getNext());
            }
            else 
            {
                current = current.getNext();
            }
        }
        return dummy.getNext();
    }
}


