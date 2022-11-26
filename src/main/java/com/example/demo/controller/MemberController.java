package com.example.demo.controller;

import com.example.demo.member.MemberDTO;
import com.example.demo.service.Service;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final Service service;

    @RequestMapping(value = "/member", method = RequestMethod.GET)
    public List<MemberDTO> getMember() {
        return service.getMemberList();
    }
}
