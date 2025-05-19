# DAY - 23

## Problem 1
- Given the head of a linked list, remove the nth node from the end of the list and return its head.

```
Example 1:

Input: head = [1,2,3,4,5], n = 2
Output: [1,2,3,5]

Example 2:

Input: head = [1], n = 1
Output: []

Example 3:

Input: head = [1,2], n = 1
Output: [1]
```
- [Practice](https://leetcode.com/problems/remove-nth-node-from-end-of-list/description/)

> Striver Sheet=> Step 6: Learn LinkedList >Lec-3: Medium Problems of LL > Remove Nth node from the back of the LL

## Problem 2
- There is an integer array nums sorted in non-decreasing order (not necessarily with distinct values).

- Before being passed to your function, nums is rotated at an unknown pivot index k (0 <= k < nums.length) such that the resulting array is [nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]] (0-indexed). For example, [0,1,2,4,4,4,5,6,6,7] might be rotated at pivot index 5 and become [4,5,6,6,7,0,1,2,4,4].

- Given the array nums after the rotation and an integer target, return true if target is in nums, or false if it is not in nums.

- You must decrease the overall operation steps as much as possible.

```
Example 1:

Input: nums = [2,5,6,0,0,1,2], target = 0
Output: true

Example 2:

Input: nums = [2,5,6,0,0,1,2], target = 3
Output: false
```
- [Practice](https://leetcode.com/problems/search-in-rotated-sorted-array-ii/description/)

> Striver sheet => Step 4: Binary Search >Lec-1: BS on 1D Arrays > Search in Rotated Sorted Array II