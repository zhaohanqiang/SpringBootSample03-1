package com.example.demo.dto;
import java.io.Serializable;


import org.springframework.format.annotation.DateTimeFormat;

import com.sun.istack.NotNull;

import lombok.Data;

@Data
public class EmpRequest2  implements Serializable {



	  private Long  id1;
	  private String name;
	  private String address;
	  private String guest;
	  private String sales;
	  private String day;
	  private int state;
	  private Long sid;


}




