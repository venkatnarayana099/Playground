#include<iostream>
int main()
{
  int a,b,sum,i,j;
  std::cin>>a>>b;
  for(i=a+1;i<=b;i++)
  {
    sum=1;
    for(j=2;j<i;j++)
    {
      if(i%j==0)
        sum+=j;
    }
    if(sum==i)
      std::cout<<i<<" ";
  }
}