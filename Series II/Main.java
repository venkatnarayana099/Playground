#include<iostream>
int main()
{
  int a,b,res,i;
  std::cin>>a;
  b=11;
  res=b*b;
  std::cout<<res<<" ";
  for(i=2;i<=a;i++)
  {
    b=b+4;
    res=b*b;
    std::cout<<res<<" ";
  }
}