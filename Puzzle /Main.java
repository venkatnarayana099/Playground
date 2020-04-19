#include<iostream>
int main()
{
    // Type your code here
  int r,c,i,j;
  std::cin>>r>>c;
  int a[r][c]; 
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
      std::cin>>a[i][j];
  }
  for(j=0;j<c;j++)
  {
  for(i=0;i<r;i++)
  {
    std::cout<<a[i][j]<<" ";
  }
    std::cout<<"\n";
  }
}