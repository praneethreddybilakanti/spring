package com.praneeth;

import java.util.List;

public class EmpserviceImp implements EmplService {
private EmpDaoImpl i;
 public EmpserviceImp(EmpDaoImpl i) 
 {
	 this.i=i;
	// TODO Auto-generated constructor stub
}
	@Override
	public int update(Employee e) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int insert(Employee e) {
 int q=i.insert(e);		
		return q;
	}

	@Override
	public List getAllEmplyees() {
		// TODO Auto-generated method stub
		return null;
	}

}
