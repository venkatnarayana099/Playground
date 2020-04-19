#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,c;
  cin>>n;
  cout<<n<<"\n";
  while(n!=1)
  {
    if(n%2==0)
      n=n/2;
    else
      n=3*n+1;
    c+=1;
    cout<<n<<"\n";
  }
  cout<<c;
}