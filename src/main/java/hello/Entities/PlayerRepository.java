package hello.Entities;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface  PlayerRepository extends CrudRepository<Player, Long> {


}