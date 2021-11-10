package com.example.vraj.coronavirustracker.models;

public class LocationStats {

    private String city_state_country;
    private int latestTotalCases;
    private int changeInCases;

    public void setCity_state_country(String city_state_country) {
        this.city_state_country = city_state_country;
    }

    public void setLatestTotalCases(int latestTotalCases) {
        this.latestTotalCases = latestTotalCases;
    }

    public String getCity_state_country() {
        return city_state_country;
    }

    public int getLatestTotalCases() {
        return latestTotalCases;
    }

    @Override
    public String toString() {
        return "LocationStats{" +
                "city_state_country='" + city_state_country + '\'' +
                ", latestTotalCases=" + latestTotalCases + '\'' +
                ", changeInCases=" + changeInCases +
                '}';
    }

    public int getChangeInCases() {
        return changeInCases;
    }

    public void setChangeInCases(int changeInCases) {
        this.changeInCases = changeInCases;
    }
}
