class Car
{
	//������ɫ
	String color = "��ɫ";
	//��̥��
	int num = 4;

	void run()
	{
		System.out.println(color+".."+num);
	}

}

class CarDemo 
{
	public static void main(String[] args) 
	{
		/*
		Car c = new Car();
		c.run();
		c.color = "��ɫ";
		c.run();
		*/

		//���������໥�����ģ�һ���ϵ��û��
		new Car().num = 5;  
		new Car().color = "��ɫ";
		new Car().run();
	}

	//public static void main(Car c)
}
