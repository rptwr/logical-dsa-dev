package app7_arrays;

import java.util.ArrayList;

public class M6 {
	public static void main(String[] args) {
		int[]arr={2,3,4,7,11};
		int k = 5;
		int n = arr.length;
        ArrayList<Integer> list = new ArrayList();
        for(int i = 0 ; i < n ; i++)
        {
            list.add(arr[i],arr[i]);
        }
        for(int i = 1;i< list.size();i++)
        {
            int j = list.get(i);
            if(j == 0)
            {
                System.out.println(i);
            }
        }
        System.out.println(0);;
	}
}
