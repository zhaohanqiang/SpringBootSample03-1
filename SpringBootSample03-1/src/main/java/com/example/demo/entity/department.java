package com.example.demo.entity;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import lombok.Data;
/**
 * ���[�U�[��� Entity
 */
@Entity
@Data
@Table(name = "use1")
public class department implements Serializable {
  /**
   * ID
   */
  @Id
  @Column(name = "id")
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  /**
   * ���O
   */
  @Column(name = "Coursename")
  private String Coursename;
  /**
   * �Z��
   */
  @Column(name = "Totalnumberofpeople")
  private int Totalnumberofpeople;

  @Column(name = "average")
  private int average;
  /**
   * �X�V����
   */
}


