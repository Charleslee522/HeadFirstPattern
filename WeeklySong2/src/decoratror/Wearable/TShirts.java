package decoratror.Wearable;

import Song.Song;

public class TShirts extends Wearable {
	
	Song song;
	
	public TShirts(Song song) {
		this.song= song;
	}
	
	@Override
	public String getDescription() {
		return "Ƽ������ ���� " + song.getDescription();
	}

	@Override
	public int �ŷ¹߻�() {
		return song.�ŷ¹߻�() + 2;
	}

	@Override
	public void speakAll() {
		song.speakAll();
	}
}
