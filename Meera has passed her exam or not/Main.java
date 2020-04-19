#include<iostream>
int main()
{
  // Type your code here
  int n,i;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    std::cin>>a[i];
  int v,c=0;
  std::cin>>v;
  for(i=0;i<n;i++)
  {
    if(a[i]==v)
      c=1;
  }
  if(c==1)
    std::cout<<"She passed her exam";
  else
    std::cout<<"She failed";
}