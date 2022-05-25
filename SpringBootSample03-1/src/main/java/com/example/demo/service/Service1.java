package com.example.demo.service;
import java.util.List;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.department;
import com.example.demo.entity.department1;
import com.example.demo.repository.Repository1;
/**
 * ユーザー情報 Service
 */
@Service
public class Service1 {
  /**
   * ユーザー情報 Repository
   */
  @Autowired
  private Repository1 Repository1;

  /**
   * ユーザー情報 全検索
   * @return 検索結果
   */
  public List<department> searchAll() {
    return Repository1.findAll();
  }
  public department findById(Long id,String Coursename) {

      return Repository1.findById(id).get();

    }
  public List<department> searchAll4(Long id) {

	    return Repository1.finddepAll(id);
	  }
}