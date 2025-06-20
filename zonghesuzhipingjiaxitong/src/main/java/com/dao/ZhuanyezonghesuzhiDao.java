package com.dao;

import com.entity.ZhuanyezonghesuzhiEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.entity.view.ZhuanyezonghesuzhiView;

/**
 * 专业综合素质 Dao 接口
 *
 * @author 
 */
public interface ZhuanyezonghesuzhiDao extends BaseMapper<ZhuanyezonghesuzhiEntity> {

   List<ZhuanyezonghesuzhiView> selectListView(Pagination page,@Param("params")Map<String,Object> params);

}
