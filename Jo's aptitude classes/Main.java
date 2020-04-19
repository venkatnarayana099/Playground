#include<iostream>
int main()
{
  int a,b,c,res;
  std::cin>>a>>b>>c>>res;
  int small=0;
  if(a<b && a<c)
    small=a;
  else if(b<c)
    small=b;
  else
    small=c;
  
  int gcd=0;
  {
    if((a%small==0) && (b%small==0) && (c%small==0))
      gcd=small;
  }
  if(gcd==res)
    std::cout<<"Answer is correct.";
  else
    std::cout<<"Answer is wrong.";
}