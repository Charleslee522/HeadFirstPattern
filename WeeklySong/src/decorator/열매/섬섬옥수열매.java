package decorator.����;

import Song.NickName;

public class ������������ extends ���� {

	NickName nickName;
	
	public ������������(NickName nickName) {
		this.nickName = nickName;
	}
	
	@Override
	public String getDescription() {
		return "�������� ���Ÿ� ���� " + nickName.getDescription();
	}

	@Override
	public int �ŷ¹߻�() {
		
		return nickName.�ŷ¹߻�() + 20;
	}

}
