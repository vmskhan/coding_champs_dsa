void nLetterTriangle(int n) {
    // Write your code here.
    for(int i=1;i<=n;i++)
    {
        int a=i;
        for(int j=0;a<=n;j++,a++)
            cout<<char(65+j)<<" ";
        cout<<endl;
    }
}