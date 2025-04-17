# DAY - 15

## Problem 1
- Given an integer array nums, rotate the array to the right by k steps, where k is non-negative.
```
Example 1:

Input: nums = [1,2,3,4,5,6,7], k = 3
Output: [5,6,7,1,2,3,4]
Explanation:
rotate 1 steps to the right: [7,1,2,3,4,5,6]
rotate 2 steps to the right: [6,7,1,2,3,4,5]
rotate 3 steps to the right: [5,6,7,1,2,3,4]
Example 2:

Input: nums = [-1,-100,3,99], k = 2
Output: [3,99,-1,-100]
Explanation: 
rotate 1 steps to the right: [99,-1,-100,3]
rotate 2 steps to the right: [3,99,-1,-100]
```

- [Practice](https://leetcode.com/problems/rotate-array/description/)

> Striver sheet => Step 3: Solve problems on arrays>Lec-1: Easy> Left Rotate an array by one place

> Striver sheet => Step 3: Solve problems on arrays>Lec-1: Easy> Left rotate an array by D places

## Problem 2
- Given two strings s and t, determine if they are isomorphic.

- Two strings s and t are isomorphic if the characters in s can be replaced to get t.

- All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character, but a character may map to itself.


```
Example 1:

Input: s = "egg", t = "add"

Output: true

Explanation:

The strings s and t can be made identical by:

Mapping 'e' to 'a'.
Mapping 'g' to 'd'.
Example 2:

Input: s = "foo", t = "bar"

Output: false

Explanation:

The strings s and t can not be made identical as 'o' needs to be mapped to both 'a' and 'r'.

Example 3:

Input: s = "paper", t = "title"

Output: true
```

- [Practice](https://leetcode.com/problems/isomorphic-strings/description/)

> Striver Sheet=> Step 5: Strings >Lec-1: Basic and easy string problems > Isomorphic string

## Problem 3
- Given a Doubly Linked list and a position. The task is to delete a node from a given position (position starts from 1) in a doubly linked list and return the head of the doubly Linked list.
```
Input: LinkedList = 1 <--> 3 <--> 4, x = 3
Output: 1 <--> 3
Explanation: After deleting the node at position 3 (position starts from 1),the linked list will be now as 1 <--> 3.

Input: LinkedList = 1 <--> 5 <--> 2 <--> 9, x = 1
Output: 5 <--> 2 <--> 9
```
- [Practice](https://www.geeksforgeeks.org/problems/delete-node-in-doubly-linked-list/1)

> Striver Sheet=> Step 6: Learn LinkedList >Lec-2: Learn Doubly LinkedList > Delete a node in DLL

## Problem 4
- Design a stack that supports push, pop, top, and retrieving the minimum element in constant time.

Implement the MinStack class:

- MinStack() initializes the stack object.
- void push(int val) pushes the element val onto the stack.
- void pop() removes the element on the top of the stack.
- int top() gets the top element of the stack.
- int getMin() retrieves the minimum element in the stack.

You must implement a solution with O(1) time complexity for each function.

- [Practice](https://leetcode.com/problems/min-stack/description/)

> Striver Sheet=> Step 9:Stack and Queues >Lec-1: Learning > Implement Min Stack

