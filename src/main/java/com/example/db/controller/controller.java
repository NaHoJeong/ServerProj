// controller 부분
// 서버를 실행하면 application.java 파일 실행 후 url 명령어(?)에 따라 controller 실행

package com.example.db.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.db.dto.user;
import com.example.db.service.service;

@RestController
public class controller {
   @Autowired
   service sv;
   
   // url 후 /getAll을 입력하면 실행되는 부분 
   @RequestMapping("/getAll")
   public void getAll() throws Exception
   {
      List<user> listuser = new ArrayList<>();
      try
      {
         listuser = sv.getAll(); // service.java의 getAll 함수 실행
         System.out.println(listuser);
      } catch (Exception e)
      {
         //
      }
   }
}
