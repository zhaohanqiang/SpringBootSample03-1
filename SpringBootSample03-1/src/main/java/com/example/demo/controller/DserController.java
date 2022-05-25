package com.example.demo.controller;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.repository.Repository2;


import com.example.demo.dto.EmpRequest2;
import com.example.demo.dto.UserRequest;
import com.example.demo.entity.User;

import com.example.demo.entity.department;
import com.example.demo.entity.department1;
import com.example.demo.service.Service1;
import com.example.demo.service.Service2;


import lombok.Data;

/**
 * ユーザー情報 Controller
 */
@Data
@Controller
public class DserController {


  private Service1 Service1;

  public Service2 Service2;

  private final Repository2 Repository2;


  @Autowired
  public DserController(Service2 Service2, Repository2
          Repository2, Service1 Service1 ) {
      this.Service2 = Service2;
      this.Repository2 = Repository2;
      this.Service1=Service1;

  }





  /**
   * ユーザー情報一覧画面を表示
   * @param model ModelS
   * @return ユーザー情報一覧画面
   */
  @GetMapping(value = "/department/departmentlist")
  public String displayList1(department1 department1,department department,Long id,Model model) {
System.out.print("222");
    List<department> dt = Service1.searchAll4(id);
    model.addAttribute("dt", dt);
    return "department/departmentlist";
  }






  @GetMapping("/department/{id}")
  public String dist(@PathVariable Long id,String Coursename, EmpRequest2 a,department1 b,Model model) {
	  List<department1> dilist = Service2.searchAll(id);
	  List<department1> dzaizhi = Service2.searchAll1(id);
	  List<department1> dtuizhi = Service2.searchAll2(id);

	  department depname=Service1.findById(id,Coursename);
	   model.addAttribute("dilist", dilist);

	   model.addAttribute("dzaizhi", dzaizhi);
	   model.addAttribute("dtuizhi", dtuizhi);
	   model.addAttribute("depname", depname.getCoursename());
	   model.addAttribute("a", a);


	   return "/department/departmentview";
  }

@GetMapping("/department1/{id1}")
public String displayView(@PathVariable Long id1, EmpRequest2 EmpRequest2,Model model) {
  department1 department1 = Service2.findById(id1);

  model.addAttribute("EmpRequest2", department1);

  return "department/vieww";
    }

@RequestMapping(value = "/department/departmentview", method = RequestMethod.POST)
public String update( @ModelAttribute department1 department1, EmpRequest2 EmpRequest2,  Model model) {

Service2.update1(EmpRequest2);
Long we=department1.getSid();
String url1="redirect: "+we;
return url1;


}


@RequestMapping("/department/{id1}")
public String delete(@PathVariable("id1") Long id1,RedirectAttributes attr) {
	EmpRequest2 EmpRequest2 = new EmpRequest2();
	department1 department1 = Service2.findById(id1);

	EmpRequest2.setId1(department1.getId1());
	EmpRequest2.setSid(department1.getSid());
	Service2.delete(EmpRequest2);
  Long id=department1.getSid();
  String url111="redirect: "+id;
  return url111 ;
}
@GetMapping(value = "/bumen/bumeng")
public String displaysList(@ModelAttribute EmpRequest2 EmpRequest2, department1 department1,Long id1,Model model) {

  List<department1> department11= Service2.searchAll3(id1);


  model.addAttribute("department11", department11);
  return "/bumen/bumeng";
}

//保存
//@RequestMapping(value = "/bumen/bumeng", method = RequestMethod.POST)
//public String create( @ModelAttribute
//		department1 department1,	EmpRequest3 EmpRequest3,  Model model) {
//
//	Service2.Createemp2(EmpRequest3);
//
//
//	 return "redirect:/bumen/bumeng";
//}
//
//
////确定
//@RequestMapping(value = "/bumen/create", method = RequestMethod.POST)
//public String create1( @ModelAttribute
//		department1 department1,EmpRequest3 EmpRequest3,  Model model) {
//
//	Service2.Createemp0(EmpRequest3);
//
//	return "redirect:/bumen/bumeng";
//}

@RequestMapping(value = "/bumen/create", method = RequestMethod.POST)

public String create( @ModelAttribute EmpRequest2 empRequest2,
		HttpServletRequest request, HttpServletResponse response,
	String[] ename,String[] eaddress,String[] eguest,
		String[] esales,Long[] esid,
		Model model) {


	 createemp(empRequest2, request, response,  ename, eaddress, eguest, esales, esid, model);
	Service2.empshanchu();
	return "redirect:/bumen/bumeng";
}
@ResponseBody
public String createemp(@Validated @ModelAttribute EmpRequest2 empRequest2,
		HttpServletRequest request, HttpServletResponse response,
		String[] ename,String[] eaddress,String[] eguest,
		String[] esales,Long[] esid,
		Model model) {

	List <EmpRequest2> emp = new ArrayList<EmpRequest2>();
	for(int i=0;i<esid.length;i++) {

		empRequest2.setName(ename[i]);
		empRequest2.setAddress(eaddress[i]);
		empRequest2.setGuest(eguest[i]);
		empRequest2.setSales(esales[i]);
		empRequest2.setSid(esid[i]);
		emp.add(empRequest2);
	Service2.create(empRequest2);
	}
	return "";
}

/*
保存
*/
@RequestMapping(value = "/bumen/bumeng", method = RequestMethod.POST)

public String baocun


		( @ModelAttribute EmpRequest2 empRequest2,

			String[] ename,String[] eaddress,String[] eguest,
				String[] esales,Long[] esid,
				Model model) {
HttpServletRequest requesta = null;
HttpServletResponse response= null;
	 empbaocun(empRequest2, requesta, response,  ename, eaddress, eguest, esales, esid, model);

	return "redirect:/bumen/bumeng";
}
@ResponseBody
public String empbaocun(@Validated @ModelAttribute EmpRequest2 empRequest2,
		HttpServletRequest request, HttpServletResponse response,
		String[] ename,String[] eaddress,String[] eguest,
		String[] esales,Long[] esid,
		Model model) {
	Service2.empshanchu();
	List <EmpRequest2> emp = new ArrayList<EmpRequest2>();
	for(int i=0;i<esid.length;i++) {

		empRequest2.setName(ename[i]);
		empRequest2.setAddress(eaddress[i]);
		empRequest2.setGuest(eguest[i]);
		empRequest2.setSales(esales[i]);
		empRequest2.setSid(esid[i]);
		emp.add(empRequest2);
	Service2.baocun(empRequest2);
	}
	return "";
}
}










