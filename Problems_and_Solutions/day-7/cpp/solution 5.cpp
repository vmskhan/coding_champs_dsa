//optimized version
class Solution {
public:
    bool rotateString(string s, string goal) {
        int i=0,j=0,startIndex=0,strLength=goal.size();
        
        if(s.size()!=strLength)
            return false;
        for(i=0;i<strLength;i++)
        {
            if(goal[i]==s[0])
            {
                startIndex=i;
                for(j=0;j<strLength;j++)
                {
                    if(s[j]!=goal[startIndex])
                        break;
                    startIndex=(startIndex+1)%strLength;
                }
                if(j==strLength)
                    return true;
            }
        }   
        return false;
    }

    //** below is the unoptimized version of above code
    // bool rotateString(string s, string goal) {
    //     int i=0,strLength=goal.size();
    //     vector<int> startIndexList=vector<int>{};
    //     if(s.size()!=strLength)
    //         return false;
    //     for(i=0;i<strLength;i++)
    //     {
    //         if(goal[i]==s[0])
    //             startIndexList.insert(startIndexList.end(),i);
    //     }
    //     if(startIndexList.size()==0)
    //         return false;
    //     else{
    //         for(int startIndex: startIndexList)
    //         {
    //             for(i=0;i<strLength;i++)
    //             {
    //                 if(s[i]!=goal[startIndex])
    //                     break;
    //                 startIndex=(startIndex+1)%strLength;
    //             }
    //             if(i==strLength)
    //                 return true;
    //         }
    //         return false;
    //     }
    // }
};