# DAY - 29

## Problem 1
- Given the head of a linked list, determine whether the list contains a loop. If a loop is present, return the number of nodes in the loop, otherwise return 0.

- Note: 'c' is the position of the node which is the next pointer of the last node of the linkedlist. If c is 0, then there is no loop.

- [Practice](https://www.geeksforgeeks.org/problems/find-length-of-loop/1)

> Striver Sheet=> Step 6: Learn LinkedList >Lec-3: Medium Problems of LL > Length of Loop in LL

## Problem 2
- Given an increasing sorted rotated array arr of distinct integers. The array is right-rotated k times. Find the value of k.
- Let's suppose we have an array arr = [2, 4, 6, 9], so if we rotate it by 2 times so that it will look like this:
 - After 1st Rotation : [9, 2, 4, 6]
 - After 2nd Rotation : [6, 9, 2, 4]

```
Example 1:

Input: arr = [5, 1, 2, 3, 4]
Output: 1
Explanation: The given array is 5 1 2 3 4. The original sorted array is 1 2 3 4 5. We can see that the array was rotated 1 times to the right.

Example 2:

Input: arr = [1, 2, 3, 4, 5]
Output: 0
Explanation: The given array is not rotated.
```
- [Practice](https://www.geeksforgeeks.org/problems/rotation4723/1)

> Striver sheet => Step 4: Binary Search >Lec-1: BS on 1D Arrays > Find out how many times has an array been rotated

## Problem 3
- Given a string s, find the length of the longest substring without duplicate characters.

```
Example 1:

Input: s = "abcabcbb"
Output: 3
Explanation: The answer is "abc", with the length of 3.

Example 2:

Input: s = "bbbbb"
Output: 1
Explanation: The answer is "b", with the length of 1.

Example 3:

Input: s = "pwwkew"
Output: 3
Explanation: The answer is "wke", with the length of 3.
Notice that the answer must be a substring, "pwke" is a subsequence and not a substring.
```
- [Practice](https://leetcode.com/problems/longest-substring-without-repeating-characters/description/)

> Striver sheet => Step 10: Sliding window & two pointer combined problems >Lec-1: Medium problems > Longest Substring Without Repeating Characters