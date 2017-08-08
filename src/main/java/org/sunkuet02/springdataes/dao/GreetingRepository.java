package org.sunkuet02.springdataes.dao;

import org.sunkuet02.springdataes.model.Greeting;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import java.util.List;

public interface GreetingRepository extends ElasticsearchRepository<Greeting, String> {
    List<Greeting> findByUsername(String username);
}
