class Solution {
public:
    string removeOuterParentheses(string s) {
        int count=s.size();
        int i=0;
        int lim=0;
        for(;count>0;count--)
        {
            if(s[i]=='(') 
            {
                if(lim==0)
                    s.erase(i, 1);
                else
                    i++;
                lim++;
            }
            else if(s[i]==')') 
            {
                if(lim==1)
                    s.erase(i,1);
                else
                    i++;
                lim--;
            }
            else
                i++;
        }
    return s;
    }
};