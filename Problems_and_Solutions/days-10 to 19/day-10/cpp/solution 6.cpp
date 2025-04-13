void getNumberPattern(int n) {
    int i=0;
    int j=0;
    int lim=2*(n)-1;
    for(i=1;i<=lim;i++)
    {
        for(j=1;j<=lim;j++)
        {
            if(i<=n)
            {
                if(j<i)
                    cout<<n-j+1;
                if(j>=i && j<=lim-i+1)
                    cout<<n-i+1; //or use i%n+1
                if(j>lim-i+1)
                    cout<<j-n+1;    
            }
            if(i>n)
            {
                if(j>=lim-i+1 && j<=i)
                    cout<<i-n+1;
                if(j<lim-i+1)
                    cout<<n-j+1;
                if(j>i)
                    cout<<j-n+1; //or use n-lim+j
            }
        }
        cout<<endl;
    }

}