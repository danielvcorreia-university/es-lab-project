package com.trybuildapp.demo;
import javax.persistence.*;
import java.util.Date;

@Entity
public class Temperature {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
    private String cityname;
    private int temp;

    @Temporal(TemporalType.TIMESTAMP)
    Date publicationDateTime;

    protected Temperature() {}

    public Temperature(String cityname, int temp, Date publicationDateTime) {
        this.cityname = cityname;
        this.temp = temp;
        this.publicationDateTime = publicationDateTime;
    }

    public Long getId() {
        return id;
    }

    public String getCityname() {
        return cityname;
    }

    public int getTemp() {
        return temp;
    }

    public Date getPublicationDateTime() {
        return publicationDateTime;
    }

    @Override
    public String toString() {
        return "Temperature{" +
                "id=" + id +
                ", cityname='" + cityname + '\'' +
                ", temp=" + temp +
                ", publicationDateTime=" + publicationDateTime.toString() +
                '}';
    }
}
