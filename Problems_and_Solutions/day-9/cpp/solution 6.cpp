void getStarPattern(int n) {
    // Write your code here.
    int i=0;
    int j=0;
    for(i=1;i<=n;i++)
    {
        for(j=1;j<=n;j++)
        {
            if(i==1 || i==n)
                cout<<"*";
            else if(j==1 || j==n)
                cout<<"*";
            else
                cout<<" ";
        }
        cout<<endl;
    }
}
