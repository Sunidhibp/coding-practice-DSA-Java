# coding-practice-DSA-Java
Repository to track my coding practice in Java and Data Structures &amp; Algorithms.


Day -1 13/11/24

Arrays:
Find the missing number in an array of 1 to N:

Given an array containing N-1 numbers, where the numbers are in the range from 1 to N, find the missing number.
Example: arr = [1, 2, 4, 6, 3, 7, 8], N = 8 → Missing number = 5
Find the majority element:

Find the element that appears more than ⌊ N/2 ⌋ times in an array. If no majority element exists, return -1.
Example: arr = [3, 3, 4, 2, 4, 4, 2, 4, 4] → Majority element = 4
Find duplicate elements in an array:

Given an array, find all the duplicate elements present.
Example: arr = [1, 2, 3, 2, 1, 4, 5] → Duplicates = 1, 2
Move all zeros to the end of the array:

Given an array, move all zero elements to the end without changing the order of non-zero elements.
Example: arr = [0, 1, 9, 0, 5, 0] → arr = [1, 9, 5, 0, 0, 0]
Rotate an array:

Rotate an array by K positions to the right.
Example: arr = [1, 2, 3, 4, 5], K = 2 → arr = [4, 5, 1, 2, 3]
Find the largest product of two elements in an array:

Given an array of integers, find the two elements whose product is the largest.
Example: arr = [1, 2, 3, 4] → Maximum product = 12 (from 3 and 4)
Find the subarray with the given sum:

Find a contiguous subarray that adds up to a specific sum in an array.
Example: arr = [1, 2, 3, 7, 5], Sum = 12 → Subarray: [2, 3, 7]
Find the "Kth" largest/smallest element:

Given an array, find the Kth largest or smallest element.
Example: arr = [12, 3, 5, 7, 19], K = 2 → 2nd largest = 12
Find pairs with a given sum:

Given an array and a number, find all pairs of elements that sum up to that number.
Example: arr = [1, 4, 5, 3, 2], Sum = 6 → Pairs: (1, 5), (4, 2)
Strings:
Check if two strings are anagrams:

Write a function to check if two strings are anagrams of each other (i.e., they contain the same characters with the same frequency).
Example: str1 = "listen", str2 = "silent" → True
Longest Common Prefix:

Given an array of strings, find the longest common prefix (if any).
Example: arr = ["flower", "flow", "flight"] → Longest Common Prefix = "fl"
String Compression:

Given a string, compress it by counting consecutive occurrences of characters.
Example: str = "aabcccccaaa" → Compressed string = "a2b1c5a3"
Find if a string is a substring of another string:

Check if a string is a substring of another string.
Example: str1 = "abc", str2 = "abcd" → True
Reverse words in a string:

Given a sentence, reverse the words in it while keeping the order of words intact.
Example: "The quick brown fox" → "fox brown quick The"
Longest Palindromic Substring:

Given a string, find the longest palindromic substring.
Example: str = "babad" → Longest Palindromic Substring = "bab"
Count and Say:

Given a number, generate the next number in the "count-and-say" sequence.
Example: n = 4 → "1211" (i.e., one "1", one "2", two "1"s)
Check if a string has all unique characters:

Given a string, check if all the characters are unique.
Example: str = "abcdef" → True
Remove duplicates from a string:

Given a string, remove all duplicate characters without using extra space.
Example: str = "aabccbd" → abc
Find the first non-repeating character in a string:

Write a function to find the first non-repeating character in a string.
Example: str = "swiss" → First non-repeating character = "w"
Advanced Practice:
Find intersection of two arrays:

Find common elements between two arrays.
Example: arr1 = [1, 2, 3, 4], arr2 = [3, 4, 5, 6] → Intersection = [3, 4]
Count distinct substrings of a string:

Given a string, count the number of distinct substrings it has.
Example: str = "aab" → Distinct substrings = 4 (a, aa, ab, b)
Find the longest increasing subsequence:

Given an array, find the length of the longest strictly increasing subsequence.
Example: arr = [10, 9, 2, 5, 3, 7, 101, 18] → Length = 4
Z-Algorithm (Pattern Searching):

Given a string, compute the Z-array for pattern matching.
Example: str = "ababc" → Z-array = [0, 0, 2, 0, 1]
