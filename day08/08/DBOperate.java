/*
�������ݿ�Ĳ�����
�����ǣ��û���Ϣ
1.�������ݿ⡣ JDBC  Hibernate
2.�������ݿ�
	c create r read  u update d delete
3.�ر����ݿ����ӡ�
���Ϊα���룬��׼������
*/

interface UerInfoDao
{
	public void add(User user);
	public void delete(User user);
}

class UserInfoByJDBC implements UserInfoDao
{
	public void add(User user);
	1.JDBC�������ݿ�;
	2.ʹ��sql�������������;
	3.�ر�����;
}

class UserInfoByHibernate implements UserInfoDao
{
	public void add(User user)
	{
		1.Hibernate�������ݿ�;
		2.ʹ��sql�������������;
		3.�ر�����;
	}
	public void delete(User user)
	{
		1.Hibernate�������ݿ�;
		2.ʹ��sql������ɾ������;
		3.�ر�����
	}
}
class  DBOperate
{
	public static void main(String[] args) 
	{
		//UserInfoByJDBC ui = new UserInfoByJDBC();
		UserInfoDao ui = new UserInfoByHibernate();
		ui.add(user);
		ui.delete(user);
	}
}
