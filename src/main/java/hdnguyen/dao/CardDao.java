package hdnguyen.dao;

import hdnguyen.entity.Card;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface CardDao extends JpaRepository<Card, Integer> {

}
