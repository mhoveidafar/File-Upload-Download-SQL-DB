package com.mhoveidafar.filedb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.mhoveidafar.filedb.entity.DBFile;

@Repository
public interface IDBFileDAO extends JpaRepository<DBFile, String> {
	
}
