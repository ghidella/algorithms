# https://leetcode.com/problems/two-sum/

# First solution O(n^2) time and O(1) space complexity
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        for i in range(len(nums)):
            for j in range(len(nums)):
                if nums[i] + nums[j] == target and i != j:
                    return [i, j]
                    
        
# Optimized solution O(n) time and space complexity
class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashMap = {}

        for i, n in enumerate(nums):
            diff = target - n
            if diff in hashMap:
                return [hashMap[diff], i]
            else:
                hashMap[n] = i
            
                    
        