package com.shopping.member.controller;

import cn.hutool.core.util.ObjectUtil;
import com.fhs.jpa.wrapper.LambdaQueryWrapper;
import com.shopping.member.dao.MemberDao;
import com.shopping.member.entity.Member;
import com.shopping.member.model.Result;
import com.shopping.member.service.MemberService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping("admin/member")
@RestController
@RequiredArgsConstructor
public class SysMemberController {

    @Autowired
    private MemberDao memberDao;

    @GetMapping("page")
    public Result<Page<Member>> loadMemberPage(Integer current, Integer size,
                                               @RequestParam(required = false) String nickName,
                                               @RequestParam(required = false) Integer status) {
        // 创建会员分页对象
        Pageable page = PageRequest.of(current, size);
        // 多条件分页查询会员

        Page<Member> pageList =  memberDao.findAll(new LambdaQueryWrapper<Member>()
                .eq(ObjectUtil.isNotNull(status), Member::getStatus, status)
                .like(StringUtils.hasText(nickName), Member::getNickName, nickName)
                .orderByDesc(Member::getCreateTime)
                .build(),page);

        return Result.success(pageList);
    }


}
