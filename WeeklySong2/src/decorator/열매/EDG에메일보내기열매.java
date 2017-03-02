package decorator.열매;

import Song.Song;

public class EDG에메일보내기열매 extends 열매 {
	Song song;
	
	public EDG에메일보내기열매(Song song) {
		this.song = song;
	}
	
	@Override
	public String getDescription() {
		return "EDG에 메일을 보낸 " + song.getDescription();
	}

	@Override
	public int 매력발산() {
		return song.매력발산() + 50;
	}

	@Override
	public void speakAll() {
		song.speakAll();
	}
}
