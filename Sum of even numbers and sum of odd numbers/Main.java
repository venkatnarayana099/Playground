#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,a[n],i,o=0,e;
  cin>>n;
  for(i=0;i<n;i++)
    cin>>a[i];
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
      e=e+a[i];
    else
      o=o+a[i];
  
  }
  
  cout<<"The sum of the even numbers in the array is "<<e<<"\n";
  cout<<"The sum of the odd numbers in the array is "<<o;
}