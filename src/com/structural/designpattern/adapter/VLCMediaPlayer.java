package com.structural.designpattern.adapter;

public class VLCMediaPlayer implements AdvancedMediaPlayer {

	@Override
	public void playingFormat(String fileName) {
	System.out.println("VLC Media Player format..."+fileName);
	}
	
}
