#include<iostream>
using namespace std;


// creating a class for each node in a linked list
class Node{
    public:
        int data; //data in a node
        Node* next; //pointer to next node in LL

    Node(int data){  //class constructor
        this->data=data;
        this->next=NULL;
    }
};



//function to merge two sorted linked list
Node* solve(Node* head1,Node* head2){
    Node*curr1=head1;
    Node*next1=curr1->next;
    Node*curr2=head2;
    Node*next2=curr2->next;
    
    
    while(next1!=NULL && curr2!=NULL){ 
        if((curr2->data >=curr1->data)&&(curr2->data<=next1->data)){
            curr1->next=curr2;
            next2=curr2->next;
            curr2->next=next1;
            
            curr1=curr2;
            curr2=next2;
        }else{
            curr1=next1;
            next1=next1->next;
        }
    }
    if(next1==NULL){
                curr1->next=curr2;
                return head1;
            }
    return head1;
    
};

//driver code for merging Linked list
Node* Merging_LL(Node* head1, Node* head2)  
{  
    if(head1->data <= head2->data){
        return solve(head1,head2);
    }else{
        return solve(head2,head1);
    } 
}; 


//function to insert node at tail
void InsertAtTail(Node*&tail,int data){
    Node*tmp=new Node(data);
    tail->next=tmp;
    tail=tmp;
}

//function to print nodes in LL
void printll(Node*&head){
    Node*tmp=head;
    while (tmp!=NULL){
        cout<<tmp->data<<" ";
        tmp=tmp->next;
    }
}

int main(){
    
    Node* node1= new Node(15); //initialising node for 1st LL
    Node* head1=node1;
    Node* tail1=node1;


    InsertAtTail(tail1,25);
    InsertAtTail(tail1,30);
    printll(head1);
    cout<<endl;

    Node* node2= new Node(10); //Initialising node for 2nd LL.
    Node* head2=node2;
    Node* tail2=node2;


    InsertAtTail(tail2,20);
    InsertAtTail(tail2,35);
    printll(head2);
    cout<<endl;

    Node* ans=Merging_LL(head1,head2);
    printll(ans);

    return 0;
}