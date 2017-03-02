package decorator.열매;

import Song.Song;

public class 오타치기열매 extends 열매 {
	public Song song;
	
	public 오타치기열매(Song song) {
		this.song = song;
	}
	
	@Override
	public String getDescription() {
		return "오타를 친 " + song.getDescription();
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
