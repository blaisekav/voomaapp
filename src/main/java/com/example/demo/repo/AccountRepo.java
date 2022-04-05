package com.example.demo.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.example.demo.model.Account;

public interface AccountRepo extends JpaRepository<Account, Long> {	
	@Query("from Account order by id ASC")
	List <Account> findByIDSorted();	
	
	@Query(value="SELECT * from Account where id=?1",nativeQuery=true)
	List<Account> findByviewdataIDSorted(int id);
	
	@Modifying
	@Query(value="DELETE from Account where id=?1",nativeQuery=true)
	@Transactional
	void deleteByviewdataID(int id);
}
