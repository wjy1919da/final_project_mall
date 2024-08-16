package com.shopping.member.service.impl;

import com.shopping.member.entity.MemberAddr;
import com.shopping.member.dao.MemberAddrDao;
import com.shopping.member.service.MemberAddrService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * 用户配送地址(MemberAddr)表服务实现类
 *
 * @author makejava
 * @since 2024-08-16 23:19:28
 */
@Service("memberAddrService")
public class MemberAddrServiceImpl implements MemberAddrService {
    @Resource
    private MemberAddrDao memberAddrDao;


}
