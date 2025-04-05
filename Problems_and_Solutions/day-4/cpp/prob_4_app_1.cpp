void nNumberTriangle(int n) {
    // Write your code here.
    for(int i=1,a=1;i<=n;i++)
    {
        for(int j=1;j<=i;j++,a++)
            cout<<a<<" ";
        cout<<endl;
    }
}