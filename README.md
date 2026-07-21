# Moglix-Assesment

## Problem
Given a string containing only '(' and ')', find the length of the longest 
valid (well-formed) parentheses substring.

### Examples
Input: "(()"      → Output: 2   → "()"
Input: ")()())"    → Output: 4   → "()()"
Input: ""          → Output: 0

### Constraints
- 0 <= s.length <= 3 * 10^4
- s[i] is '(' or ')'

## Approach
Used a stack to keep track of indices instead of characters.

- Push index of every '(' onto the stack.
- On ')':
  - If stack is empty after pop, push current index — this becomes the new 
    base for calculating length ahead.
  - Otherwise, calculate length as (current index - stack top) and update max.
- Start with -1 pushed onto the stack as an initial base.

## Complexity
- Time: O(n)
- Space: O(n)
