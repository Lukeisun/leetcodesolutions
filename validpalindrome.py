import re
class Solution:
    def isPalindrome(self, s: str) -> bool:
        subbed = re.sub("\W|_", "", s.lower())
        ptr = len(subbed) - 1
        for i in range(0, int(len(subbed)/2)):
            if subbed[i] != subbed[ptr]:
                print(ptr, i)
                print(subbed)
                return False
            ptr -= 1
        return True