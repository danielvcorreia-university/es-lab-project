
package com.trybuildapp.demo;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "lon",
    "lat"
})
@Generated("jsonschema2pojo")
public class Coord {

    @JsonProperty("lon")
    private Float lon;
    @JsonProperty("lat")
    private Float lat;

    @JsonProperty("lon")
    public Float getLon() {
        return lon;
    }

    @JsonProperty("lon")
    public void setLon(Float lon) {
        this.lon = lon;
    }

    public Coord withLon(Float lon) {
        this.lon = lon;
        return this;
    }

    @JsonProperty("lat")
    public Float getLat() {
        return lat;
    }

    @JsonProperty("lat")
    public void setLat(Float lat) {
        this.lat = lat;
    }

    public Coord withLat(Float lat) {
        this.lat = lat;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("lon");
        sb.append('=');
        sb.append(((this.lon == null)?"<null>":this.lon));
        sb.append(',');
        sb.append("lat");
        sb.append('=');
        sb.append(((this.lat == null)?"<null>":this.lat));
        sb.append(',');

        return sb.toString();
    }

}
