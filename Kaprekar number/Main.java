#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,nani,res,v,i,s,count=0,n,sum,r;
  cin>>a;
  nani=a;
  b=a*a;
  n=b;
  while(a>0)
  {
    a=a/10;
    count+=1;
  }
  
  for(i=1;i<=count;i++)
  {
    r=n%10;
    sum=sum*10+r;
    n=n/10;
  }
  while(sum>0)
  {
    v=sum%10;
    s=s*10+v;
    sum=sum/10;
    
  }
  res=s+n;
  if(res==nani)
    cout<<"Kaprekar Number";
  else
    cout<<"Not a Kaprekar Number";
}