# DAY - 28

## Problem 1
- You are given a linked list where each element in the list is a node and have an integer data. You need to add 1 to the number formed by concatinating all the list node numbers together and return the head of the modified linked list. 

- Note: The head represents the first element of the given array.

```
Example 1:

Input: LinkedList: 4->5->6
Output: 457

Explanation: 4->5->6 represents 456 and when 1 is added it becomes 457. 

Example 2:

Input: LinkedList: 1->2->3
Output: 124
 
Explanation:  1->2->3 represents 123 and when 1 is added it becomes 124. 
```
- [Practice](https://www.geeksforgeeks.org/problems/add-1-to-a-number-represented-as-linked-list/1)

> Striver Sheet=> Step 6: Learn LinkedList >Lec-3: Medium Problems of LL > Add 1 to a number represented by LL

## Problem 2
- Given two sorted arrays a[] and b[], where each array may contain duplicate elements , the task is to return the elements in the union of the two arrays in sorted order.

- Union of two arrays can be defined as the set containing distinct common elements that are present in either of the arrays.

```
Example 1:

Input: a[] = [1, 2, 3, 4, 5], b[] = [1, 2, 3, 6, 7]
Output: 1 2 3 4 5 6 7
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5 6 7.

Example 2:

Input: a[] = [2, 2, 3, 4, 5], b[] = [1, 1, 2, 3, 4]
Output: 1 2 3 4 5
Explanation: Distinct elements including both the arrays are: 1 2 3 4 5.

Example 3:

Input: a[] = [1, 1, 1, 1, 1], b[] = [2, 2, 2, 2, 2]
Output: 1 2
Explanation: Distinct elements including both the arrays are: 1 2.
```
- [Practice](https://www.geeksforgeeks.org/problems/union-of-two-sorted-arrays-1587115621/1)

> Striver sheet => Step 3: Solve problems on arrays >Lec-1: easy > Find the Union

## Problem 3
- Given a binary array nums and an integer goal, return the number of non-empty subarrays with a sum goal.

- A subarray is a contiguous part of the array.

```
Example 1:

Input: nums = [1,0,1,0,1], goal = 2
Output: 4
Explanation: The 4 subarrays are bolded and underlined below:
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]
[1,0,1,0,1]

Example 2:

Input: nums = [0,0,0,0,0], goal = 0
Output: 15
```
- [Practice](https://leetcode.com/problems/binary-subarrays-with-sum/description/)

> Striver sheet => Step 10: Sliding window & two pointer combined problems >Lec-1: Medium problems > Binary subarray with sum