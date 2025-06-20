package com.entity.model;

import com.entity.GerenzonghesuzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 个人综合素质
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class GerenzonghesuzhiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 学生
     */
    private Integer xueshengId;


    /**
     * 思想道德水平
     */
    private Double sixiangdaode;


    /**
     * 学业综合宿舍
     */
    private Double xueye;


    /**
     * 身心健康
     */
    private Double shenxinjiankang;


    /**
     * 艺术素养
     */
    private Double yishusuyang;


    /**
     * 社会综合实践
     */
    private Double shehuizongheshijian;


    /**
     * 备注
     */
    private String gerenzonghesuzhiContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat
    private Date createTime;


    /**
	 * 获取：主键
	 */
    public Integer getId() {
        return id;
    }


    /**
	 * 设置：主键
	 */
    public void setId(Integer id) {
        this.id = id;
    }
    /**
	 * 获取：学生
	 */
    public Integer getXueshengId() {
        return xueshengId;
    }


    /**
	 * 设置：学生
	 */
    public void setXueshengId(Integer xueshengId) {
        this.xueshengId = xueshengId;
    }
    /**
	 * 获取：思想道德水平
	 */
    public Double getSixiangdaode() {
        return sixiangdaode;
    }


    /**
	 * 设置：思想道德水平
	 */
    public void setSixiangdaode(Double sixiangdaode) {
        this.sixiangdaode = sixiangdaode;
    }
    /**
	 * 获取：学业综合宿舍
	 */
    public Double getXueye() {
        return xueye;
    }


    /**
	 * 设置：学业综合宿舍
	 */
    public void setXueye(Double xueye) {
        this.xueye = xueye;
    }
    /**
	 * 获取：身心健康
	 */
    public Double getShenxinjiankang() {
        return shenxinjiankang;
    }


    /**
	 * 设置：身心健康
	 */
    public void setShenxinjiankang(Double shenxinjiankang) {
        this.shenxinjiankang = shenxinjiankang;
    }
    /**
	 * 获取：艺术素养
	 */
    public Double getYishusuyang() {
        return yishusuyang;
    }


    /**
	 * 设置：艺术素养
	 */
    public void setYishusuyang(Double yishusuyang) {
        this.yishusuyang = yishusuyang;
    }
    /**
	 * 获取：社会综合实践
	 */
    public Double getShehuizongheshijian() {
        return shehuizongheshijian;
    }


    /**
	 * 设置：社会综合实践
	 */
    public void setShehuizongheshijian(Double shehuizongheshijian) {
        this.shehuizongheshijian = shehuizongheshijian;
    }
    /**
	 * 获取：备注
	 */
    public String getGerenzonghesuzhiContent() {
        return gerenzonghesuzhiContent;
    }


    /**
	 * 设置：备注
	 */
    public void setGerenzonghesuzhiContent(String gerenzonghesuzhiContent) {
        this.gerenzonghesuzhiContent = gerenzonghesuzhiContent;
    }
    /**
	 * 获取：录入时间
	 */
    public Date getInsertTime() {
        return insertTime;
    }


    /**
	 * 设置：录入时间
	 */
    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }
    /**
	 * 获取：创建时间
	 */
    public Date getCreateTime() {
        return createTime;
    }


    /**
	 * 设置：创建时间
	 */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    }
