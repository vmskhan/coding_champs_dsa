# DAY - 21

## Problem 1
- Given the head of a singly linked list, return true if it is a palindrome or false otherwise.

```
Example 1:

Input: head = [1,2,2,1]
Output: true

Example 2:

Input: head = [1,2]
Output: false
```
- [Practice](https://leetcode.com/problems/palindrome-linked-list/description/)

> Striver Sheet=> Step 6: Learn LinkedList >Lec-3: Medium Problems of LL > Check if LL is palindrome or not

## Problem 2
- You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.

- You should return the array of nums such that the the array follows the given conditions:

- Every consecutive pair of integers have opposite signs.
- For all integers with the same sign, the order in which they were present in nums is preserved.
- The rearranged array begins with a positive integer.

- Return the modified array after rearranging the elements to satisfy the aforementioned conditions.

```
Example 1:

Input: nums = [3,1,-2,-5,2,-4]
Output: [3,-2,1,-5,2,-4]
Explanation:
The positive integers in nums are [3,1,2]. The negative integers are [-2,-5,-4].
The only possible way to rearrange them such that they satisfy all conditions is [3,-2,1,-5,2,-4].
Other ways such as [1,-2,2,-5,3,-4], [3,1,2,-2,-5,-4], [-2,3,-5,1,-4,2] are incorrect because they do not satisfy one or more conditions.  

Example 2:

Input: nums = [-1,1]
Output: [1,-1]
Explanation:
1 is the only positive integer and -1 the only negative integer in nums.
So nums is rearranged to [1,-1].
```
- [Practice](https://leetcode.com/problems/rearrange-array-elements-by-sign/description/)

> Striver sheet => Step 3: Solve problems on Arrays>Lec-2: Medium> Rearrange the array in alternating positive and negative items