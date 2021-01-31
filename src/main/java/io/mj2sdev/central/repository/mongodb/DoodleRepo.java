package io.mj2sdev.central.repository.mongodb;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import io.mj2sdev.central.model.Doodle;

public interface DoodleRepo extends MongoRepository<Doodle, String> {
  
  public Doodle insert(Doodle doodle);

  public List<Doodle> findAll();
}
