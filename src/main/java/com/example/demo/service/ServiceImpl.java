package com.example.demo.service;

import com.example.demo.mapper.Mapper;
import com.example.demo.member.MemberDTO;
import lombok.RequiredArgsConstructor;

import java.util.List;

@org.springframework.stereotype.Service
@RequiredArgsConstructor
public class ServiceImpl implements Service{

    private final Mapper mapper;

    @Override
    public List<MemberDTO> getMemberList() {
        return mapper.getMemberList();
    }
}
