
//problem-2(i)

class Solution {
    public:
      // Function to find element in sorted array
      // arr: input array
      // k: element to be searched
      bool searchInSorted(vector<int>& arr, int k) {
  
          // Your code here
          for(int i=0;i<arr.size();i++){
              if(arr[i]==k)
              return true;
          }
      return false;
      }
  };

  //problem-2(ii)

  class Solution {
    public:
        int search(vector<int>& nums, int target) {
            for(int i=0;i<nums.size();i++){
                  if(nums[i]==target)
                  return i;
              }
          return -1;
        }
    };
