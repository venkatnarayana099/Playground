#include<iostream>
int bact(int ,int );

int main()
{
  int m,n,res,req;
  std::cin>>m>>n>>req;
  res=bact(m,n);
  if(res>=req)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}


int bact(int a,int b)
{
  for(int i=2;i<=b;i++)
    a=a+a;
  return a;
}