class Car
{
	//车的颜色
	String color = "红色";
	//轮胎数
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
		c.color = "蓝色";
		c.run();
		*/

		//这三行是相互独立的，一点关系都没有
		new Car().num = 5;  
		new Car().color = "紫色";
		new Car().run();
	}

	//public static void main(Car c)
}
