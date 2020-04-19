#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,r,v,n;
  cin>>a;
  while(a>0)
  {
    r=a%10;
    if(r%2==0)
      v=v+r;
    else
      n=n+r;
    a=a/10;
  }
  if(v==n)
    cout<<"Yes";
  else
    cout<<"No";
}