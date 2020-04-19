#include<iostream>
int main(){
  // Type your code here
  int n, sum=1;
    std::cin>>n;
    for(int i = 1; i <=n; i++){
        sum = sum * i;
    }
    std::cout<<sum;
}