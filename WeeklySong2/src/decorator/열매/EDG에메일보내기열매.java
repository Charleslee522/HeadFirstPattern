package decorator.����;

import Song.Song;

public class EDG�����Ϻ����⿭�� extends ���� {
	Song song;
	
	public EDG�����Ϻ����⿭��(Song song) {
		this.song = song;
	}
	
	@Override
	public String getDescription() {
		return "EDG�� ������ ���� " + song.getDescription();
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
