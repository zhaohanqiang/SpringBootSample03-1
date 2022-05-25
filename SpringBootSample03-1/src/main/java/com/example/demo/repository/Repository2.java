package com.example.demo.repository;
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.dto.EmpRequest2;

import com.example.demo.entity.department1;

/**
 * ユーザー情報 Repository
 */
@Repository
public interface Repository2 extends JpaRepository<department1, Long> {

	@Query(value="select a.id1,a.name,a.address,a.guest,a.sales,a.day,a.state,a.sid,b.id,b.Coursename,b.Totalnumberofpeople,b.average"
			   + " from sampledb.userrr a "
			   + " left join sampledb.use1 b on a.sid = b.id "
			   + " where  b.id = ?1", nativeQuery=true )

	List<department1> findByDepartmentNameRaw(Long id1);



@Query(value="select a.id1,a.name,a.address,a.guest,a.sales,a.day,a.state,a.sid,b.id,b.Coursename,b.Totalnumberofpeople,b.average"
		   + " from sampledb.userrr a "
		   + " left join sampledb.use1 b on a.sid = b.id "
		   + " where a.state=0 and b.id = ?1", nativeQuery=true )
List<department1> findzaizhi (Long id1);
@Query(value="select a.id1,a.name,a.address,a.guest,a.sales,a.day,a.state,a.sid,b.id,b.Coursename,b.Totalnumberofpeople,b.average"
		   + " from sampledb.userrr a "
		   + " left join sampledb.use1 b on a.sid = b.id "
		   + " where a.state=2 and b.id = ?1", nativeQuery=true )
List<department1> findzaizhi1 (Long id1);
@Query(value="select a.id1,a.name,a.address,a.guest,a.sales,a.day,a.state,a.sid,b.id,b.Coursename,b.Totalnumberofpeople,b.average"
		   + " from sampledb.userrr a "
		   + " left join sampledb.use1 b on a.sid = b.id "
  + " where a.state=1 and  b.id  = ?1", nativeQuery=true )

List<department1> findtuizhi (Long id1);


@Query(value="select id1,name,address,guest,sales,day,"
		+ "state,sid"
		+ " from sampledb.userrr "
		  + " where state=2", nativeQuery=true)

 List<department1> department1 (Long id1);

 @Transactional
	@Modifying
	@Query(value="delete from sampledb.userrr a where a.state=2", nativeQuery=true )



	public void shanchu (EmpRequest2 empRequest2);

 @Query(value="select sid "
			+ " from sampledb.userrr "
			+ " where state=2", nativeQuery=true )

	List<Long> finddepid (Long sid);








}



