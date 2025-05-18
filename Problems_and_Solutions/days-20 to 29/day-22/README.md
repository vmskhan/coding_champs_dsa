# DAY - 22

## Problem 1
- Given the head of a singly linked list, group all the nodes with odd indices together followed by the nodes with even indices, and return the reordered list.

- The first node is considered odd, and the second node is even, and so on.

- Note that the relative order inside both the even and odd groups should remain as it was in the input.

- You must solve the problem in O(1) extra space complexity and O(n) time complexity.

```
Example 1:

Input: head = [1,2,3,4,5]
Output: [1,3,5,2,4]

Example 2:

Input: head = [2,1,3,5,6,4,7]
Output: [2,3,6,7,1,5,4]
```
- [Practice](https://leetcode.com/problems/odd-even-linked-list/description/)

> Striver Sheet=> Step 6: Learn LinkedList >Lec-3: Medium Problems of LL > Segrregate odd and even nodes in LL

## Problem 2
- Given a string s, sort it in decreasing order based on the frequency of the characters. The frequency of a character is the number of times it appears in the string.

- Return the sorted string. If there are multiple answers, return any of them.

```
Example 1:

Input: s = "tree"
Output: "eert"
Explanation: 'e' appears twice while 'r' and 't' both appear once.
So 'e' must appear before both 'r' and 't'. Therefore "eetr" is also a valid answer.

Example 2:

Input: s = "cccaaa"
Output: "aaaccc"
Explanation: Both 'c' and 'a' appear three times, so both "cccaaa" and "aaaccc" are valid answers.
Note that "cacaca" is incorrect, as the same characters must be together.

Example 3:

Input: s = "Aabb"
Output: "bbAa"
Explanation: "bbaA" is also a valid answer, but "Aabb" is incorrect.
Note that 'A' and 'a' are treated as two different characters.
```
- [Practice](https://leetcode.com/problems/sort-characters-by-frequency/)

> Striver sheet => Step 5: Strings >Lec-2: Medium String Problems> Sort Characters by frequency