#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,sum,n,v;
  cin>>a;
  v=a;
  while(a>0)
  {
    n=a%10;
    sum=sum+n;
    a=a/10;
  }
  if(v%sum==0)
    cout<<"Harshad Number";
  else
    cout<<"Not Harshad Number";
}