package com.shopping.member.dao;


import com.shopping.member.entity.MemberCollection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * (MemberCollection)表数据库访问层
 *
 * @author makejava
 * @since 2024-08-16 23:19:28
 */
@Repository
public interface MemberCollectionDao extends JpaRepository<MemberCollection, Long>, JpaSpecificationExecutor<MemberCollection> {

}

