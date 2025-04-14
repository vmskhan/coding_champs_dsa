# DAY - 13

## Problem 1
- A digit string is good if the digits (0-indexed) at even indices are even and the digits at odd indices are prime (2, 3, 5, or 7).

- For example, "2582" is good because the digits (2 and 8) at even positions are even and the digits (5 and 2) at odd positions are prime. However, "3245" is not good because 3 is at an even index but is not even.
Given an integer n, return the total number of good digit strings of length n. Since the answer may be large, return it modulo 109 + 7.

- A digit string is a string consisting of digits 0 through 9 that may contain leading zeros.
```
Example 1:

Input: n = 1
Output: 5
Explanation: The good numbers of length 1 are "0", "2", "4", "6", "8".

Example 2:

Input: n = 4
Output: 400

Example 3:

Input: n = 50
Output: 564908303
```

- [Practice](https://leetcode.com/problems/count-good-numbers/description/)

> Striver sheet => Step 7: Recursion>Lec-1: Get a strong hold> Count good numbers

## Problem 2
- Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

- You may assume that each input would have exactly one solution, and you may not use the same element twice.

- You can return the answer in any order.

```
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].

Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]

Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
```

- [Practice](https://leetcode.com/problems/two-sum/description/)

> Striver Sheet=> Step 3: Solve problems on Arrays >Lec-2: Medium > 2Sum Problem

## Problem 3
- Geek is learning data structures and is familiar with linked lists, but he's curious about how to access the previous element in a linked list in the same way that we access the next element. His teacher explains doubly linked lists to him.

- Given an integer array arr of size n. Construct the doubly linked list from arr and return the head of it.
```
Input:
n = 5
arr = [1,2,3,4,5]
Output:
1 2 3 4 5
Explanation: Linked list for the given array will be 1<->2<->3<->4<->5.
```
- [Practice](https://www.geeksforgeeks.org/problems/introduction-to-doubly-linked-list/1)

> Striver Sheet=> Step 6: Learn LinkedList >Lec-2: Learn Doubly LinkedList > Introduction to DLL, learn about struct, and how is node represented

## Problem 4
- Given a string s containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.

- An input string is valid if:

- Open brackets must be closed by the same type of brackets.
- Open brackets must be closed in the correct order.
- Every close bracket has a corresponding open bracket of the same type.


```
Example 1:

Input: s = "()"

Output: true

Example 2:

Input: s = "()[]{}"

Output: true

Example 3:

Input: s = "(]"

Output: false

Example 4:

Input: s = "([])"

Output: true
```
- [Practice](https://leetcode.com/problems/valid-parentheses/description/)

> Striver Sheet=> Step 9:Stack and Queues >Lec-1: Learning > Check for balanced paranthesis

