#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j,s;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(a[i][j]>s)
        s=a[i][j];
    }
  }
  cout<<"The maximum element is "<<s;
}