class Solution(object):
    def isAnagram(self, s, t):
        """
        :type s: str
        :type t: str
        :rtype: bool
        """
        dictS = {}
        dictT = {}
        if len(s) != len(t):
            return False
        # dictS = collections.Counter(s)
        # dictT = collections.Counter(t)        
        for i in range(0, len(s)):
            if s[i] not in dictS:
                dictS[s[i]] = 1
            dictS[s[i]] += 1
        for i in range(0, len(t)):
            if t[i] not in dictT:
                dictT[t[i]] = 1
            dictT[t[i]] += 1
        return dictS == dictT
        # for k in dictS:
        #     if k not in dictT: return False
        #     if k in dictT and dictT[k] != dictS[k]: return False
        # return True