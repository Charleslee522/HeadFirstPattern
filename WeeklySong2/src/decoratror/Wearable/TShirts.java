package decoratror.Wearable;

import Song.Song;

public class TShirts extends Wearable {
	
	Song song;
	
	public TShirts(Song song) {
		this.song= song;
	}
	
	@Override
	public String getDescription() {
		return "티셔츠를 입은 " + song.getDescription();
	}

	@Override
	public int 매력발산() {
		return song.매력발산() + 2;
	}

	@Override
	public void speakAll() {
		song.speakAll();
	}
}
