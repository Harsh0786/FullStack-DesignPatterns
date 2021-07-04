package com.structural.designpattern.adapter;

public class MP4MediaPlayer implements AdvancedMediaPlayer {

	@Override
	public void playingFormat(String fileName) {
	System.out.println("MP4 format..."+fileName);
	}
	
}
