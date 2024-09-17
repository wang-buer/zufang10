package com.dao;

import com.entity.MeishiLiuyanEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.MeishiLiuyanView;

/**
 * 美食留言 Dao 接口
 *
 * @author 
 * @since 2021-04-19
 */
public interface MeishiLiuyanDao extends BaseMapper<MeishiLiuyanEntity> {

   List<MeishiLiuyanView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
