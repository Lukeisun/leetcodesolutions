class Solution(object):
    def groupAnagrams(self, strs):
        """
        :type strs: List[str]
        :rtype: List[List[str]]
        """
        strings = collections.defaultdict(list)
        for str in strs:
            temp = list(str)
            temp.sort()
            key = tuple(temp)
            strings[key].append(str)
        print(strings)
        return strings.values()
