package decoratror.Wearable;

import Song.NickName;

public class 정장 extends Wearable {
	
	NickName nickName;
	
	public 정장(NickName nickName) {
		this.nickName = nickName;
	}
	
	@Override
	public String getDescription() {
		return "정장을 입은 " + nickName.getDescription();
	}

	@Override
	public int 매력발산() {
		return nickName.매력발산() + 200;
	}
}
