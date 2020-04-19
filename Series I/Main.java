#include<iostream>
int main()
{
  int a,i;
  std::cin>>a;
  float b=0.5;
  std::cout<<b<<" ";
  for(i=2;i<=a;i++)
  {
    b=b*3;
    std::cout<<b<<" ";
  }
}