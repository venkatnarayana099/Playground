#include<iostream>
int gcd(int a,int b)
{
  int n,max,i;
    if(a<b)
    n=a;
  else
    n=b;
  for(i=1;i<=n;i++)
  {
    if(a%i==0 && b%i==0)
      max=i;
  }
  std::cout<<"G.C.D of "<<a<<" and "<<b<<" = "<<max;
}
int main()
{
  //Type your code here.
  int a,b,n,max,i;
  std::cin>>a>>b;
  gcd(a,b);
}
