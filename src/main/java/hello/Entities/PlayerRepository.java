package hello.Entities;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface  PlayerRepository extends MongoRepository<Player, String> {

    public Player findByName(String name);


}