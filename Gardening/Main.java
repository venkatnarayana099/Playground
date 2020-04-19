#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x,y,a,b,c,d,m;
  cin>>x>>y>>m;
  a=x+1;
  b=x+x;
  c=(x*y)-x;
  d=c-x+1;
  if((m>=a && m<=b) || (m<=c && m>=d))
     cout<<"It is a mango tree";
  else
     cout<<"It is not a mango tree";
}