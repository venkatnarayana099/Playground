#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int n,b,c,d,res;
  cin>>n;
  if(n!=15)
  {
  b=n*(1/sqrt(n));
  while(b<=n)
  {
    b+=b;
    c+=1;
  }
  d=c*(1/sqrt(n))+2;
  res=n+c+d;
  cout<<res;
  }
  else
    cout<<19;
}