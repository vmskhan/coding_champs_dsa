class Solution {
public:
    string reverseWords(string s) {
        string k="";
        string t="";
        for(char c:s){
            if(c==' ')
            {
                if(t!="")
                {
                    k=t+k;
                    t="";
                }
            }
            else
            {
                if(t=="" && k!="")
                    k=" "+k;
                t=t+c;
            }
        }
        k=t+k;
        return k;
    }
};