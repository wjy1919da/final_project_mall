package com.shopping.member.test;

import cn.hutool.core.util.ObjectUtil;
import com.alibaba.fastjson.JSON;
import com.fhs.jpa.wrapper.LambdaQueryWrapper;
import com.shopping.member.dao.MemberDao;
import com.shopping.member.entity.Member;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;

import java.util.List;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class MemberServiceTest {

    @Autowired
    private MemberDao memberDao;
    @Test
    public void testFindAll_Paging(){
        System.out.println("aaaaaaaaaaaaaaa");

        int current = 0 ;
        int size =10 ;
        Pageable page = PageRequest.of(current, size);
        // 多条件分页查询会员
        Integer status = null ;
        String nickName = null ;
        Page<Member> pageList =  memberDao.findAll(new LambdaQueryWrapper<Member>()
                .eq(ObjectUtil.isNotNull(status), Member::getStatus, status)
                .like(StringUtils.hasText(nickName), Member::getNickName, nickName)
                .orderByDesc(Member::getCreateTime)
                .build(),page);

        List<Member>  memberList = pageList.getContent();
        System.out.println(""+ JSON.toJSONString(memberList));

    }
}
