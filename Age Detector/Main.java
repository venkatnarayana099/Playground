#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int b,c,a;
  cin>>b>>c;
  if(c==0)
  {
    a=100-b;
  }
  else
  {
    a=c-b;
    if(a<0)
      a=100+a;
  }
  cout<<a;
}