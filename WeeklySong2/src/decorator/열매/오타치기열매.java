package decorator.����;

import Song.Song;

public class ��Ÿġ�⿭�� extends ���� {
	public Song song;
	
	public ��Ÿġ�⿭��(Song song) {
		this.song = song;
	}
	
	@Override
	public String getDescription() {
		return "��Ÿ�� ģ " + song.getDescription();
	}

	@Override
	public int �ŷ¹߻�() {
		
		return song.�ŷ¹߻�() + 50;
	}

	@Override
	public void speakAll() {
		song.speakAll();
	}
}
