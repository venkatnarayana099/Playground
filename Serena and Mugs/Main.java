#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,c,a[n],res,i;
  cin>>n>>c;
  for(i=0;i<n;i++)
    cin>>a[i];
  for(i=0;i<n;i++)
    res=res+a[i];
  if(res<=c)
    cout<<"YES";
  else
    cout<<"NO";
}