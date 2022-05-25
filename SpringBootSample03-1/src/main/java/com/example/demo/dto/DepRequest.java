package com.example.demo.dto;
import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Future;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

import lombok.Data;
/**
 * ���[�U�[��� ���N�G�X�g�f�[�^
 */
@Data
public class DepRequest implements Serializable {



	  private Long id;
	  private String Coursename;
	  private int Totalnumberofpeople;
	  private int average;



}