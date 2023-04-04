package app7_arrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;

public class M5 {
	public static void main(String[] args) {
		
		int[]nums = {8154,9139,8194,3346,5450,9190,133,8239,4606,8671,8412,6290};
		HashMap<Integer,Integer> map = new HashMap();
		ArrayList<Integer>list = new ArrayList();
		for(int i = 0 ; i < nums.length;i++)
	    {
	        if(nums[i]%2==0)
	        {
	    	   map.put(nums[i],map.getOrDefault(nums[i],0)+1);
	    	   if(!list.contains(nums[i]))
	    	   list.add(nums[i]);
	        }
	    }
		int dupli = 0 ;
		int numb = -1;
		for(int i = 0 ;i<list.size();i++ )
		{
			int k = map.get(list.get(i));
			if(k > dupli)
			{
				dupli = k;
				numb = list.get(i);
			}
			if(k == map.get(list.get(i)))
				if(numb == list.get(i))
					numb = Math.min(numb, list.get(i)); 
		}
		System.out.println(map);
		System.out.println(list);
		System.out.println(numb);
	}
}
