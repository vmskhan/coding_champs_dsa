class Solution {
public:
    string removeOuterParentheses(string s) {
        string p="";
        int lim=0;
        for(char t:s)
        {
            if(t=='(') 
            {
                lim++;
                if(lim==1)
                    continue;
            }
            else if(t==')') 
            {
                lim--;
                if(lim==0)
                    continue;
            }
            p+=t;
        }
    return p;
    }
};