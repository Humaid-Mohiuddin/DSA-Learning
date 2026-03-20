# This problem is solved using binary search.


## Find where the array is rotated.

**Brute Force**
My initial thought in the brute force solution was to use two pointers starting from each end of the array. This would spit out the index where the array is rotated.

**Flaws**:
 - Assumes that the array will always be rotated. The question only says it may be.
 - Time complexity increases to O(n/2) in the worst case.

**Solution**:
Use binary search to find out the rotation index.

## Perform search while adjusting for the rotation.

**Brute Force**
I performed binary search on both halves (before and after the rotation point).

**Solution**
Find where the target lies by simply comparing the last element of the array to the target. If target is bigger, then it will lie before the rotation other wise after.
Finally perform binary search on that particular half.