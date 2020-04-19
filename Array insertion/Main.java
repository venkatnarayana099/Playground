#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>n;
  cout<<"Enter the elements in the array"<<"\n";
  int a[n],i,l=0,e=0;
  for(i=0;i<n;i++)
    cin>>a[i];
  cout<<"Enter the location where you wish to insert an element"<<"\n";
  cin>>l;
  if(l>n)
  {
    cout<<"Invalid Input";
  }
  else
  {
  cout<<"Enter the value to insert"<<"\n";
  cin>>e;
  cout<<"Array after insertion is"<<"\n";
  for(i=0;i<l-1;i++)
    cout<<a[i]<<"\n";
  cout<<e<<"\n";
  for(i=l-1;i<n;i++)
    cout<<a[i]<<"\n";
  }
}