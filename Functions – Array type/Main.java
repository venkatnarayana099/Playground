#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,i,e=0,o=0;
  cout<<"Enter the number of elements in the array"<<"\n";
  cin>>r;
  int a[r];
  cout<<"Enter the elements in the array"<<"\n";
  for(i=0;i<r;i++)
  {
      cin>>a[i];
   }
  for(i=0;i<r;i++)
  {
    if(a[i]%2==0)
      e=e+1;
    else
      o=o+1;
  }
  if(e>0 && o>0)
    cout<<"The array is Mixed";
  else if(o==0)
    cout<<"The array is Even";
  else
    cout<<"The array is Odd";
}