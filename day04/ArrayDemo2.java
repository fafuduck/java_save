class ArrayDemo2
{
	public static void main(String[] args)
	{
		//这两个是一致的 第一种定义方法		
//		int[] arr = new int[2];   //推荐用这个 

//		int arr[] = new int[2];


		//第二种定义方法
//		int[] arr = new int[]{3,1,6,5,4}; //静态初始化方式  []这里别写长度 {}写内容

//		int[] arr = {3,1,6,5,4};//简化形式
//		System.out.println(arr[2]); //  =6

		//不确定值的情况
		int[] arr = new int[3];	

//		System.out.println(arr[3]); 
		//ArrayIndexOutOfBoundsException:3: 操作数组时，访问到了数组中不存在的角标 越界了 

		arr = null;
		System.out.println(arr[1]); 
		//NullPointerException:空指针异常：当引用没有任何指向值位null的情况，该引用还在操作		//用于操作实体
		
	}
}