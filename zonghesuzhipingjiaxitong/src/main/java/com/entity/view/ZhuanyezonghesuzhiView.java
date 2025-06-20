package com.entity.view;

import com.entity.ZhuanyezonghesuzhiEntity;
import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.io.Serializable;
import java.util.Date;

/**
 * 专业综合素质
 * 后端返回视图实体辅助类
 * （通常后端关联的表或者自定义的字段需要返回使用）
 */
@TableName("zhuanyezonghesuzhi")
public class ZhuanyezonghesuzhiView extends ZhuanyezonghesuzhiEntity implements Serializable {
    private static final long serialVersionUID = 1L;

		/**
		* 专业的值
		*/
		private String zhuanyeValue;



	public ZhuanyezonghesuzhiView() {

	}

	public ZhuanyezonghesuzhiView(ZhuanyezonghesuzhiEntity zhuanyezonghesuzhiEntity) {
		try {
			BeanUtils.copyProperties(this, zhuanyezonghesuzhiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}



			/**
			* 获取： 专业的值
			*/
			public String getZhuanyeValue() {
				return zhuanyeValue;
			}
			/**
			* 设置： 专业的值
			*/
			public void setZhuanyeValue(String zhuanyeValue) {
				this.zhuanyeValue = zhuanyeValue;
			}











}
