package com.example.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.demo.vo.ResponseVO;
import com.example.demo.vo.*;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
@RequestMapping("/")
public class UserController {

    
    List<UserVO> list = new ArrayList<>();
    //list.add(new UserVO("테스트","010-2222-4444"));
    //list.add(new UserVO("SBH","010-2323-1368"));

    //---------- about -------------------
    @RequestMapping(value="/api/users", method=RequestMethod.GET)
    public ResponseVO<?> getUsers(){
        ResponseVO<List<UserVO>> resp = new ResponseVO<>();
        
        resp.setResponse(list);
        return resp;
    }

    //상세보기
    @RequestMapping(value="/api/users/{id}", method=RequestMethod.GET)
    public ResponseVO<?> getUser(@PathVariable int id) {
        ResponseVO<UserVO> resp = new ResponseVO<>();


        resp.setResponse(list.get(id));
        return resp;
    }

    //연락처 입력
    @RequestMapping(value="/api/users", method=RequestMethod.POST)
    public void addNewUser(@RequestBody UserVO user) {
        System.out.println(user.getName()+" : "+user.getPhone());

        list.add(new UserVO(user.getName(),user.getPhone()));
    }
}