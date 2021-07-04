package com.structural.designpattern.adapter;


public class AudioPlayer implements MediaPlayer {

	@Override
	public void playFormat(String fileName) {
	System.out.println("Playing mp3 format......"+fileName);
	}

}
