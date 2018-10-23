class ArrayDemo3
{
	public static void  main(String[] args)
	{
		//数组的操作： 获取数组中的元素

	//	int[] arr = new int [3];
	//	System.out.println("arr["+0+"]="+arr[0]+";"); // arr[0]=0;
		int[] arr = {1,2,3,4,5};
		
		//数组中有一个属性可以直接获取到数组元素个数。length.
		//使用方法： 数组名称.length = 
	//	System.out.println("length:"+arr.length);
	//	for(int i = 0; i<arr.length; i++)
	//	{
	//		System.out.println("arr["+i+"]="+arr[i]+";");
	//	}

		//累加
/*
		int sum = 0;
		for(int x = 0; x<arr.length; x++)
		{
			sum += arr[x];
			System.out.println("arr["+x+"]="+arr[x]+";");
		
		}
		System.out.println("sum = "+sum);
*/
		
		printArray(arr);
			
	}


	//定义功能，用于打印数组中的元素，元素间用逗号隔开。
	public static void printArray(int[] arr)
	{	
		System.out.print("[");
		for(int x = 0; x<arr.length; x++)
		{
			if(x!=arr.length-1)
			   System.out.print(arr[x]+", ");
			else
			   System.out.println(arr[x]+"]");
		}
	}
}