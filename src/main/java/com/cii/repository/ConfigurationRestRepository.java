package com.cii.repository;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;
import com.cii.model.config.Configuration;

@Repository
public class ConfigurationRestRepository extends RestRepository<Configuration> {
    protected static final Logger LOGGER = LoggerFactory.getLogger(ConfigurationRestRepository.class);
    ConfigurationRestRepository() {
        super();
        this.pluralForm = "configurations";
        this.singularForm = "configuration";
        this.classRef = Configuration.class;
        this.classARef = Configuration[].class;
        this.findBySort = "CreateDateDesc";
    }
	public Configuration findOne(String id) {
        return findById(id);
    }
	public Configuration findById(String id) {
        String url = searchMethodUrl("findByIdOrderByIdAsc", "id");
        List<Configuration> cfgs = doGetEntityList(url, Configuration[].class, id);
        return cfgs.isEmpty() ? null : cfgs.get(0);
    }
}
