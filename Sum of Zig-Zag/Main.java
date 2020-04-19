#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j,s=0,s1=0,s2=0,s3=0;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  for(j=0;j<c-1;j++)
  {
    s1=s1+a[0][j];
  }
  for(j=1;j<c;j++)
  {
    s2=s2+a[r-1][j];
  }
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      if(i+j==r-1)
        s3=s3+a[i][j];
    }
  }
  
  s=s1+s2+s3;
    cout<<"Sum of Zig-Zag pattern is "<<s;
}