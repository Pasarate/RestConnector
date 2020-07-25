package com.drive.google;

public class Location {

    public String latitude;
    public String human_address;
    public Boolean needs_recoding;
    public String longitude;

    public Location(String latitude, String human_address, Boolean needs_recoding, String longitude) {
        this.latitude = latitude;
        this.human_address = human_address;
        this.needs_recoding = needs_recoding;
        this.longitude = longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getHuman_address() {
        return human_address;
    }

    public void setHuman_address(String human_address) {
        this.human_address = human_address;
    }

    public Boolean getNeeds_recoding() {
        return needs_recoding;
    }

    public void setNeeds_recoding(Boolean needs_recoding) {
        this.needs_recoding = needs_recoding;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    @Override
    public String toString() {
        return "Location{" +
                "latitude='" + latitude + '\'' +
                ", human_address='" + human_address + '\'' +
                ", needs_recoding=" + needs_recoding +
                ", longitude='" + longitude + '\'' +
                '}';
    }
}
