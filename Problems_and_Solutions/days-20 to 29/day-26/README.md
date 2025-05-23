# DAY - 26

## Problem 1
- Given the heads of two singly linked-lists headA and headB, return the node at which the two lists intersect. If the two linked lists have no intersection at all, return null.

```
Example 1:


Input: intersectVal = 8, listA = [4,1,8,4,5], listB = [5,6,1,8,4,5], skipA = 2, skipB = 3
Output: Intersected at '8'
Explanation: The intersected node's value is 8 (note that this must not be 0 if the two lists intersect).
From the head of A, it reads as [4,1,8,4,5]. From the head of B, it reads as [5,6,1,8,4,5]. There are 2 nodes before the intersected node in A; There are 3 nodes before the intersected node in B.
- Note that the intersected node's value is not 1 because the nodes with value 1 in A and B (2nd node in A and 3rd node in B) are different node references. In other words, they point to two different locations in memory, while the nodes with value 8 in A and B (3rd node in A and 4th node in B) point to the same location in memory.
```
- [Practice](https://leetcode.com/problems/intersection-of-two-linked-lists/description/)

> Striver Sheet=> Step 6: Learn LinkedList >Lec-3: Medium Problems of LL > Find the intersection point of Y LL

## Problem 2
- Suppose an array of length n sorted in ascending order is rotated between 1 and n times. For example, the array nums = [0,1,2,4,5,6,7] might become:

 - [4,5,6,7,0,1,2] if it was rotated 4 times.
 - [0,1,2,4,5,6,7] if it was rotated 7 times.

- Notice that rotating an array [a[0], a[1], a[2], ..., a[n-1]] 1 time results in the array [a[n-1], a[0], a[1], a[2], ..., a[n-2]].

- Given the sorted rotated array nums of unique elements, return the minimum element of this array.

- You must write an algorithm that runs in O(log n) time.

```
Example 1:

Input: nums = [3,4,5,1,2]
Output: 1
Explanation: The original array was [1,2,3,4,5] rotated 3 times.

Example 2:

Input: nums = [4,5,6,7,0,1,2]
Output: 0
Explanation: The original array was [0,1,2,4,5,6,7] and it was rotated 4 times.

Example 3:

Input: nums = [11,13,15,17]
Output: 11
Explanation: The original array was [11,13,15,17] and it was rotated 4 times.
```
- [Practice](https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/description/)

> Striver sheet => Step 4: Binary Search >Lec-1: BS on 1D Arrays > Find minimum in Rotated Sorted Array