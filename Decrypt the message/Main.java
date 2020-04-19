#include<iostream>
int main()
{
  int a,b,c,sum,i;
  std::cin>>a>>b;
  c=a+b;
  sum=1;
  for (i=2;i<c;i++)
  {
    if(c%i==0)
      sum+=i;
  }
  if(sum==c)
    std::cout<<"They can read the message";
  else
    std::cout<<"They can't read the message";
}