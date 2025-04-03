// Online C++ compiler to run C++ program online
#include <iostream>
using namespace std;
int main() {
    // Write C++ code here
    int n=3;
    for(int i=1;i<=n;i++)
    {
		for(int j=i;j<=n;j++)
			cout<<"*";
        cout<<endl;
    }
    return 0;
}