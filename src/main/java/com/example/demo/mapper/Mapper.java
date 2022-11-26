package com.example.demo.mapper;


import com.example.demo.member.MemberDTO;

import java.util.List;

@org.apache.ibatis.annotations.Mapper
public interface Mapper {

    List<MemberDTO> getMemberList();
}
