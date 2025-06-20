package com.dao;

import com.entity.GerenzonghesuzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.GerenzonghesuzhiView;

/**
 * 个人综合素质 Dao 接口
 *
 * @author 
 */
public interface GerenzonghesuzhiDao extends BaseMapper<GerenzonghesuzhiEntity> {

   List<GerenzonghesuzhiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
