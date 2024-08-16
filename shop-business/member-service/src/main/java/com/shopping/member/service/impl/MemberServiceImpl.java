package com.shopping.member.service.impl;

import com.shopping.member.entity.Member;
import com.shopping.member.dao.MemberDao;
import com.shopping.member.service.MemberService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 用户表(Member)表服务实现类
 *
 * @author makejava
 * @since 2024-08-16 23:19:25
 */
@Service("memberService")
public class MemberServiceImpl implements MemberService {
    @Resource
    private MemberDao memberDao;

}
