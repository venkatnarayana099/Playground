#include<iostream>
int main()
{
  // Type your code here
  int n,i;
  std::cin>>n;
  int a[n];
  for(i=0;i<n;i++)
    std::cin>>a[i];
  int res=0;
  for(i=0;i<n;i++)
  {
    if(a[i]>res)
      res=a[i];
  }
  std::cout<<res;
}