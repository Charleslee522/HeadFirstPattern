package decoratror.Wearable;

import Song.NickName;

public class ���� extends Wearable {
	
	NickName nickName;
	
	public ����(NickName nickName) {
		this.nickName = nickName;
	}
	
	@Override
	public String getDescription() {
		return "������ ���� " + nickName.getDescription();
	}

	@Override
	public int �ŷ¹߻�() {
		return nickName.�ŷ¹߻�() + 200;
	}
}
