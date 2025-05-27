# DAY - 31

## Problem 1
- Given a doubly linked list. Your task is to reverse the doubly linked list and return its head.

```
Example 1:

Input: LinkedList: 3 <-> 4 <-> 5
Output: 5 <-> 4 <-> 3

Example 2:

Input: LinkedList: 75 <-> 122 <-> 59 <-> 196
Output: 196 <-> 59 <-> 122 <-> 75
```

- [Practice](https://www.geeksforgeeks.org/problems/reverse-a-doubly-linked-list/1)

> Striver Sheet=> Step 6: Learn LinkedList >Lec-2: Learn Doubly LinkedList  > Reverse a DLL

## Problem 2
- You are given an array arr of positive integers. Your task is to find all the leaders in the array. An element is considered a leader if it is greater than or equal to all elements to its right. The rightmost element is always a leader.

```
Example 1:

Input: arr = [16, 17, 4, 3, 5, 2]
Output: [17, 5, 2]
Explanation: Note that there is nothing greater on the right side of 17, 5 and, 2.

Example 2:

Input: arr = [10, 4, 2, 4, 1]
Output: [10, 4, 4, 1]
Explanation: Note that both of the 4s are in output, as to be a leader an equal element is also allowed on the right. side

Example 3:

Input: arr = [5, 10, 20, 40]
Output: [40]
Explanation: When an array is sorted in increasing order, only the rightmost element is leader.

Example 4:

Input: arr = [30, 10, 10, 5]
Output: [30, 10, 10, 5]
Explanation: When an array is sorted in non-increasing order, all elements are leaders.
```
- [Practice](https://www.geeksforgeeks.org/problems/leaders-in-an-array-1587115620/1)

> Striver sheet => Step 3: Solve Problems on Arrays >Lec-2: Medium > Leaders in an Array problem

## Problem 3
- You are visiting a farm that has a single row of fruit trees arranged from left to right. The trees are represented by an integer array fruits where fruits[i] is the type of fruit the ith tree produces.

- You want to collect as much fruit as possible. However, the owner has some strict rules that you must follow:

 - You only have two baskets, and each basket can only hold a single type of fruit. There is no limit on the amount of fruit each basket can hold.
 - Starting from any tree of your choice, you must pick exactly one fruit from every tree (including the start tree) while moving to the right. The picked fruits must fit in one of your baskets.
 - Once you reach a tree with fruit that cannot fit in your baskets, you must stop.

- Given the integer array fruits, return the maximum number of fruits you can pick.

```
Example 1:

Input: fruits = [1,2,1]
Output: 3
Explanation: We can pick from all 3 trees.

Example 2:

Input: fruits = [0,1,2,2]
Output: 3
Explanation: We can pick from trees [1,2,2].
If we had started at the first tree, we would only pick from trees [0,1].

Example 3:

Input: fruits = [1,2,3,2,2]
Output: 4
Explanation: We can pick from trees [2,3,2,2].
If we had started at the first tree, we would only pick from trees [1,2].
```
- [Practice](https://leetcode.com/problems/fruit-into-baskets/description/)

> Striver sheet => Step 10: Sliding window & two pointer combined problems >Lec-1: Medium problems > Fruit Into Baskets