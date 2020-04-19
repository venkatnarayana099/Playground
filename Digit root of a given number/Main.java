#include<iostream>

int main()
{
  int n,r,sum;
  std::cin>>n;
  while(n>=10)
  {
    sum=0,r=0;
  while(n>0)
  {
    r=n%10;
    sum=sum+r;
    n=n/10;
  }
  n=sum;
  }
  std::cout<<n;
}