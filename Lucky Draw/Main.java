#include<iostream>
int main()
{
  int a,c,i;
  std::cin>>a;
  for(i=1;i<=a;i++)
  {
    if(a%i==0)
      c+=1;
  }
  if(c==2)
    std::cout<<"Eligible";
  else
    std::cout<<"Not eligible";
}