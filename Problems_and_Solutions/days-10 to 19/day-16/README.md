# DAY - 16

## Problem 1
- Given an integer array nums, find the subarray with the largest sum, and return its sum.
```
Example 1:

Input: nums = [-2,1,-3,4,-1,2,1,-5,4]
Output: 6
Explanation: The subarray [4,-1,2,1] has the largest sum 6.
Example 2:

Input: nums = [1]
Output: 1
Explanation: The subarray [1] has the largest sum 1.
Example 3:

Input: nums = [5,4,-1,7,8]
Output: 23
Explanation: The subarray [5,4,-1,7,8] has the largest sum 23.
```

- [Practice](https://leetcode.com/problems/maximum-subarray/description/)

> Striver sheet => Step 3: Solve problems on arrays>Lec-2: Medium> Kadane's Algorithm, maximum subarray sum


## Problem 2
- There is an integer array nums sorted in ascending order (with distinct values).

- Prior to being passed to your function, nums is possibly rotated at an unknown pivot index k (1 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,5,6,7] might be rotated at pivot index 3 and become [4,5,6,7,0,1,2].

- Given the array nums after the possible rotation and an integer target, return the index of target if it is in nums, or -1 if it is not in nums.

- You must write an algorithm with O(log n) runtime complexity.


```
Example 1:

Input: nums = [4,5,6,7,0,1,2], target = 0
Output: 4
Example 2:

Input: nums = [4,5,6,7,0,1,2], target = 3
Output: -1
Example 3:

Input: nums = [1], target = 0
Output: -1
```

- [Practice](https://leetcode.com/problems/search-in-rotated-sorted-array/description/)

> Striver Sheet=> Step 4: Binary Search >Lec-1: BS on 1D Arrays > Search in Rotated Sorted Array I

## Problem 3
- Given the head of a singly linked list, reverse the list, and return the reversed list.
```
Example 1:

Input: head = [1,2,3,4,5]
Output: [5,4,3,2,1]

Example 2:

Input: head = [1,2]
Output: [2,1]

Example 3:

Input: head = []
Output: []
```
- [Practice](https://leetcode.com/problems/reverse-linked-list/description/)

> Striver Sheet=> Step 6: Learn LinkedList >Lec-3: Medium Problems of LL > Reverse a LinkedList [Iterative]

## Problem 4
- Implement pow(x, n), which calculates x raised to the power n (i.e., xn).

```
Example 1:

Input: x = 2.00000, n = 10
Output: 1024.00000

Example 2:

Input: x = 2.10000, n = 3
Output: 9.
26100

Example 3:

Input: x = 2.00000, n = -2
Output: 0.25000
Explanation: 2-2 = 1/22 = 1/4 = 0.25
```

- [Practice](https://leetcode.com/problems/powx-n/description/)

> Striver Sheet=> Step 7:Recursion >Lec-1: Get a Strong Hold > Pow(x, n)
