# DAY - 33

## Problem 1
- Given a square matrix mat, return the sum of the matrix diagonals.

- Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.

```
Example 1:

Input: mat = [[1,2,3],
              [4,5,6],
              [7,8,9]]
Output: 25
Explanation: Diagonals sum: 1 + 5 + 9 + 3 + 7 = 25
Notice that element mat[1][1] = 5 is counted only once.

Example 2:

Input: mat = [[1,1,1,1],
              [1,1,1,1],
              [1,1,1,1],
              [1,1,1,1]]
Output: 8

Example 3:

Input: mat = [[5]]
Output: 5
```

- [Practice](https://leetcode.com/problems/matrix-diagonal-sum/)

> Leetcode problem - 1572. Matrix Diagonal Sum

## Problem 2
- Given an infix expression in the form of string s. Convert this infix expression to a postfix expression.

- Infix expression: The expression of the form a op b. When an operator is in between every pair of operands.
- Postfix expression: The expression of the form a b op. When an operator is followed for every pair of operands.
- Note: The order of precedence is: ^ greater than * equals to / greater than + equals to -. Ignore the right associativity of ^.

```
Example 1:

Input: s = "a+b*(c^d-e)^(f+g*h)-i"
Output: abcd^e-fgh*+^*+i-
Explanation: After converting the infix expression into postfix expression, the resultant expression will be abcd^e-fgh*+^*+i-

Example 2:

Input: s = "A*(B+C)/D"
Output: ABC+*D/
Explanation: After converting the infix expression into postfix expression, the resultant expression will be ABC+*D/

Example 3:

Input: s = "(a+b)*(c+d)"
Output: ab+cd+*
```
- [Practice](https://www.geeksforgeeks.org/problems/infix-to-postfix-1587115620/1)

> Striver sheet => Step 9: Stack and Queues >Lec-2: Prefix, Infix, Postfix Conversion problems > Infix to Postfix Conversion using Stack

## Problem 3
- You are given a string s and an integer k. You can choose any character of the string and change it to any other uppercase English character. You can perform this operation at most k times.

- Return the length of the longest substring containing the same letter you can get after performing the above operations.

```
Example 1:

Input: s = "ABAB", k = 2
Output: 4
Explanation: Replace the two 'A's with two 'B's or vice versa.

Example 2:

Input: s = "AABABBA", k = 1
Output: 4
Explanation: Replace the one 'A' in the middle with 'B' and form "AABBBBA".
The substring "BBBB" has the longest repeating letters, which is 4.
There may exists other ways to achieve this answer too.
```
- [Practice](https://leetcode.com/problems/longest-repeating-character-replacement/description/)

> Striver sheet => Step 10: Sliding window & two pointer combined problems >Lec-1: Medium problems > longest repeating character replacement