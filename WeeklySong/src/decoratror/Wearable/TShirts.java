package decoratror.Wearable;

import Song.NickName;

public class TShirts extends Wearable {
	
	NickName nickName;
	
	public TShirts(NickName nickName) {
		this.nickName = nickName;
	}
	
	@Override
	public String getDescription() {
		return "티셔츠를 입은 " + nickName.getDescription();
	}

	@Override
	public int 매력발산() {
		return nickName.매력발산() + 2;
	}
}
