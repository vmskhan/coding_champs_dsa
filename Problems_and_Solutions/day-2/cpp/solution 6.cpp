// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;
int main() {
    // Write C++ code here
    int n=5;
    
    for(int i=1;i<=n;i++)
    {
       for(int j=i;j<=n;j++)
            cout<<" ";
        for(int j=n-i;j<n;j++)
            cout<<"*";
        for(int j=1;j<i;j++)
            cout<<"*";
        cout<<endl;
    }
   
    return 0;
}