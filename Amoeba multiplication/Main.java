#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,n,i;
  cin>>n;
  a=0;
  b=1;
  for (i=1;i<=n-2;i++)
  {
    c=a+b;
    a=b;
    b=c;
  }
  cout<<c;
}