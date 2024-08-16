package com.shopping.member.dao;

import com.shopping.member.entity.MemberAddr;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * 用户配送地址(MemberAddr)表数据库访问层
 *
 * @author makejava
 * @since 2024-08-16 23:19:28
 */
@Repository
public interface MemberAddrDao extends JpaRepository<MemberAddr, Long>, JpaSpecificationExecutor<MemberAddr> {

}

