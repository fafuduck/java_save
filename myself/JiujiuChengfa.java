class JiujiuChengfa  //99乘法表 
{
	public static void main(String[] args) 
	{
		int z; // z当作后面x*y的乘积，为了让程序最小化，我把x，y两个数放到for循环当中去，这样for结束后他们就自动消失，就可以释放内存

		for(int x=1; x<=9; x++)
		{
			for(int y=1; y<=x; y++)
			{
				z = x * y;
				System.out.print("x*y="+z+" ");
			}
			System.out.println();  //该行只起到换行的作用
		}

	}
}
