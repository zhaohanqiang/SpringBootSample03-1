package com.example.demo.service;
import java.sql.Date;
import java.util.List;



import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.EmpRequest2;

import com.example.demo.entity.department1;
import com.example.demo.repository.Repository2;
/**
 * ユーザー情報 Service
 */
@Service
public class Service2 {
  /**
   * ユーザー情報 Repository
   */
  @Autowired
  Repository2 Repository2;
  /**
   * ユーザー情報 全検索
 * @param id
   * @return 検索結果
   */

  public department1 findById(Long id1) {

      return Repository2.findById(id1).get();

  }



  public List<department1> searchAll(Long id1) {
	    return Repository2.findByDepartmentNameRaw(id1);
	  }


  public void update1(EmpRequest2 EmpRequest2) {
	  department1 department1 = findById(EmpRequest2.getId1());
	  department1. setId1(EmpRequest2. getId1());
	  department1. setName(EmpRequest2. getName());
	  department1. setAddress(EmpRequest2. getAddress());
	  department1.setGuest(EmpRequest2. getGuest());
	  department1. setSales(EmpRequest2. getSales());
	  department1. setDay(EmpRequest2. getDay());
	  department1. setSid(EmpRequest2. getSid());
     Repository2.save(department1);

  }

  public void delete(EmpRequest2 EmpRequest2) {
	   department1 department1 =  findById(EmpRequest2.getId1());
	   department1.setId1(EmpRequest2.getId1());
	   department1.setState(1);
	   Repository2.save(department1);
	    }

public List<department1> searchAll1(Long id1) {
    return Repository2.findzaizhi(id1);
  }
public List<department1> searchAll4(Long id1) {
    return Repository2.findzaizhi1(id1);
  }
public List<department1> searchAll2(Long id1) {
    return Repository2.findtuizhi(id1);
  }


//
//public void  Createemp2(EmpRequest3 empRequest3) {
//
//	for (int i = 0; i < empRequest3.getSid().length; i++) {
//		department1 department1 = new department1();
//		department1.setName(empRequest3.getName()[i]);
//		department1.setAddress(empRequest3.getAddress()[i]);
//		department1.setGuest(empRequest3.getGuest()[i]);
//		department1.setSales(empRequest3.getSales()[i]);
//		  department1. setSid(empRequest3. getSid()[i]);
//		   department1.setState(2);
//		   Repository2.save(department1);
//	}
//
//	}
//
//public void   Createemp0(EmpRequest3 empRequest3) {
//
//	Repository2.shanchu(empRequest3);
//	for (int i = 0; i < empRequest3.getSid().length; i++) {
//
//		department1 department1 = new department1();
//			department1.setName(empRequest3.getName()[i]);
//			department1.setAddress(empRequest3.getAddress()[i]);
//			department1.setGuest(empRequest3.getGuest()[i]);
//			department1.setSales(empRequest3.getSales()[i]);
//			  department1. setSid(empRequest3. getSid()[i]);
//			   department1.setState(0);
//			   Repository2.save(department1);
//		}
//
//;
//	}

	public List<department1> searchAll3(Long id1) {
	    return Repository2.department1(id1);
	  }


public void empshanchu() {
	EmpRequest2 sa= new EmpRequest2();
 Repository2.shanchu(sa);
}





public void create(EmpRequest2 empRequest2) {
   Repository2.save(Createemp(empRequest2));
}

private department1 Createemp(EmpRequest2 empRequest2) {
	department1 emp = new department1();
	emp.setName(empRequest2.getName());
	emp.setAddress(empRequest2.getAddress());
	emp.setGuest(empRequest2.getGuest());
	emp.setSales(empRequest2.getSales());
	emp. setSid(empRequest2. getSid());
	emp.setState(0);

    return emp;
}


public void baocun(EmpRequest2 empRequest2) {
    Repository2.save(Empbaocun(empRequest2));
}
    private department1 Empbaocun(EmpRequest2 empRequest2) {

		department1 emp = new department1();
		emp.setName(empRequest2.getName());
		emp.setAddress(empRequest2.getAddress());
		emp.setGuest(empRequest2.getGuest());
		emp.setSales(empRequest2.getSales());
		emp. setSid(empRequest2. getSid());
		emp.setState(2);

	    return emp;
}
}







