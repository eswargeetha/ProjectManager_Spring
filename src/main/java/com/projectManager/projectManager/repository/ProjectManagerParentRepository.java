/*
 * Copyright (C) 2019, Liberty Mutual Group
 *
 * Created on Jul 3, 2019
 */

package com.projectManager.projectManager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projectManager.projectManager.domain.Parent;

/**
 * @author Geetha Eswaran
 *
 */
@Repository
public interface ProjectManagerParentRepository extends JpaRepository<Parent, Long> {

	
}
