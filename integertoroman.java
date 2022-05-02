class Solution {
    public String intToRoman(int num) {
        StringBuilder retStr = new StringBuilder();
        ArrayDeque<Integer> store = new ArrayDeque();
        int i = 0;
        while(num > 0)
        {
            store.add(num%10);
            num /= 10;
            i++;
        }
        System.out.println(i);
        while(!store.isEmpty())
        {
            System.out.println(store);
            if(i == 4)
            {
                int temp = store.pollLast();
                for(int j = 0; j < temp; j++) retStr.append("M");
            }
            if(i == 3)
            {
                int temp = store.pollLast();
                if(temp == 4) retStr.append("CD");
                else if(temp == 9) retStr.append("CM");
                else {
                    if(temp >= 5)
                    {
                        retStr.append("D");
                        temp -= 5;
                    }
                    for(int j = 0; j < temp; j++) retStr.append("C");
                }
            }
            if(i == 2)
            {
                int temp = store.pollLast();
                if(temp == 4) retStr.append("XL");
                else if(temp == 9) retStr.append("XC");
                else
                {
                    if(temp >= 5)
                    {
                        retStr.append("L");
                        temp -= 5;
                    }
                    System.out.println(temp);
                    for(int j = 0; j < temp; j++) retStr.append("X");
                }
            }
            if(i==1)
            {
                int temp = store.pollLast();
                if(temp == 4) retStr.append("IV");
                else if(temp == 9) retStr.append("IX");
                else
                {
                    if(temp >= 5)
                    {
                        retStr.append("V");
                        temp -=  5;
                    }
                    for(int j =0; j < temp; j++) retStr.append("I");
                }
            }
            i--;
        }
        return retStr.toString();
    }
}
