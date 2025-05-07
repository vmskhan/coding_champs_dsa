class Solution {
public:
    bool isValid(string s) {
        stack<char> chars=stack<char>{};
        chars.push('n');
        char topEle='a'; 
        chars.push(s[0]);
        for(int i=1;i<s.size();i++)
        {
            topEle=chars.top();
            if(s[i]=='(' || s[i]=='[' || s[i]=='{')
                chars.push(s[i]);
            else{
                if(s[i]==')' && topEle=='(')
                    chars.pop();
                else if(s[i]=='}' && topEle=='{')
                    chars.pop();
                else if(s[i]==']' && topEle=='[')
                    chars.pop();
                else
                    return false;
            }
        }
        return chars.size()==1;
    }
};