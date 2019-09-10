package org.saheb.repository;

import java.util.List;

import org.saheb.beans.Emp;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EmpRepository extends CrudRepository<Emp, Integer> {
	List<Emp> findByDeptNo(int deptno);
}
