void nBinaryTriangle(int n) {
    // Write your code here.
    for(int i=0;i<n;i++)
    {
        for(int j=0;j<=i;j++)
            cout<<!((i+j)%2)<<" ";
        cout<<endl;
    }
}