class ArrayDemo3
{
	public static void  main(String[] args)
	{
		//����Ĳ����� ��ȡ�����е�Ԫ��

	//	int[] arr = new int [3];
	//	System.out.println("arr["+0+"]="+arr[0]+";"); // arr[0]=0;
		int[] arr = {1,2,3,4,5};
		
		//��������һ�����Կ���ֱ�ӻ�ȡ������Ԫ�ظ�����length.
		//ʹ�÷����� ��������.length = 
	//	System.out.println("length:"+arr.length);
	//	for(int i = 0; i<arr.length; i++)
	//	{
	//		System.out.println("arr["+i+"]="+arr[i]+";");
	//	}

		//�ۼ�
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


	//���幦�ܣ����ڴ�ӡ�����е�Ԫ�أ�Ԫ�ؼ��ö��Ÿ�����
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