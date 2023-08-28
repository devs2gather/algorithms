#include<iostream>
using namespace std;


//In Binary Search we use to reduce our search space on the basis of mid value calculated
bool Binary_Search(int arr[],int n,int target){
    int start=0,end=n-1;

    int mid=start+(end-start)/2;
    while(start<=end){
        if(arr[mid]==target){
            return true;
        }
        else if(arr[mid]<target){
            //if the mid value is less than target then we will move to right part i.e start=mid+1
            start=mid+1;
        }
        else{
            end=mid-1;
        }
        mid=start+(end-start)/2;
    }
    return false;
}

int main(){
    //Binary search can only be applied if the array given is monotonic(i.e either increasing or decreasing).
    //a sample array set is taken
    int arr[]={1,2,3,4,5,6};

    //calculating the size of the array.
    int size=sizeof(arr)/sizeof(int);

    //taking input from the user
    int target;
    cout<<"Enter target to search:";
    cin>>target;

    //function call
    //Binary_Search function will actually tell use whether the target is present in the array or not.
    bool answer=Binary_Search(arr,size,target);

    if(answer){
        cout<<target<<" is present";
    }
    else{
        cout<<target<<" is not present";
    }
}