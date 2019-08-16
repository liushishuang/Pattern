package uml.dependence;

public class PersonServiceBean {
	//成员属性
	private PersonDao personDao;// 类
	//参数
	public void save(Person person) {
	}
	//返回值
	public IDCard getIDCard(Integer personid) {
		return null;
	}

	//方法中使用到
	public void modify() {
		Department department = new Department();
	}

}
