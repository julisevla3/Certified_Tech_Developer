package repository;

import model.TorneioModel;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TorneioRepository extends MongoRepository <TorneioModel, Integer> {

}
