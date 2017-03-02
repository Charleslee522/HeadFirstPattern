package decorator.열매;

import Song.NickName;

public class EDG에메일보내기열매 extends 열매 {
NickName nickName;
	
	public EDG에메일보내기열매(NickName nickName) {
		this.nickName = nickName;
	}
	
	@Override
	public String getDescription() {
		return "EDG에 메일을 보낸 " + nickName.getDescription();
	}

	@Override
	public int 매력발산() {
		return nickName.매력발산() + 50;
	}
}
