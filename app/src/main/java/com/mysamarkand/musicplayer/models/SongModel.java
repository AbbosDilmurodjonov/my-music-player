package com.mysamarkand.musicplayer.models;

public class SongModel {
    private long id;
    private String title;
    private String artist;
    private String uri;

    public SongModel(long id, String title, String artist, String uri) {
        this.id = id;
        this.title = title;
        this.artist = artist;
        this.uri = artist;
    }

    public SongModel() {
    }

    // getter and setter methods
    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
        return artist;
    }

    public String getUri() {
        return uri;
    }

}
