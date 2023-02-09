package com.api2.api2.Repository;

import com.api2.api2.Models.BranchName;
import com.api2.api2.Models.HOD;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

public interface HodRepository extends JpaRepository<HOD,Integer> {
    public HOD findByBranch(String branch);
}
