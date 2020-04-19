#include<iostream>
int main()
{
  int a,b,i,j;
  std::cin>>a;
  for(i=1;i<=4;i++)
  {
    for(j=0;j<i;j++)
    {
      std::cout<<a;
    }
    b=a;
    a=a+1;
    std::cout<<"\n";
  }
  for(i=1;i<=4;i++)
  {
    for(j=i;j<=4;j++)
    {
      std::cout<<b;
    }
    b=b-1;
    std::cout<<"\n";
  }
}