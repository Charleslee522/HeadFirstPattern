package decorator.����;

import Song.NickName;

public class ��Ÿġ�⿭�� extends ���� {
	NickName nickName;
	
	public ��Ÿġ�⿭��(NickName nickName) {
		this.nickName = nickName;
	}
	
	@Override
	public String getDescription() {
		return "��Ÿ�� ģ " + nickName.getDescription();
	}

	@Override
	public int �ŷ¹߻�() {
		
		return nickName.�ŷ¹߻�() + 50;
	}
}
