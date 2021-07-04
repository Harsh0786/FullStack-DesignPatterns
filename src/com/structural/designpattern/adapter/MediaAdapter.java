package com.structural.designpattern.adapter;

public class MediaAdapter implements MediaPlayer {

	@Override
	public void playFormat(String fileName) {
	if(fileName.equals("VLC")){
		AdvancedMediaPlayer vlc = new VLCMediaPlayer();
		vlc.playingFormat(fileName);
	}
	else if(fileName.equals("MP4")){
		AdvancedMediaPlayer mp4 = new MP4MediaPlayer();
		mp4.playingFormat(fileName);
	}
	else{
		MediaPlayer mp3 = new AudioPlayer();
		mp3.playFormat(fileName);
	}
	}

}
