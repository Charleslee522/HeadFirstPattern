package decoratror.Wearable;

import Song.NickName;

public class TShirts extends Wearable {
	
	NickName nickName;
	
	public TShirts(NickName nickName) {
		this.nickName = nickName;
	}
	
	@Override
	public String getDescription() {
		return "Ƽ������ ���� " + nickName.getDescription();
	}

	@Override
	public int �ŷ¹߻�() {
		return nickName.�ŷ¹߻�() + 2;
	}
}
