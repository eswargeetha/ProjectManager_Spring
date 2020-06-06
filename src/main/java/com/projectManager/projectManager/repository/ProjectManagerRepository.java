/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Jul 3, 2019
 */

package com.projectManager.projectManager.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectManager.projectManager.domain.User;

/**
 * @author Geetha Eswaran
 *
 */
@Repository
public interface ProjectManagerRepository extends JpaRepository<User, Long> {
	
	List<User> findByMgrInd(boolean manager);
	
}
