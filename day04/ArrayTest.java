/*
����һ������{5,1,6,4,2,8,9}

1.��ȡ�����е����ֵ���Լ���Сֵ
*/
class ArrayTest
{
/*
��ȡ�����е����ֵ��
˼·��
1.��ȡ��ֵ��Ҫ���бȽϡ�ÿһ�αȽ϶�����һ���ϴ��ֵ����Ϊ��ֵ��ȷ����
ͨ��һ�����������ٴ�
2.�������е�ÿһ��Ԫ�ض�����������е�ֵ���бȽ�
������ڱ����е�ֵ�����øñ�����¼�ϴ�ֵ
3.�����е�Ԫ�ض��Ƚ���ɣ���ô�ñ����д洢�ľ��������е����ֵ

���裺
1.�����������ʼ��Ϊ����������һ��Ԫ�ؼ��ɡ�
2.ͨ��ѭ������������б���
3.�ڱ��������ж����ж������������������Ԫ�رȱ����е�Ԫ�ش󣬾͸�ֵ���ñ�����

��Ҫ��һ����������ɣ��Ա���߸�����
1.��ȷ����������е����Ԫ�� int
2.δ֪���ݣ�һ������ int[]

*/
	public static void main(String[] args)
	{
		int[] arr = {5,1,6,4,2,8,9};
	
		int max = getMax(arr);
		int min = getMin(arr);

		System.out.println("max="+max);
		System.out.println("min="+min);
	}


	//��ȡ���ֵ�ĵ�һ�ַ�ʽ
	public static int getMax(int[] arr)
	{
		int max = arr[0];

		for(int x=1; x<arr.length; x++)
		{
			if(arr[x]>max)
			   max = arr[x];
		}
		return max;
	}

	//��ȡ����ֵ��һ�ַ�ʽ
	//�ɲ����Խ���ʱ������ʼ��Ϊ0�ء� ���ԣ����ַ�ʽ����ʵ���ڳ�ʼ��Ϊ����������һ���Ǳꡣ

	public static int getMax_2(int[] arr)
	{
		int max = 0;

		for(int x=1; x<arr.length; x++)
		{
			if(arr[x]>arr[max])
			   max = arr[x];
		}
		return arr[max];
	}
	

	public static int getMin(int[] arr)
	{
		int min = 0;

		for(int x=1; x<arr.length; x++)
		{
			if(arr[x]<arr[min])
			   min = arr[x];
		}
		return arr[min];
	}

	
	//��ȡdouble������������ֵ����Ϊ����һ�£����Զ�����ͬ�������ơ���������ʽ���ڡ�
	
	
}
