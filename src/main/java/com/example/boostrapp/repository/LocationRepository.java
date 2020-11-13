package com.example.boostrapp.repository;

import com.example.boostrapp.entity.Location;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

public interface LocationRepository extends CrudRepository<Location , Long> {
}
