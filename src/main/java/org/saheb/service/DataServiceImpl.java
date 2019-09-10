package org.saheb.service;

import java.util.ArrayList;
import java.util.List;

import org.saheb.beans.Emp;
import org.saheb.repository.DeptRepository;
import org.saheb.repository.EmpRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class DataServiceImpl implements DataService {
	@Autowired
	private DeptRepository deptRepository;
	@Autowired
	private EmpRepository empRepository;

	@Override
	public List<String> getAllTeamPlayers(int deptNo) {
		List<String> result = new ArrayList<String>();
		List<Emp> employees = empRepository.findByDeptNo(deptNo);
		for (Emp emp : employees) {
			System.out.println(emp.getEname());
			result.add(emp.getEname());
		}
		return result;
	}

}
