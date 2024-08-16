package com.shopping.member.dao;

import com.shopping.member.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户表(Member)表数据库访问层
 *
 * @author makejava
 * @since 2024-08-16 23:19:02
 */
@Repository
public interface MemberDao extends JpaRepository<Member, Long>, JpaSpecificationExecutor<Member> {

}

