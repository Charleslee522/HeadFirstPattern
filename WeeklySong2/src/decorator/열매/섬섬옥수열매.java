package decorator.����;

import Song.Song;

public class ������������ extends ���� {

	Song song;
	
	public ������������(Song song) {
		this.song = song;
	}
	
	@Override
	public String getDescription() {
		return "�������� ���Ÿ� ���� " + song.getDescription();
	}

	@Override
	public int �ŷ¹߻�() {
		
		return song.�ŷ¹߻�() + 20;
	}

	@Override
	public void speakAll() {
		song.speakAll();
	}

}
