class Solution {
public:
    bool isAnagram(string s, string t) {
        int length=t.size();
        if(s.size()!=length)
            return false;
        int chars[26]={};
        int i=0,pos=0;
        for(i=0;i<length;i++)
        {
            pos=s[i]-'a';
            chars[pos]=chars[pos]+1;
            pos=t[i]-'a';
            chars[pos]=chars[pos]-1;
        }   
        for(i=0;i<26;i++)
        {
            if(chars[i]>0)
                return false;
        }
        return true;
    }
};