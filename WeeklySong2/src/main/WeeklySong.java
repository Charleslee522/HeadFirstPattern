package main;

import decorator.����.EDG�����Ϻ����⿭��;
import decorator.����.������������;
import decorator.����.��Ÿġ�⿭��;
import decoratror.Wearable.TShirts;
import decoratror.Wearable.����;
import speakBehavior.��ũ��Ʈ.SpeakTankYou;
import speakBehavior.��ũ��Ʈ.Speak�����մϴ�;
import speakBehavior.��ũ��Ʈ.Speak�ο͵�İ;
import Song.Song;
import Song.��Ÿ��;
import Song.����ũ;
import Song.��ȣ��;

public class WeeklySong {

	public static void main(String[] args) {
		{
			Song ��������ũ = new ����ũ();
			��������ũ.speakAll();
		}
		
		{
			Song ������Ÿ�� = new ��Ÿ��();
			������Ÿ��.speakAll();
		}
		
		{
			Song ��ȣ�� = new ��ȣ��();
			��ȣ��.setSpeakBehavior(new SpeakTankYou());
			��ȣ��.setSpeakBehavior(new Speak�����մϴ�());
			��ȣ��.setSpeakBehavior(new Speak�ο͵�İ());
			��ȣ��.speakAll();
		}
		
		{
			Song Ƽ��������������������ȣ�� = new ��ȣ��();
			Ƽ��������������������ȣ�� = new ������������(Ƽ��������������������ȣ��);
			Ƽ��������������������ȣ�� = new TShirts(Ƽ��������������������ȣ��);
			System.out.println(Ƽ��������������������ȣ��.getDescription());
			System.out.println("�ŷ�����: " + Ƽ��������������������ȣ��.�ŷ¹߻�() + "��");
		}
		
		{
			Song �����԰�EDG�����Ϻ�����Ÿģ����ũ = new ����ũ();
			�����԰�EDG�����Ϻ�����Ÿģ����ũ = new ��Ÿġ�⿭��(�����԰�EDG�����Ϻ�����Ÿģ����ũ);
			�����԰�EDG�����Ϻ�����Ÿģ����ũ = new EDG�����Ϻ����⿭��(�����԰�EDG�����Ϻ�����Ÿģ����ũ);
			�����԰�EDG�����Ϻ�����Ÿģ����ũ = new ����(�����԰�EDG�����Ϻ�����Ÿģ����ũ);
			
			System.out.println(�����԰�EDG�����Ϻ�����Ÿģ����ũ.getDescription());
			System.out.println("�ŷ�����: " + �����԰�EDG�����Ϻ�����Ÿģ����ũ.�ŷ¹߻�() + "��");
			�����԰�EDG�����Ϻ�����Ÿģ����ũ.speakAll();
		}
	}
}
