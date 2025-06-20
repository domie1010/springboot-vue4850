package com.entity.vo;

import com.entity.ZhuanyezonghesuzhiEntity;
import com.baomidou.mybatisplus.annotations.TableField;
import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;

/**
 * 专业综合素质
 * 手机端接口返回实体辅助类
 * （主要作用去除一些不必要的字段）
 */
@TableName("zhuanyezonghesuzhi")
public class ZhuanyezonghesuzhiVO implements Serializable {
    private static final long serialVersionUID = 1L;


    /**
     * 主键
     */

    @TableField(value = "id")
    private Integer id;


    /**
     * 专业
     */

    @TableField(value = "zhuanye_types")
    private Integer zhuanyeTypes;


    /**
     * 思想道德水平平均分
     */

    @TableField(value = "sixiangdaode_pingjun")
    private Double sixiangdaodePingjun;


    /**
     * 学业综合宿舍平均分
     */

    @TableField(value = "xueye_pingjun")
    private Double xueyePingjun;


    /**
     * 身心健康平均分
     */

    @TableField(value = "shenxinjiankang_pingjun")
    private Double shenxinjiankangPingjun;


    /**
     * 艺术素养平均分
     */

    @TableField(value = "yishusuyang_pingjun")
    private Double yishusuyangPingjun;


    /**
     * 社会综合实践平均分
     */

    @TableField(value = "shehuizongheshijian_pingjun")
    private Double shehuizongheshijianPingjun;


    /**
     * 备注
     */

    @TableField(value = "zhuanyezonghesuzhi_content")
    private String zhuanyezonghesuzhiContent;


    /**
     * 录入时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "insert_time")
    private Date insertTime;


    /**
     * 创建时间
     */
    @JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat

    @TableField(value = "create_time")
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
	 * 设置：专业
	 */
    public Integer getZhuanyeTypes() {
        return zhuanyeTypes;
    }


    /**
	 * 获取：专业
	 */

    public void setZhuanyeTypes(Integer zhuanyeTypes) {
        this.zhuanyeTypes = zhuanyeTypes;
    }
    /**
	 * 设置：思想道德水平平均分
	 */
    public Double getSixiangdaodePingjun() {
        return sixiangdaodePingjun;
    }


    /**
	 * 获取：思想道德水平平均分
	 */

    public void setSixiangdaodePingjun(Double sixiangdaodePingjun) {
        this.sixiangdaodePingjun = sixiangdaodePingjun;
    }
    /**
	 * 设置：学业综合宿舍平均分
	 */
    public Double getXueyePingjun() {
        return xueyePingjun;
    }


    /**
	 * 获取：学业综合宿舍平均分
	 */

    public void setXueyePingjun(Double xueyePingjun) {
        this.xueyePingjun = xueyePingjun;
    }
    /**
	 * 设置：身心健康平均分
	 */
    public Double getShenxinjiankangPingjun() {
        return shenxinjiankangPingjun;
    }


    /**
	 * 获取：身心健康平均分
	 */

    public void setShenxinjiankangPingjun(Double shenxinjiankangPingjun) {
        this.shenxinjiankangPingjun = shenxinjiankangPingjun;
    }
    /**
	 * 设置：艺术素养平均分
	 */
    public Double getYishusuyangPingjun() {
        return yishusuyangPingjun;
    }


    /**
	 * 获取：艺术素养平均分
	 */

    public void setYishusuyangPingjun(Double yishusuyangPingjun) {
        this.yishusuyangPingjun = yishusuyangPingjun;
    }
    /**
	 * 设置：社会综合实践平均分
	 */
    public Double getShehuizongheshijianPingjun() {
        return shehuizongheshijianPingjun;
    }


    /**
	 * 获取：社会综合实践平均分
	 */

    public void setShehuizongheshijianPingjun(Double shehuizongheshijianPingjun) {
        this.shehuizongheshijianPingjun = shehuizongheshijianPingjun;
    }
    /**
	 * 设置：备注
	 */
    public String getZhuanyezonghesuzhiContent() {
        return zhuanyezonghesuzhiContent;
    }


    /**
	 * 获取：备注
	 */

    public void setZhuanyezonghesuzhiContent(String zhuanyezonghesuzhiContent) {
        this.zhuanyezonghesuzhiContent = zhuanyezonghesuzhiContent;
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

}
