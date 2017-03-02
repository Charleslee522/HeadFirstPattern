package decoratror.Wearable;

import Song.Song;

public class 정장 extends Wearable {
	
	Song song;
	
	public 정장(Song song) {
		this.song = song;
	}
	
	@Override
	public String getDescription() {
		return "정장을 입은 " + song.getDescription();
	}

	@Override
	public int 매력발산() {
		return song.매력발산() + 200;
	}

	@Override
	public void speakAll() {
		song.speakAll();
	}
}
