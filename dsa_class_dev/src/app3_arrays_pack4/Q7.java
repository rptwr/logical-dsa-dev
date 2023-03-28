package app3_arrays_pack4;
//Find the 3rd largest and 3rd smallest element in an array
public class Q7 {
	public static void main(String[] args) {
		int nums []  = {100,53,2,35,433,221,3,543,2321,654,212,22,1,};
		int s1,s2,s3;
		s3 =Integer.MIN_VALUE;
		s2 =Integer.MIN_VALUE;
		s1 = nums[0];
		for(int i =1 ;i<nums.length;i++)
		{
			if(s1 < nums[i])
			{
				s3 = s2;
				s2 =s1;
				s1 = nums[i];
			}else if(s2 <nums[i])
			{
				s3 =s2;
				s2 = nums[i];
			}else if(s3 < nums[i])
			{
				s3 =nums[i];
			}
		}
		System.out.println("3rd max is "+s3);
	}
}
