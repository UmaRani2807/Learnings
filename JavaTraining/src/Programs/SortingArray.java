package Programs;

public class SortingArray {

	public static void main(String[] args) {

		int[] arr = new int[] {6,2,8,4,3,9};
		/*arr[0] = 6;
		arr[1] = 2;
		arr[2] = 8;
		arr[3] = 4;
		arr[4] = 3;
		arr[5] = 9; */
		int temp = 0;
		
		for(int i =0;i<arr.length;i++)
		{
			System.out.print(arr[i]);
		}
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i] > arr[j])
				{
				temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
				}
			}
		}
	for(int i =0;i<arr.length;i++)
	{
		System.out.println(arr[i]);
	}
}
}
