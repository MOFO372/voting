package com.libertymutual.goforcode.voting.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.libertymutual.goforcode.voting.models.Project;

@Repository
public interface UserRepo extends JpaRepository<Project, Long> {

}
