package pattern.structuralType.bridge;

//������ʹ�� Ʒ�ƵĽӿ�
public abstract class Phone {
	
	//���Ʒ��
	private Brand brand;

	//������
	public Phone(Brand brand) {
		super();
		this.brand = brand;
	}
	
	protected void open() {
		this.brand.open();
	}
	protected void close() {
		brand.close();
	}
	protected void call() {
		brand.call();
	}
	
}
