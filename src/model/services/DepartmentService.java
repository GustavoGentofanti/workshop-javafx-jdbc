package model.services;

import java.util.ArrayList;
import java.util.List;

import model.entities.Department;

public class DepartmentService {
	
	public List<Department> findAll(){
		List<Department> list = new ArrayList<Department>();
		list.add(new Department(1, "Foods"));
		list.add(new Department(2, "Sports"));
		list.add(new Department(3, "Books"));
		list.add(new Department(4, "Computer"));
		return list;
	}

}
