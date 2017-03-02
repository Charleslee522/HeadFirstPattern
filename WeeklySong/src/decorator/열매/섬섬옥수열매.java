package decorator.¿­¸Å;

import Song.NickName;

public class ¼¶¼¶¿Á¼ö¿­¸Å extends ¿­¸Å {

	NickName nickName;
	
	public ¼¶¼¶¿Á¼ö¿­¸Å(NickName nickName) {
		this.nickName = nickName;
	}
	
	@Override
	public String getDescription() {
		return "¼¶¼¶¿Á¼ö ¿­¸Å¸¦ ¸ÔÀº " + nickName.getDescription();
	}

	@Override
	public int ¸Å·Â¹ß»ê() {
		
		return nickName.¸Å·Â¹ß»ê() + 20;
	}

}
