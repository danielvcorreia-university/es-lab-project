
package com.trybuildapp.demo;

import javax.annotation.Generated;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "all"
})
@Generated("jsonschema2pojo")
public class Clouds {

    @JsonProperty("all")
    private Integer all;

    @JsonProperty("all")
    public Integer getAll() {
        return all;
    }

    @JsonProperty("all")
    public void setAll(Integer all) {
        this.all = all;
    }

    public Clouds withAll(Integer all) {
        this.all = all;
        return this;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("all");
        sb.append('=');
        sb.append(((this.all == null)?"<null>":this.all));
        sb.append(',');

        return sb.toString();
    }

}
