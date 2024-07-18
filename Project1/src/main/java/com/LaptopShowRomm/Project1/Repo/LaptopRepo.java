package com.LaptopShowRomm.Project1.Repo;

import com.LaptopShowRomm.Project1.Entity.LaptopEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface LaptopRepo extends JpaRepository<LaptopEntity,Integer> {

}

