package testDrive;

import device.Amplifier;
import device.CdPlayer;
import device.DvdPlayer;
import device.PopcornPopper;
import device.Projector;
import device.Screen;
import device.TheaterLights;
import device.Tuner;
import homeTheater.HomeTheaterFacade;

public class HomeThearterTestDrive {
	public static void main(String[] args) {
		Amplifier amp = new Amplifier();
		Tuner tuner = new Tuner();
		DvdPlayer dvd = new DvdPlayer();
		CdPlayer cd = new CdPlayer();
		Projector projector = new Projector();
		TheaterLights screen = new TheaterLights();
		Screen lights = new Screen();
		PopcornPopper popper = new PopcornPopper();
		HomeTheaterFacade homeTheater = 
				new HomeTheaterFacade(amp, tuner, dvd, cd, projector, screen, lights, popper);
		
		homeTheater.watchMovie("Raiders of the Lost Ark");
		homeTheater.endMovie();
	}
}
