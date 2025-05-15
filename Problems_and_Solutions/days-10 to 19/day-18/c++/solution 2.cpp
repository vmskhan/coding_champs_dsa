class Solution {
public:
    int maxProfit(vector<int>& prices) {
        int n=prices.size();
        int min=prices[0];
        int i=0;
        int maxProfit=0;
        int temp=0;
        for(;i<n-1;i++)
        {
            if(prices[i]<prices[i+1])
            {
                if(prices[i]<min)
                    min=prices[i];
                temp=prices[i+1]-min;
                if(temp>maxProfit)
                    maxProfit=temp;
            }
        }
        return maxProfit;
    }
};