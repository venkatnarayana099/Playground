#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int r,c,i,j,s,m,R,C;
  cin>>r>>c;
  int a[r][c];
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      cin>>a[i][j];
    }
  }
  cout<<"Sum of rows is ";
  for(i=0;i<r;i++)
  {
    for(j=0;j<c;j++)
    {
      s=s+a[i][j];
    }
    cout<<s<<" ";
    if(s>m)
    {
      m=s;
      R=i+1;
    }
    s=0;
  }
  cout<<"\n";
  m=0;
  cout<<"Row "<<R<<" has maximum sum"<<"\n";
  cout<<"Sum of columns is ";
  for(i=0;i<c;i++)
  {
    for(j=0;j<r;j++)
    {
      s=s+a[j][i];
    }
    cout<<s<<" ";
    if(s>m)
    {
      m=s;
      C=i+1;
    }
    s=0;
  }
  cout<<"\n";
  cout<<"Column "<<C<<" has maximum sum";
}