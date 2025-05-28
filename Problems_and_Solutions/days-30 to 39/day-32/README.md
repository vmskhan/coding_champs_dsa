# DAY - 32

## Problem 1
- You are given positive integers n and m.

Define two integers as follows:

- num1: The sum of all integers in the range [1, n] (both inclusive) that are not divisible by m.
- num2: The sum of all integers in the range [1, n] (both inclusive) that are divisible by m.

- Return the integer num1 - num2.

```
Example 1:

Input: n = 10, m = 3
Output: 19
Explanation: In the given example:
- Integers in the range [1, 10] that are not divisible by 3 are [1,2,4,5,7,8,10], num1 is the sum of those integers = 37.
- Integers in the range [1, 10] that are divisible by 3 are [3,6,9], num2 is the sum of those integers = 18.
We return 37 - 18 = 19 as the answer.

Example 2:

Input: n = 5, m = 6
Output: 15
Explanation: In the given example:
- Integers in the range [1, 5] that are not divisible by 6 are [1,2,3,4,5], num1 is the sum of those integers = 15.
- Integers in the range [1, 5] that are divisible by 6 are [], num2 is the sum of those integers = 0.
We return 15 - 0 = 15 as the answer.

Example 3:

Input: n = 5, m = 1
Output: -15
Explanation: In the given example:
- Integers in the range [1, 5] that are not divisible by 1 are [], num1 is the sum of those integers = 0.
- Integers in the range [1, 5] that are divisible by 1 are [1,2,3,4,5], num2 is the sum of those integers = 15.
We return 0 - 15 = -15 as the answer.

```

- [Practice](https://leetcode.com/problems/divisible-and-non-divisible-sums-difference/description/?envType=daily-question&envId=2025-05-27)

> Daily leetcode problem - 2894. Divisible and Non-divisible Sums Difference

## Problem 2
- You are given a stack St. You have to reverse the stack using recursion.

```
Example 1:

Input:
St = {3,2,1,7,6}
Output:
{6,7,1,2,3}
Explanation:
Input stack after reversing will look like the stack in the output.

Example 2:

Input:
St = {4,3,9,6}
Output:
{6,9,3,4}
Explanation:
Input stack after reversing will look like the stack in the output.
```
- [Practice](https://www.geeksforgeeks.org/problems/reverse-a-stack/1)

> Striver sheet => Step 7: Recursion >Lec-1: Get a strong hold > Reverse a stack using recursion

## Problem 3
- Given a 2D integer array matrix, return the transpose of matrix.

The transpose of a matrix is the matrix flipped over its main diagonal, switching the matrix's row and column indices.

```
Example 1:

Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[1,4,7],[2,5,8],[3,6,9]]

Example 2:

Input: matrix = [[1,2,3],[4,5,6]]
Output: [[1,4],[2,5],[3,6]]
```
- [Practice](https://leetcode.com/problems/transpose-matrix/description/)

> Leetcode problem- 867. Transpose Matrix