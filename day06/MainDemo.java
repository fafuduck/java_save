/*
public static void main(string[] args)

����������һ������ĺ�������Ϊ�������ڣ����Ա�jvm����

�������Ķ��壺
public�������Ÿú����ķ���Ȩ��������
static��������������������ļ��ؾ��Ѿ������ˣ�
void:������û�о���ķ���ֵ
main�����ǹؼ��֣�������һ������ĵ��ʣ����Ա�jvmʶ��
�����Ĳ���:��String[] args��

(String[] arr):�����Ĳ���������������һ�����飬�������е�Ԫ�����ַ������ַ������͵�����

�������ǹ̶���ʽ�ģ�jvmʶ��

jvm�ڵ���������ʱ���������new String[0]

*/

class MainDemo 
{
	public static void main(String[] args) //new String[]
	{
		String[] arr = {"hah","hehe","xixi","hiahia"};

		MainTest.main(arr);
	}
}

//String[] args = new String[3];
//String[] args = null;

class MainTest
{
	public static void main(String[] args)
	{
		for(int x=0; x<args.length; x++)
			System.out.println(args[x]);
	}
}