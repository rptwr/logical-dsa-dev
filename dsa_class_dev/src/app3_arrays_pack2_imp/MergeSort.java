package app3_arrays_pack2_imp;

public class MergeSort {
	int[] array;
	int[] tempMergeArr;
	int length;
	public static void main(String[] args) {
		int[] inputArr = {48, 36, 13, 52, 19, 94, 21};
					//    0    1   2   3   4   5   6
		MergeSort ms = new MergeSort();
		ms.sort(inputArr);
		
		for(int i : inputArr)
		{
			System.out.println(i + " ");
		}
	}
	
	public void sort(int inputArr[])
	{
		this.array = inputArr;
		this.length = inputArr.length;
		this.tempMergeArr = new int[length];
		
		divideArray(0, length - 1);
	}
	
	public void divideArray(int lowerIndex, int higherIndex)
	{
		if(lowerIndex < higherIndex)
		{
			int middle = lowerIndex + (higherIndex - lowerIndex) / 2;
			
			divideArray(lowerIndex, middle); // it will sort the left side of an array
			divideArray(middle + 1, higherIndex);  // it will sort the right side of an array
			
			mergeArray(lowerIndex, middle, higherIndex);
		}
	}
	
	public void mergeArray(int lowerIndex, int middle, int higherIndex)
	{
		for(int i = lowerIndex; i <= higherIndex; i++)
		{
			tempMergeArr[i] = array[i];
		}
		int i = lowerIndex;
		int j = middle + 1;
		int k = lowerIndex;
		while(i <= middle && j <= higherIndex)
		{
			if(tempMergeArr[i] <= tempMergeArr[j])
			{
				array[k] = tempMergeArr[i];
				i++;
			}
			else
			{
				array[k] = tempMergeArr[j];
				j++;
			}
			k++;
		}
		while(i <= middle)
		{
			array[k] = tempMergeArr[i];
			k++;
			i++;
		}
	}
}
