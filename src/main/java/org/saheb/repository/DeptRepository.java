package org.saheb.repository;

import org.saheb.beans.Dept;
import org.springframework.data.repository.CrudRepository;

public interface DeptRepository extends CrudRepository<Dept, Integer> {
	Dept findByEmployees(Integer empno);
}
