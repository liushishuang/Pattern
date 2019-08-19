package pattern.behavioralType.memento.game;

import lombok.Getter;
import lombok.Setter;

public class GameRole {

	@Getter
	@Setter
	private int vit;
	@Getter
	@Setter
	private int def;
	
	//����Memento ,�����ݵ�ǰ��״̬�õ�Memento
	public Memento createMemento() {
		return new Memento(vit, def);
	}
	
	//�ӱ���¼���󣬻ָ�GameRole��״̬
	public void recoverGameRoleFromMemento(Memento memento) {
		this.vit = memento.getVit();
		this.def = memento.getDef();
	}
	
	//��ʾ��ǰ��Ϸ��ɫ��״̬
	public void display() {
		System.out.println("��Ϸ��ɫ��ǰ�Ĺ�������" + this.vit + " ������: " + this.def);
	}

	
}
