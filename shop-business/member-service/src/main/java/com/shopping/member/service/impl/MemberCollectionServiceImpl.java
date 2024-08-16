package com.shopping.member.service.impl;

import com.shopping.member.entity.MemberCollection;
import com.shopping.member.dao.MemberCollectionDao;
import com.shopping.member.service.MemberCollectionService;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageImpl;
import org.springframework.data.domain.PageRequest;

import javax.annotation.Resource;

/**
 * (MemberCollection)表服务实现类
 *
 * @author makejava
 * @since 2024-08-16 23:19:28
 */
@Service("memberCollectionService")
public class MemberCollectionServiceImpl implements MemberCollectionService {
    @Resource
    private MemberCollectionDao memberCollectionDao;

}
