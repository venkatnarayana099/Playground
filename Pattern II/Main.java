#include<iostream>
int main()
{
  int a,b=1,v=2,c=-1,d,i,j;
  std::cin>>a;
  for(i=1;i<=a;i++)
  {
     for(j=1;j<=(2*i)-1;j++)
     {
        if(i%2==0)
        {
            if(j%2==0) 
            {
                std::cout<<"*";
            }
            else
            {
                std::cout<<b;
                d=b;
                b=b-1;
            }
        }
        else
        {
            if(j%2==0) 
            {
                std::cout<<"*";
            }
            else
            {
                std::cout<<b;
                d=b;
                b=b+1;
            }
        }
     }
     b=d;
     c=c+1;
     if(c==2)
     {
         v=v+2;
         c=0;
     }
     b=b+v;
     std::cout<<"\n";
  }
}