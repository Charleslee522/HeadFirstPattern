package Song;

import nickName.NickName;
import speakBehavior.인터페이스.SpeakEnglishBehavior;
import speakBehavior.인터페이스.SpeakKoreanBehavior;
import speakBehavior.인터페이스.SpeakThaiBehavior;

abstract public class Song extends NickName {

	protected SpeakKoreanBehavior speakKorean_;
	protected SpeakEnglishBehavior speakEnglish_;
	protected SpeakThaiBehavior speakThai_;

	public Song() {
	}

	public void setSpeakBehavior(SpeakKoreanBehavior behavior)
	{
		speakKorean_ = behavior;
	}
	public void setSpeakBehavior(SpeakEnglishBehavior behavior)
	{
		speakEnglish_ = behavior;
	}
	public void setSpeakBehavior(SpeakThaiBehavior behavior)
	{
		speakThai_ = behavior;
	}

	public void speakKorean() {
		if(speakKorean_ == null) {
			System.err.println(getName() + "'s speakKorean_ interface is null!!!");
		} else {
			speakKorean_.speakKorean();
		}
	}

	public void speakEnglish() {
		if(speakEnglish_ == null) {
			System.err.println(getName() + "'s speakEnglish_ interface is null!!!");
		} else {
			speakEnglish_.speakEnglish();
		}
	}

	public void speakThai() {
		if(speakThai_ == null) {
			System.err.println(getName() + "'s speakThai_ interface is null!!!");
		} else {
			speakThai_.speakThai();
		}
	}

	public void speakAll() {
		System.out.println(getDescription());
		this.speakKorean();
		this.speakEnglish();
		this.speakThai();
	}
	
	public String getDescription() {
		return description;
	}
	
	protected String getName() {
		return this.getClass().getName();
	}

}
