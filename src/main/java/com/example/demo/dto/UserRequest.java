package com.example.demo.dto;
import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
/**
 * ���[�U�[��� ���N�G�X�g�f�[�^
 */
@Data
public class UserRequest implements Serializable {


	  @NotEmpty(message = "���O����͂��Ă�������")
    private String name;
	  @NotEmpty(message = "�Z������͂��Ă�������")
    private String address;
	  @NotEmpty(message = "�d�b����͂��Ă�������")
    private String phone;
	  @NotEmpty(message = "�p�X���[�h����͂��Ă�������")
    private String password;
	  @DateTimeFormat(pattern = "yyyy/MM/dd")

	
    private Date birthday;


    private Long id;

	}

