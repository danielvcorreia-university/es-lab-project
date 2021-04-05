
package com.trybuildapp.demo;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import javax.annotation.processing.Generated;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "temp",
    "feels_like",
    "temp_min",
    "temp_max",
    "pressure",
    "humidity"
})
@Generated("jsonschema2pojo")
public class Main {

    @JsonProperty("temp")
    private Integer temp;
    @JsonProperty("feels_like")
    private Float feelsLike;
    @JsonProperty("temp_min")
    private Integer tempMin;
    @JsonProperty("temp_max")
    private Integer tempMax;
    @JsonProperty("pressure")
    private Integer pressure;
    @JsonProperty("humidity")
    private Integer humidity;

    @JsonProperty("temp")
    public Integer getTemp() {
        return temp;
    }

    @JsonProperty("temp")
    public void setTemp(Integer temp) {
        this.temp = temp;
    }

    public Main withTemp(Integer temp) {
        this.temp = temp;
        return this;
    }

    @JsonProperty("feels_like")
    public Float getFeelsLike() {
        return feelsLike;
    }

    @JsonProperty("feels_like")
    public void setFeelsLike(Float feelsLike) {
        this.feelsLike = feelsLike;
    }

    public Main withFeelsLike(Float feelsLike) {
        this.feelsLike = feelsLike;
        return this;
    }

    @JsonProperty("temp_min")
    public Integer getTempMin() {
        return tempMin;
    }

    @JsonProperty("temp_min")
    public void setTempMin(Integer tempMin) {
        this.tempMin = tempMin;
    }

    public Main withTempMin(Integer tempMin) {
        this.tempMin = tempMin;
        return this;
    }

    @JsonProperty("temp_max")
    public Integer getTempMax() {
        return tempMax;
    }

    @JsonProperty("temp_max")
    public void setTempMax(Integer tempMax) {
        this.tempMax = tempMax;
    }

    public Main withTempMax(Integer tempMax) {
        this.tempMax = tempMax;
        return this;
    }

    @JsonProperty("pressure")
    public Integer getPressure() {
        return pressure;
    }

    @JsonProperty("pressure")
    public void setPressure(Integer pressure) {
        this.pressure = pressure;
    }

    public Main withPressure(Integer pressure) {
        this.pressure = pressure;
        return this;
    }

    @JsonProperty("humidity")
    public Integer getHumidity() {
        return humidity;
    }

    @JsonProperty("humidity")
    public void setHumidity(Integer humidity) {
        this.humidity = humidity;
    }

    public Main withHumidity(Integer humidity) {
        this.humidity = humidity;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("temp");
        sb.append('=');
        sb.append(((this.temp == null)?"<null>":this.temp));
        sb.append(',');
        sb.append("feelsLike");
        sb.append('=');
        sb.append(((this.feelsLike == null)?"<null>":this.feelsLike));
        sb.append(',');
        sb.append("tempMin");
        sb.append('=');
        sb.append(((this.tempMin == null)?"<null>":this.tempMin));
        sb.append(',');
        sb.append("tempMax");
        sb.append('=');
        sb.append(((this.tempMax == null)?"<null>":this.tempMax));
        sb.append(',');
        sb.append("pressure");
        sb.append('=');
        sb.append(((this.pressure == null)?"<null>":this.pressure));
        sb.append(',');
        sb.append("humidity");
        sb.append('=');
        sb.append(((this.humidity == null)?"<null>":this.humidity));
        sb.append(',');

        return sb.toString();
    }

}
