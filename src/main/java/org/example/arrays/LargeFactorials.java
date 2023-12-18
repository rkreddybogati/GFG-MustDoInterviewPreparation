package org.example.arrays;

import java.util.HashMap;
import java.util.Map;

public class LargeFactorials {

    public void run() {
        int n = 5;
        long[] A = {0, 1, 2, 3, 4};
        System.out.println(factorial(A, n));
    }

    Map<Long, Long> map = new HashMap<>();

    public long[] factorial(long a[], int n) {
        // code here
        System.out.println("starting time: "+System.currentTimeMillis());
        int i=0;
        while(i<n){
            a[i] = getFactorial(a[i]);
            i++;
        }
        System.out.println("ending time: "+System.currentTimeMillis());
        return a;
    }

    public Long getFactorial(long i) {

        if(map.get(i)!=null) {
            return map.get(i);
        } else {
            if (i==0){
                return 1L;
            }

            if(i<=2) {
                map.put(i, i);
                return i;
            }

            long factorial = i*getFactorial(i-1);
            map.put(i, factorial);
            return factorial;
        }

    }

}
