package decoratror.Wearable;

import Song.Song;

public class ���� extends Wearable {
	
	Song song;
	
	public ����(Song song) {
		this.song = song;
	}
	
	@Override
	public String getDescription() {
		return "������ ���� " + song.getDescription();
	}

	@Override
	public int �ŷ¹߻�() {
		return song.�ŷ¹߻�() + 200;
	}

	@Override
	public void speakAll() {
		song.speakAll();
	}
}
