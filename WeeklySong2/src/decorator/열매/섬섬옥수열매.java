package decorator.¿­¸Å;

import Song.Song;

public class ¼¶¼¶¿Á¼ö¿­¸Å extends ¿­¸Å {

	Song song;
	
	public ¼¶¼¶¿Á¼ö¿­¸Å(Song song) {
		this.song = song;
	}
	
	@Override
	public String getDescription() {
		return "¼¶¼¶¿Á¼ö ¿­¸Å¸¦ ¸ÔÀº " + song.getDescription();
	}

	@Override
	public int ¸Å·Â¹ß»ê() {
		
		return song.¸Å·Â¹ß»ê() + 20;
	}

	@Override
	public void speakAll() {
		song.speakAll();
	}

}
