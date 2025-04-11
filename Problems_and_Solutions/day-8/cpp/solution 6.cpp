void symmetry(int n) {
    // Write your code here.
    int i=0;
    int j=0;
    for(i=1;i<=n;i++)
    {
        for(j=i;j<=n;j++)
            cout<<"* ";
        for(j=1;j<=2*(i-1);j++)
            cout<<"  ";
        for(j=i;j<=n;j++)
            cout<<"* ";
        cout<<endl;
    }
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=i;j++)
            cout<<"* ";
        for(j=1;j<=2*(n-i);j++)
            cout<<"  ";
        for(j=1;j<=i;j++)
            cout<<"* ";
        cout<<endl;
    }
}