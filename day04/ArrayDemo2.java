class ArrayDemo2
{
	public static void main(String[] args)
	{
		//��������һ�µ� ��һ�ֶ��巽��		
//		int[] arr = new int[2];   //�Ƽ������ 

//		int arr[] = new int[2];


		//�ڶ��ֶ��巽��
//		int[] arr = new int[]{3,1,6,5,4}; //��̬��ʼ����ʽ  []�����д���� {}д����

//		int[] arr = {3,1,6,5,4};//����ʽ
//		System.out.println(arr[2]); //  =6

		//��ȷ��ֵ�����
		int[] arr = new int[3];	

//		System.out.println(arr[3]); 
		//ArrayIndexOutOfBoundsException:3: ��������ʱ�����ʵ��������в����ڵĽǱ� Խ���� 

		arr = null;
		System.out.println(arr[1]); 
		//NullPointerException:��ָ���쳣��������û���κ�ָ��ֵλnull������������û��ڲ���		//���ڲ���ʵ��
		
	}
}