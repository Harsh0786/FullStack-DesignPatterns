package com.structural.designpattern.adapter;

public class AdapterDemoPattern {
public static void main(String args[]){
MediaAdapter mp4 = new MediaAdapter();
mp4.playFormat("VLC");
}
}
