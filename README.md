# Moglix-Assesment

## Problem
Given a string containing only '(' and ')', find the length of the longest 
valid parentheses substring.

## Approach
Used a stack to keep track of indices instead of characters.

- Push index of every '(' onto the stack.
- On ')':
  - If stack is empty after pop, push current index — this becomes the new 
    base for calculating length ahead.
  - Otherwise, calculate length as (current index - stack top) and update max.
- Start with -1 pushed onto the stack as an initial base.
- 
## Complexity
- Time: O(n)
- Space: O(n)
