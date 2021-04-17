package com.trybuildapp.demo;
import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface TemperatureRepository extends CrudRepository<Temperature, Long>{

    List<Temperature> findByCityname (String cityname);

    List<Temperature> findByCitynameAndPublicationDateTimeAfter(String cityname, Date publicationDateTime);

    Temperature findById(long id);

}
