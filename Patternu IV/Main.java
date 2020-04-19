#include <iostream>
using namespace std;
int main() {
    // Type your code here
  int i,j,a,b=1;
  cin>>a;
  for(i=1;i<=a;i++)
  {
    for(j=1;j<=a;j++)
    {
      if(i%2==0)
      {
        if(j==1)
        {
          
          cout<<b;
          b=b-1;
        }
        else
        {
          cout<<b;
        }
      }
      else
      {
        if(j==a)
        {
          b=b+1;
          cout<<b;
        }
        else
        {
          cout<<b;
        }
      }
    }
    b=b+1;
    cout<<"\n";
  }
}