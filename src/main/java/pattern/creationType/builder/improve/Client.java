package pattern.creationType.builder.improve;

public class Client {
	public static void main(String[] args) {
		
		//����ͨ����
		CommonHouseBuilding commonHouse = new CommonHouseBuilding();
		//׼���������ӵ�ָ����
		HouseDirector houseDirector = new HouseDirector(commonHouse);
		
		//��ɸǷ��ӣ����ز�Ʒ(��ͨ����)
		House house = houseDirector.constructHouse();
		
		//System.out.println("�������");
		
		System.out.println("--------------------------");
		//�Ǹ�¥
		HighHouseBuilding highBuilding = new HighHouseBuilding();
		//���ý�����
		houseDirector.setHouseBuilder(highBuilding);
		//��ɸǷ��ӣ����ز�Ʒ(��¥)
		houseDirector.constructHouse();
		
		
		
	}
}
