/**
����һ�����Զ�������в����Ĺ�����,�������ṩ�˻�ȡ��ֵ������ȹ��ܡ�
@author �ֳɻ�
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
	�ղ������캯��
	*/
	private ArrayTool(){}  //˽�л�
	/**
	��ȡһ�����������е����ֵ
	@param arr ����һ��int���͵�����
	@return �᷵��һ�������������ֵ
	*/
	public static int getMax(int [] arr)
	{
		int max = 0;  //arr�����ֵ�Ǳ�
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
	��ȡһ�������������Сֵ
	@param arr ����һ��int���͵�����
	@return �᷵��һ������������Сֵ
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
	��������Ԫ�ؽ�����λ�õĽ���
	@param arr ����һ��int���͵�����
	@param a Ҫ�û���λ��
	*/
	private static void swap(int [] arr, int a,int b)
	{
		int temp = arr[a];
		arr[a] = arr[b];
		arr[b] = temp;
	}

	/**
	��int�������ѡ������
	@param arr����һ��int���͵�����
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
	��int�������ð������
	@param arr ����һ��int ���͵����顣
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
������ð���������
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
x=2,x=3�Դ�����
*/


	/**
	���ڴ�ӡ�����е�Ԫ��,��ӡ��ʽ��:[elemet1,elemet2,...]
	*/
	public static void printArray(int [] arr)
	{
		System.out.print("[");
		for(int x=0; x<arr.length; x++)
		{
			if(x!=arr.length-1)  //x��������������һ���±��ʱ��
			{
				System.out.print(arr[x]+",");
			}
			else 
				System.out.print(arr[x]+"]"); //xΪ�������һ���±��ʱ��
		}

	}

}

/*
һ������Ĭ�ϻ���һ���ղ����Ĺ��캯��
���Ĭ�ϵĹ��캯����Ȩ�޺�������һ��
������౻public���Σ���ôĬ�ϵĹ��캯��Ҳ��public���η�
�����û�б�public���Σ���ôĬ�ϵĹ��캯����Ҳû��public����

Ҳ����˵Ĭ�ϵĹ��캯����Ȩ�޸�������ı任���任
*/