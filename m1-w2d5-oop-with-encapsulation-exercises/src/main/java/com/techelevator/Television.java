package com.techelevator;

public class Television {
private boolean isOn;
private int currentChannel;
private int currentVolume;

void turnOff() {
	isOn = false;
}

void turnOn() {
	isOn = true;
	this.currentChannel = 3;
	this.currentVolume = 2;
}

void changeChannel(int newChannel) {
	if(isOn) 
		if (newChannel >=3 && newChannel <=18) 
		currentChannel = newChannel;
	}			
		


void channelUp() {
	if(isOn) 
		if (currentChannel >=3 && currentChannel <= 17) 
			currentChannel++;
		}
	


void channelDown() {
	if(isOn) 
		if (currentChannel >=4 && currentChannel <= 18) 
			currentChannel--;
		}


void raiseVolume() {
	if(isOn) 
		if (currentVolume >=0 && currentChannel <= 9) 
			currentVolume++;
		}


void lowerVolume() {
	if(isOn) 
		if (currentVolume >=1 && currentChannel <= 10) 
			currentVolume--;
		}

public boolean isOn() {
	return isOn;
}
public int getCurrentChannel() {
	return currentChannel;
}
public int getCurrentVolume() {
	return currentVolume;
}


}
