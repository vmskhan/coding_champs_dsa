void numberCrown(int n) {
    // Write your code here.
    int j=0;
    for(int i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
            cout<<j<<" ";
        for(j=1;j<=(n-i)*2;j++)
            cout<<"  ";
        for(j=1;j<=i;j++)
            cout<<(i-j+1)<<" ";
        cout<<endl;
    }
}