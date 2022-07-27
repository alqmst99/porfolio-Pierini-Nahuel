package com.reporsitory;

import com.models.education;
import org.springframework.data.jpa.repository.JpaRepository;

public interface educationRepo extends JpaRepository <education, Long> {
}
