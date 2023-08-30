//This file contain every type of linked list as class CL,SL,DLL(Circular Linked List,Singly Linked List,Doubly Linked List.)
//And main function with every opration in user friendly loop.
//To know more run this java program

import java.util.Scanner;

public class LinkedList {
    public static void main(String[] agrs){
       Scanner obj = new Scanner(System.in);
       //here user can choose type of linked list by just uncommenting it and comment to others
       //CL abb= new CL();
       //DLL abb= new DLL();
        SL abb= new SL();
       int des = 2;

       while(des!=0){
        System.out.println("Press 1. For Insert element");
        System.out.println("Press 2. For Delete element");
        System.out.println("Press 3. For Display the element");
        int n=obj.nextInt();
        switch(n){
            case 1:  abb.display();
                     System.out.println("Enter the element whitch you want to insert: ");
                     int a=obj.nextInt();
                     abb.insert(a);
            break;
            case 2: System.out.println("Deleted Element "+abb.delet());
            break;
            case 3: abb.display();
            break;          
        }
        System.out.println("Press 0: For Exit or any thing to continue");
        des=obj.nextInt();
       }
      
       abb.display();
       
    }
}

//SL stand for singly linked list
class SL{
    private Node tail;
    private Node head;
    private int size;
    //creating node
    class Node{
      public int value;
      public Node next;
  
      public Node(){}
      public Node(int value){
        this.value = value;
      }
    }
    public SL(){
        this.size=0;
    }
    //Deletion
    public int delet(){
      if(head==null){
        System.out.println("List is empty");
        return 0;
      }
      else{
        Scanner obj=new Scanner(System.in);
        display(); 
        System.out.println("Enter the index which you want to delete: ");
        int index=obj.nextInt();
        Node node = new Node();
        node = head;
        int a=0;
        if(index==1){
          head = head.next;
        }
        else{
        for(int i=2; i<index; i++){
          node=node.next; 
        }
        a=node.next.value;
        node.next = node.next.next;
        }
        size-=1;
        return a;
      }
        
    }
    //Insertion
    public void insert(int x){
        Node node = new Node(x);
        if(head == null){
           head = node;
           tail = node;
        }
        else{
          Scanner obj = new Scanner(System.in);
          display();
          System.out.println("At which position u want add: ");
          int pos=obj.nextInt();
          if(pos==1){
            node.next=head;
            head = node;
          }
          else if(size == (pos-1)){
            tail.next=node;
            tail=node;
            
          }
          else{
            Node age = new Node();
            age=head;
            for(int i=1 ; i<pos; i++){ 
                age=age.next;  
              }
              node.next = age.next;
              age.next = node;
          }
        }
        size+=1;   
    }
    //display
    public void display(){
      if(head==null){
        System.out.println("List is empty");
      }
      else{
        Node temp= new Node();
        temp=head;
        while(temp!=null){
            System.out.print(temp.value+ " -> ");
            temp=temp.next;
        }
        System.out.print("\n");
      }
    }
    public SL deletedubli(){
      SL Newsl = new SL();
      Node temp = new Node();
      temp = head;
      while(temp.next != null){
        if(temp.value == temp.next.value){
           temp.next = temp.next.next;
        }
        temp = temp.next;
      }
      return Newsl;
   }
   
}

//CL stand for circular Linked list
 class CL{
    private Node tail;
    private Node head;
    private int size;
    public CL(){
        this.size=0;
    }
    private class Node{
        private int value;
        private Node next;
        
        public Node(){}

        public Node(int value){
            this.value = value;
        }
    }
    //Deletion
    public int delet(){
      if(head==null){
        System.out.println("List is empty");
        return 0;
      }
      else{
        Scanner obj=new Scanner(System.in);
        display(); 
        System.out.println("Enter the index which you want to delete: ");
        int index=obj.nextInt();
        Node node = new Node();
        node = head;
        int a=0;
        if(index==1){
          head = head.next;
        }
        else{
        for(int i=2; i<index; i++){
          node=node.next; 
        }
        a=node.next.value;
        node.next = node.next.next;
        }
        return a;
      }
      
    }
    //Insertion
    public void insert(int x){
        Node node = new Node(x);
        if(head == null){
           head = node;
           tail = node;
        }
        else{
          Scanner obj = new Scanner(System.in);
          display();
          System.out.println();
          System.out.println("At which position u want add: ");
          int pos=obj.nextInt();
          if(pos==1){
            node.next=head;
            head = node;
          }
          else if(size == (pos-1)){
            tail.next=node;
            tail=node;
            
          }
          else{
            Node piche = new Node();
            Node age = new Node();
            age=head;
            for(int i=1 ; i<pos; i++){
                piche=age; 
                age=age.next;  
              }
              node.next = age;
              piche.next = node;
          }
        }
        size+=1;   
    }
    //display
    public void display(){
      if(head==null){
        System.out.println("List is empty");
      }
      else{
        Node temp= new Node();
        temp=head;
        while(temp!=null){
            System.out.print(temp.value+ " -> ");
            temp=temp.next;
        }
        System.out.print("/n");
      }
    }
}

//DLL is stand for Double linked list
 class DLL{
    private Node tail;
    private Node head;
    private int size;
    public DLL(){
        this.size=0;
    }
    private class Node{
        private int value;
        private Node next;
        private Node prev;
        public Node(){}

        public Node(int value){
            this.value = value;
        }
    }
    //Deletion
    public int delet(){
      if(head==null){
        System.out.println("List is empty");
        return 0;
      }
      else{
        Scanner obj=new Scanner(System.in);
        display(); 
        System.out.println("Enter the index which you want to delete: ");
        int index=obj.nextInt();
        Node node = new Node();
        node = head;
        int a=0;
        if(index==1){
          head = head.next;
        }
        else{
        for(int i=2; i<index; i++){
          node=node.next; 
        }
        a=node.next.value;
        node.next = node.next.next;
        }
        return a;
      }
      
    }
    //Insertion
    public void insert(int x){
        Node node = new Node(x);
        if(head == null){
           head = node;
           tail = node;
        }
        else{
          Scanner obj = new Scanner(System.in);
          display();
          System.out.println();
          System.out.println("At which position u want add: ");
          int pos=obj.nextInt();
          if(pos==1){
            head.prev=node;
            node.next=head;
            head = node;
          }
          else if(size == (pos-1)){
            tail.next=node;
            node.prev=tail;
            tail=node; 
          }
          else{
            Node age = new Node();
            age=head;
            for(int i=1 ; i<pos-1 ; i++){
                age=age.next;  
              }
              age.next.prev =node; 
              node.next = age.next;
              node.prev = age;
              age.next = node;
          }
        }
        size+=1;   
    }
    //display
    public void display(){
      if(head==null){
        System.out.println("List is empty");
      }
      else{
        Node temp= new Node();
        temp=head;
        while(temp!=null){
            System.out.print(temp.value+ " -> ");
            temp=temp.next;
        }
        System.out.print("\n");
      }
    }
}
