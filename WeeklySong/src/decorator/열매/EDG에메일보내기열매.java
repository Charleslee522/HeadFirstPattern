package decorator.����;

import Song.NickName;

public class EDG�����Ϻ����⿭�� extends ���� {
NickName nickName;
	
	public EDG�����Ϻ����⿭��(NickName nickName) {
		this.nickName = nickName;
	}
	
	@Override
	public String getDescription() {
		return "EDG�� ������ ���� " + nickName.getDescription();
	}

	@Override
	public int �ŷ¹߻�() {
		return nickName.�ŷ¹߻�() + 50;
	}
}
