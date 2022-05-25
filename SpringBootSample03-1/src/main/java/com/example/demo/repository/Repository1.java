package com.example.demo.repository;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import com.example.demo.entity.department;

/**
 * ユーザー情報 Repository
 */
@Repository
public interface Repository1 extends JpaRepository<department, Long> {



@Query(value="select count(a.id1) as average,a.name,a.address,sum(a.guest) as Totalnumberofpeople,a.sales,a.day,a.state,a.sid,b.id,b.Coursename,b.Totalnumberofpeople,b.average"

		   + " from sampledb.userrr a "
		   + " left join sampledb.use1 b on a.sid = b.id "
		   + "where a.state=0   GROUP BY b.id ORDER BY b.id ",nativeQuery=true)
		 List<department> finddepAll(Long id);

}


