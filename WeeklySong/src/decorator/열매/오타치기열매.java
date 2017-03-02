package decorator.열매;

import Song.NickName;

public class 오타치기열매 extends 열매 {
	NickName nickName;
	
	public 오타치기열매(NickName nickName) {
		this.nickName = nickName;
	}
	
	@Override
	public String getDescription() {
		return "오타를 친 " + nickName.getDescription();
	}

	@Override
	public int 매력발산() {
		
		return nickName.매력발산() + 50;
	}
}
