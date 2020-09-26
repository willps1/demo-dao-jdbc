package application;

import java.util.List;

import model.dao.DaoFactory;
import model.dao.DepartmentDao;
import model.entities.Department;

public class Program2 {

	public static void main(String[] args) {

		DepartmentDao departmentDao = DaoFactory.createDepartmentDao();
		
		
		System.out.println("====Depatment findById=====");
		Department department = departmentDao.findById(2);
		System.out.println(department);
		
		System.out.println("====Depatment findAll=====");
		List<Department> list = departmentDao.findAll();
		for(Department obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("====Depatment INSERRT=====");
		Department newDepartment = new Department(null, "Music");
		departmentDao.insert(newDepartment);
		System.out.println("Inserted! new id: " + newDepartment.getId());
	}

}
