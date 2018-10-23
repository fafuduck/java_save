/*
�������ݿ�Ĳ�����
�����ǣ��û���Ϣ
1.�������ݿ⡣ JDBC  Hibernate
2.�������ݿ�
	c create r read  u update d delete
3.�ر����ݿ����ӡ�
���Ϊα���룬��׼������
*/

class UserInfoByJDBC implements UserInfoDao
{
	public void add(User user)
	{
		1,JDBC�������ݿ⡣
		2.ʹ��sql���������������
		3.�ر����ӡ�
	}
	public void delete(User user)
	{
		1,JDBC�������ݿ⡣
		2.ʹ��sql�������ɾ������
		3.�ر����ӡ�
	}
}

class UserInfoByHibernate implements UserInfoDao
{
	public void add(User user)
	{
		1,Hibernate�������ݿ⡣
		2.ʹ��sql���������������
		3.�ر����ӡ�
	}
	public void delete(User user)
	{
		1,Hibernate�������ݿ⡣
		2.ʹ��sql�������ɾ������
		3.�ر����ӡ�
	}
}

interface UerInfoDao
{
	public void add(User user);

	public void delete(User user);
}

class  DBOperate
{
	public static void main(String[] args) 
	{
	//	UserInfoByJDBC ui = new UserInfoByJDBC();
		UserInfoDao ui = new UserInfoByHibernate();
		ui.add(user);
		ui.delete(user);
	}
}