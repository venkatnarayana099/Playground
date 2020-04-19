#include<iostream>
int main(){
  // Type your code here
  int n,m=0,f=0;
  std::cin>>n;
  int a[n],i;
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
  }
  for(i=0;i<n;i++)
  {
    if(a[i]%2==0)
    {
      f=f+1;
    }
    else
      m=m+1;
  }
  std::cout<<m<<"\n"<<f;
}