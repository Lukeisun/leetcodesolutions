class Solution {
    public boolean isPalindrome(int x) {
        if(x < 0) return false;
        int y = x;
        int sumx = 0, sumy = 0;
        int i = 0;
        while(x >0)
        {
            sumx += x%10 * Math.pow(10, i);
            i++;
            x /= 10;
        }
        if(i==1 || i == 0) return true;
        i--;
        int j = 0;
        while (y >0)
        {
            System.out.println(y);
            int z = (int)(y/Math.pow(10, i));
            long test = (long)(z*Math.pow(10,j));
            if(test > Integer.MAX_VALUE) return false;
            sumy += (int)(test);
            System.out.println("SUMY" + sumy);
            y %= Math.pow(10,i);
            i--;
            j++;
        }

        System.out.println(sumy);
        System.out.println(sumx);
        if(sumx ==  sumy) return true;
        else return false;
    }
}
