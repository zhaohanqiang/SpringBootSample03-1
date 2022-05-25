package com.example.demo.entity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.example.demo.dto.EmpRequest2;

import lombok.Data;

/**
 * ���[�U�[��� Entity
 */
@Entity
@Data
@Table(name = "userrr")
public class department1 implements Serializable {
  /**
   * ID
   */
  @Id
  @Column(name = "id1")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id1;
  /**
   * ���O
   */
  @Column(name = "name")
  private String name;
  /**
   * �Z��
   */
  @Column(name = "address")
  private String address;
  /**
   * �d�b�ԍ�
   */
  @Column(name = "guest")
  private String guest;
  /**
   * �X�V����
   */
  @Column(name = "sales")
  private String sales;

  @Column(name = "day")
  private String day;
  @Column(name = "state")
  private int state;
  @Column(name = "sid")
  private Long sid;




}

