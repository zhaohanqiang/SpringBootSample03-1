package com.example.demo.dto;
import java.io.Serializable;
import java.util.Date;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotEmpty;
import org.springframework.format.annotation.DateTimeFormat;

import lombok.Data;
/**
 * ユーザー情報 リクエストデータ
 */
@Data
public class UserRequest implements Serializable {


	  @NotEmpty(message = "名前を入力してください")
    private String name;
	  @NotEmpty(message = "住所を入力してください")
    private String address;
	  @NotEmpty(message = "電話を入力してください")
    private String phone;
	  @NotEmpty(message = "パスワードを入力してください")
    private String password;
	  @DateTimeFormat(pattern = "yyyy/MM/dd")

	
    private Date birthday;


    private Long id;

	}

