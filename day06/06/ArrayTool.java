/**
这是一个可以对数组进行操作的工具类,该类中提供了获取最值，排序等功能。
@author 林成辉
@version v1.1
*/

/*
class Demo 
{
	public static void main(String[] args) 
	{
		int [] arr = {3,4,1,8};

		int max = getMax(arr);
		System.out.println("max" = arr[max] );
	}
	public static int getMax(int[] arr)
	{
		int max = 0;
		for(int x=1; x<arr.length; x++)
		{
			if(arr[x] > arr[max])
			{
				max = x;
			}
		}
		return arr[max];
	}
}
*/

public class ArrayTool
{
	/**
	空参数构造函数
	*/
	private ArrayTool(){}  //私有化
	/**
	获取一个整型数组中的最大值
	@param arr 接受一个int类型的数组
	@return 会返回一个该数组中最大值
	*/
	public static int getMax(int [] arr)
	{
		int max = 0;  //arr的最大值角标
		for(int x=1; x<arr.length; x++)
		{
			if(arr[x] > arr[max])
			{
				max = x;
			}
		}
		return arr[max];
	}

	/**
	获取一个整型数组的最小值
	@param arr 接受一个int类型的数组
	@return 会返回一个该数组中最小值
	*/
	public static int  getMin(int [] arr)
	{
		int min = 0;
		for(int x=1; x<arr.length; x++)
		{
			if(arr[x] < arr[min])
			{
				min = x;
			}

		}
		return arr[min];
	}

	/**
	给数组中元素进行文位置的交换
	@param arr 接受一个int类型的数组
	@param a 要置换的位置
	*/
	private static void swap(int [] arr, int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	/**
	给int数组进行选择排序
	@param arr接受一个int类型的数组
	*/
	public static void selectSort(int [] arr)
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=x+1; y<arr.length; y++)
			{
				if(arr[x]> arr[y])
				{
					swap(arr,x,y);
				}
			}
		}

	}

	/**
	给int数组进行冒泡排序
	@param arr 接受一个int 类型的数组。
	*/
	public static void bubbleSort(int[] arr)  
	{
		for(int x=0; x<arr.length-1; x++)
		{
			for(int y=0; y<arr.length-x-1; y++)
			{
				if(arr[y]>arr[y+1])
				{
					swap(arr,y,y+1);
				}
			}
		}
	}
/*
给上面冒泡排序测数
int [] arr = {5,6,2,8};

x=0;x<4;x++
y=0;y<3;y++
if(arr[0]>arr[1])
no swap
{5,6,2,8}

y=1
arr[1]>arr[2]
swap
{5,2,6,8};

y=2
arr[2]>arr[3]
no swap
{5,2,6,8};

x=1;x<4;x++
y=0;y<2;y++
arr[0]>arr[1]
swap
{2,5,6,8};

y=1
arr[1]>arr[2]
no swap
{2,5,6,8};
x=2,x=3以此类推
*/


	/**
	用于打印数组中的元素,打印形式是:[elemet1,elemet2,...]
	*/
	public static void printArray(int [] arr)
	{
		System.out.print("[");
		for(int x=0; x<arr.length; x++)
		{
			if(x!=arr.length-1)  //x还不是数组的最后一个下标的时候
			{
				System.out.print(arr[x]+",");
			}
			else 
				System.out.print(arr[x]+"]"); //x为数组最后一个下标的时候
		}

	}

}

/*
一个类中默认会有一个空参数的构造函数
这个默认的构造函数的权限和所属类一致
如果该类被public修饰，那么默认的构造函数也带public修饰符
如果类没有被public修饰，那么默认的构造函数，也没有public修饰

也就是说默认的构造函数的权限跟随着类的变换而变换
*/