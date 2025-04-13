class Solution {
public:
    string longestCommonPrefix(vector<string>& strs) {
        string commonPrefix="";
        int noOfStrings=strs.size();
        int i=0,j=0;
        for(j=0;j<strs[0].size();j++)
        {
            for(i=1;i<noOfStrings;i++)
            {
                if(j<strs[i].size())
                {
                    if(strs[i][j]!=strs[0][j])
                        break;
                }
                else
                    break;
            }
            if(i==noOfStrings)
                commonPrefix=commonPrefix+strs[0][j];
            else
                break;
        }   
        return commonPrefix;
    }
};