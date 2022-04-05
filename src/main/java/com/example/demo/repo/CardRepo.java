package com.example.demo.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Card;

public interface CardRepo extends JpaRepository<Card, Long> {	
	@Query("from Card order by id ASC")
	List <Card> findByIDSorted();	
	
	@Query(value="SELECT * from Card where id=?1",nativeQuery=true)
	List<Card> findByviewdataIDSorted(int id);
	
	@Modifying
	@Query(value="DELETE from Card where id=?1",nativeQuery=true)
	@Transactional
	void deleteByviewdataID(int id);
}
