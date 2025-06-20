package com.entity;

import com.baomidou.mybatisplus.annotations.TableId;
import com.baomidou.mybatisplus.annotations.TableName;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;
import com.fasterxml.jackson.annotation.JsonFormat;
import org.apache.commons.beanutils.BeanUtils;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.enums.FieldFill;
import com.baomidou.mybatisplus.enums.IdType;

/**
 * 个人综合素质
 *
 * @author 
 * @email
 */
@TableName("gerenzonghesuzhi")
public class GerenzonghesuzhiEntity<T> implements Serializable {
    private static final long serialVersionUID = 1L;


	public GerenzonghesuzhiEntity() {

	}

	public GerenzonghesuzhiEntity(T t) {
		try {
			BeanUtils.copyProperties(this, t);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}


    /**
     * 主键
     */
    @TableId(type = IdType.AUTO)
    @TableField(value = "id")

    private Integer id;


    /**
     * 学生
     */
    @TableField(value = "xuesheng_id")

    private Integer xueshengId;


    /**
     * 思想道德水平
     */
    @TableField(value = "sixiangdaode")

    private Double sixiangdaode;


    /**
     * 学业综合宿舍
     */
    @TableField(value = "xueye")

    private Double xueye;


    /**
     * 身心健康
     */
    @TableField(value = "shenxinjiankang")

    private Double shenxinjiankang;


    /**
     * 艺术素养
     */
    @TableField(value = "yishusuyang")

    private Double yishusuyang;


    /**
     * 社会综合实践
     */
    @TableField(value = "shehuizongheshijian")

    private Double shehuizongheshijian;


    /**
     * 备注
     */
    @TableField(value = "gerenzonghesuzhi_content")

    private String gerenzonghesuzhiContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "insert_time",fill = FieldFill.INSERT)

    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    @TableField(value = "create_time",fill = FieldFill.INSERT)

    private Date createTime;


    /**
	 * 设置：主键
	 */
    public Integer getId() {
        return id;
    }
    /**
	 * 获取：主键
	 */

    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 设置：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }
    /**
	 * 获取：学生
	 */

    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 设置：思想道德水平
	 */
    public Double getSixiangdaode() {
        return sixiangdaode;
    }
    /**
	 * 获取：思想道德水平
	 */

    public void setSixiangdaode(Double sixiangdaode) {
        this.sixiangdaode = sixiangdaode;
    }
    /**
	 * 设置：学业综合宿舍
	 */
    public Double getXueye() {
        return xueye;
    }
    /**
	 * 获取：学业综合宿舍
	 */

    public void setXueye(Double xueye) {
        this.xueye = xueye;
    }
    /**
	 * 设置：身心健康
	 */
    public Double getShenxinjiankang() {
        return shenxinjiankang;
    }
    /**
	 * 获取：身心健康
	 */

    public void setShenxinjiankang(Double shenxinjiankang) {
        this.shenxinjiankang = shenxinjiankang;
    }
    /**
	 * 设置：艺术素养
	 */
    public Double getYishusuyang() {
        return yishusuyang;
    }
    /**
	 * 获取：艺术素养
	 */

    public void setYishusuyang(Double yishusuyang) {
        this.yishusuyang = yishusuyang;
    }
    /**
	 * 设置：社会综合实践
	 */
    public Double getShehuizongheshijian() {
        return shehuizongheshijian;
    }
    /**
	 * 获取：社会综合实践
	 */

    public void setShehuizongheshijian(Double shehuizongheshijian) {
        this.shehuizongheshijian = shehuizongheshijian;
    }
    /**
	 * 设置：备注
	 */
    public String getGerenzonghesuzhiContent() {
        return gerenzonghesuzhiContent;
    }
    /**
	 * 获取：备注
	 */

    public void setGerenzonghesuzhiContent(String gerenzonghesuzhiContent) {
        this.gerenzonghesuzhiContent = gerenzonghesuzhiContent;
    }
    /**
	 * 设置：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }
    /**
	 * 获取：录入时间
	 */

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 设置：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }
    /**
	 * 获取：创建时间
	 */

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Gerenzonghesuzhi{" +
            "id=" + id +
            ", xueshengId=" + xueshengId +
            ", sixiangdaode=" + sixiangdaode +
            ", xueye=" + xueye +
            ", shenxinjiankang=" + shenxinjiankang +
            ", yishusuyang=" + yishusuyang +
            ", shehuizongheshijian=" + shehuizongheshijian +
            ", gerenzonghesuzhiContent=" + gerenzonghesuzhiContent +
            ", insertTime=" + insertTime +
            ", createTime=" + createTime +
        "}";
    }
}
