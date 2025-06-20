package com.entity.model;

import com.entity.ZhuanyezonghesuzhiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;


/**
 * 专业综合素质
 * 接收传参的实体类
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了）
 * 取自ModelAndView 的model名称
 */
public class ZhuanyezonghesuzhiModel implements Serializable {
    private static final long serialVersionUID = 1L;




    /**
     * 主键
     */
    private Integer id;


    /**
     * 专业
     */
    private Integer zhuanyeTypes;


    /**
     * 思想道德水平平均分
     */
    private Double sixiangdaodePingjun;


    /**
     * 学业综合宿舍平均分
     */
    private Double xueyePingjun;


    /**
     * 身心健康平均分
     */
    private Double shenxinjiankangPingjun;


    /**
     * 艺术素养平均分
     */
    private Double yishusuyangPingjun;


    /**
     * 社会综合实践平均分
     */
    private Double shehuizongheshijianPingjun;


    /**
     * 备注
     */
    private String zhuanyezonghesuzhiContent;


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
	 * 获取：专业
	 */
    public Integer getZhuanyeTypes() {
        return zhuanyeTypes;
    }


    /**
	 * 设置：专业
	 */
    public void setZhuanyeTypes(Integer zhuanyeTypes) {
        this.zhuanyeTypes = zhuanyeTypes;
    }
    /**
	 * 获取：思想道德水平平均分
	 */
    public Double getSixiangdaodePingjun() {
        return sixiangdaodePingjun;
    }


    /**
	 * 设置：思想道德水平平均分
	 */
    public void setSixiangdaodePingjun(Double sixiangdaodePingjun) {
        this.sixiangdaodePingjun = sixiangdaodePingjun;
    }
    /**
	 * 获取：学业综合宿舍平均分
	 */
    public Double getXueyePingjun() {
        return xueyePingjun;
    }


    /**
	 * 设置：学业综合宿舍平均分
	 */
    public void setXueyePingjun(Double xueyePingjun) {
        this.xueyePingjun = xueyePingjun;
    }
    /**
	 * 获取：身心健康平均分
	 */
    public Double getShenxinjiankangPingjun() {
        return shenxinjiankangPingjun;
    }


    /**
	 * 设置：身心健康平均分
	 */
    public void setShenxinjiankangPingjun(Double shenxinjiankangPingjun) {
        this.shenxinjiankangPingjun = shenxinjiankangPingjun;
    }
    /**
	 * 获取：艺术素养平均分
	 */
    public Double getYishusuyangPingjun() {
        return yishusuyangPingjun;
    }


    /**
	 * 设置：艺术素养平均分
	 */
    public void setYishusuyangPingjun(Double yishusuyangPingjun) {
        this.yishusuyangPingjun = yishusuyangPingjun;
    }
    /**
	 * 获取：社会综合实践平均分
	 */
    public Double getShehuizongheshijianPingjun() {
        return shehuizongheshijianPingjun;
    }


    /**
	 * 设置：社会综合实践平均分
	 */
    public void setShehuizongheshijianPingjun(Double shehuizongheshijianPingjun) {
        this.shehuizongheshijianPingjun = shehuizongheshijianPingjun;
    }
    /**
	 * 获取：备注
	 */
    public String getZhuanyezonghesuzhiContent() {
        return zhuanyezonghesuzhiContent;
    }


    /**
	 * 设置：备注
	 */
    public void setZhuanyezonghesuzhiContent(String zhuanyezonghesuzhiContent) {
        this.zhuanyezonghesuzhiContent = zhuanyezonghesuzhiContent;
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
