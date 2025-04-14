# DAY - 12

## Problem 1
-The task is to complete the insertsort() function which is used to implement recursive Insertion Sort.
```
Input: arr[] = [4, 1, 3, 9, 7]
Output: [1, 3, 4, 7, 9]
```

- [Practice](https://www.geeksforgeeks.org/problems/insertion-sort/1)

> Striver sheet => Step 1:Learn important sorting techniques>Lec-2: Sorting-II> Recursive Insertion Sort

## Problem 2
-Given an array of integers nums sorted in non-decreasing order, find the starting and ending position of a given target value.

If target is not found in the array, return [-1, -1].

You must write an algorithm with O(log n) runtime complexity.

```
Example 1:

Input: nums = [5,7,7,8,8,10], target = 8
Output: [3,4]
Example 2:

Input: nums = [5,7,7,8,8,10], target = 6
Output: [-1,-1]
Example 3:

Input: nums = [], target = 0
Output: [-1,-1]
```

- [Practice](https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/description/)

> Striver Sheet=> Step 4: Binary Search >Lec-1: BS on 1D arrays> Find the first or last occurrence of a given number in a sorted array

## Problem 3
### Part-A
- Given a linked list of n nodes and a key, the task is toGiven a singly linked list and an integer, x. Delete the xth node (1-based indexing) from the singly linked list.
```
Input: Linked list: 1 -> 3 -> 4, x = 3
Output: 1 -> 3
```
- [Practice1](https://www.geeksforgeeks.org/problems/delete-a-node-in-single-linked-list/1)

### Part-B
- There is a singly-linked list head and we want to delete a node node in it.

You are given the node to be deleted node. You will not be given access to the first node of head.

All the values of the linked list are unique, and it is guaranteed that the given node node is not the last node in the linked list.

Delete the given node. Note that by deleting the node, we do not mean removing it from memory. We mean:

- The value of the given node should not exist in the linked list.
- The number of nodes in the linked list should decrease by one.
- All the values before node should be in the same order.
- All the values after node should be in the same order.

```
Input: head = [4,5,1,9], node = 5
Output: [4,1,9]
Explanation: You are given the second node with value 5, the linked list should become 4 -> 1 -> 9 after calling your function.
```
- [Practice 2](https://leetcode.com/problems/delete-node-in-a-linked-list/description/)


> Striver Sheet=> Step 6: Learn LinkedList >Lec-1: Learn 1D LinkedList > Deleting a node in LinkedList

## Problem 4
-A valid parentheses string is either empty "", "(" + A + ")", or A + B, where A and B are valid parentheses strings, and + represents string concatenation.

For example, "", "()", "(())()", and "(()(()))" are all valid parentheses strings.
A valid parentheses string s is primitive if it is nonempty, and there does not exist a way to split it into s = A + B, with A and B nonempty valid parentheses strings.

Given a valid parentheses string s, consider its primitive decomposition: s = P1 + P2 + ... + Pk, where Pi are primitive valid parentheses strings.

Return s after removing the outermost parentheses of every primitive string in the primitive decomposition of s.

```
Example 1:

Input: s = "(()())(())"
Output: "()()()"
Explanation: 
The input string is "(()())(())", with primitive decomposition "(()())" + "(())".
After removing outer parentheses of each part, this is "()()" + "()" = "()()()".

Example 2:

Input: s = "(()())(())(()(()))"
Output: "()()()()(())"
Explanation: 
The input string is "(()())(())(()(()))", with primitive decomposition "(()())" + "(())" + "(()(()))".
After removing outer parentheses of each part, this is "()()" + "()" + "()(())" = "()()()()(())".

Example 3:

Input: s = "()()"
Output: ""
Explanation: 
The input string is "()()", with primitive decomposition "()" + "()".
After removing outer parentheses of each part, this is "" + "" = "".
```
- [Practice](https://leetcode.com/problems/remove-outermost-parentheses/description/)

> Striver Sheet=> Step 5:Strings >Lec-1: Basic and Easy String Problems> Remove outermost Paranthesis

