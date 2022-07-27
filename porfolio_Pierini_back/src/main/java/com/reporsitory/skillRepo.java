package com.reporsitory;

import com.models.skills;
import org.springframework.data.jpa.repository.JpaRepository;

public interface skillRepo extends JpaRepository<skills,Long> {
}
