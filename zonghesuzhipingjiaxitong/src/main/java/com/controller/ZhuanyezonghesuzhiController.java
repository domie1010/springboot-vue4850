
package com.controller;

import java.io.File;
import java.math.BigDecimal;
import java.net.URL;
import java.text.SimpleDateFormat;
import com.alibaba.fastjson.JSONObject;
import java.util.*;
import org.springframework.beans.BeanUtils;
import javax.servlet.http.HttpServletRequest;
import org.springframework.web.context.ContextLoader;
import javax.servlet.ServletContext;
import com.service.TokenService;
import com.utils.*;
import java.lang.reflect.InvocationTargetException;

import com.service.DictionaryService;
import org.apache.commons.lang3.StringUtils;
import com.annotation.IgnoreAuth;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.entity.*;
import com.entity.view.*;
import com.service.*;
import com.utils.PageUtils;
import com.utils.R;
import com.alibaba.fastjson.*;

/**
 * 专业综合素质
 * 后端接口
 * @author
 * @email
*/
@RestController
@Controller
@RequestMapping("/zhuanyezonghesuzhi")
public class ZhuanyezonghesuzhiController {
    private static final Logger logger = LoggerFactory.getLogger(ZhuanyezonghesuzhiController.class);

    @Autowired
    private ZhuanyezonghesuzhiService zhuanyezonghesuzhiService;


    @Autowired
    private TokenService tokenService;
    @Autowired
    private DictionaryService dictionaryService;

    //级联表service

    @Autowired
    private FudaoyuanService fudaoyuanService;
    @Autowired
    private LaoshiService laoshiService;
    @Autowired
    private XueshengService xueshengService;


    /**
    * 后端列表
    */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params, HttpServletRequest request){
        logger.debug("page方法:,,Controller:{},,params:{}",this.getClass().getName(),JSONObject.toJSONString(params));
        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永不会进入");
        else if("辅导员".equals(role))
            params.put("fudaoyuanId",request.getSession().getAttribute("userId"));
        else if("老师".equals(role))
            params.put("laoshiId",request.getSession().getAttribute("userId"));
        else if("学生".equals(role))
            params.put("xueshengId",request.getSession().getAttribute("userId"));
        if(params.get("orderBy")==null || params.get("orderBy")==""){
            params.put("orderBy","id");
        }
        PageUtils page = zhuanyezonghesuzhiService.queryPage(params);

        //字典表数据转换
        List<ZhuanyezonghesuzhiView> list =(List<ZhuanyezonghesuzhiView>)page.getList();
        for(ZhuanyezonghesuzhiView c:list){
            //修改对应字典表字段
            dictionaryService.dictionaryConvert(c, request);
        }
        return R.ok().put("data", page);
    }

    /**
    * 后端详情
    */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id, HttpServletRequest request){
        logger.debug("info方法:,,Controller:{},,id:{}",this.getClass().getName(),id);
        ZhuanyezonghesuzhiEntity zhuanyezonghesuzhi = zhuanyezonghesuzhiService.selectById(id);
        if(zhuanyezonghesuzhi !=null){
            //entity转view
            ZhuanyezonghesuzhiView view = new ZhuanyezonghesuzhiView();
            BeanUtils.copyProperties( zhuanyezonghesuzhi , view );//把实体数据重构到view中

            //修改对应字典表字段
            dictionaryService.dictionaryConvert(view, request);
            return R.ok().put("data", view);
        }else {
            return R.error(511,"该专业已有综合素质评分");
        }

    }

    /**
    * 后端保存
    */
    @RequestMapping("/save")
    public R save(@RequestBody ZhuanyezonghesuzhiEntity zhuanyezonghesuzhi, HttpServletRequest request){
        logger.debug("save方法:,,Controller:{},,zhuanyezonghesuzhi:{}",this.getClass().getName(),zhuanyezonghesuzhi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
        if(false)
            return R.error(511,"永远不会进入");

        Wrapper<ZhuanyezonghesuzhiEntity> queryWrapper = new EntityWrapper<ZhuanyezonghesuzhiEntity>()
            .eq("zhuanye_types", zhuanyezonghesuzhi.getZhuanyeTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhuanyezonghesuzhiEntity zhuanyezonghesuzhiEntity = zhuanyezonghesuzhiService.selectOne(queryWrapper);
        if(zhuanyezonghesuzhiEntity==null){
            zhuanyezonghesuzhi.setInsertTime(new Date());
            zhuanyezonghesuzhi.setCreateTime(new Date());
            zhuanyezonghesuzhiService.insert(zhuanyezonghesuzhi);
            return R.ok();
        }else {
            return R.error(511,"该专业已有综合素质评分");
        }
    }

    /**
    * 后端修改
    */
    @RequestMapping("/update")
    public R update(@RequestBody ZhuanyezonghesuzhiEntity zhuanyezonghesuzhi, HttpServletRequest request){
        logger.debug("update方法:,,Controller:{},,zhuanyezonghesuzhi:{}",this.getClass().getName(),zhuanyezonghesuzhi.toString());

        String role = String.valueOf(request.getSession().getAttribute("role"));
//        if(false)
//            return R.error(511,"永远不会进入");
        //根据字段查询是否有相同数据
        Wrapper<ZhuanyezonghesuzhiEntity> queryWrapper = new EntityWrapper<ZhuanyezonghesuzhiEntity>()
            .notIn("id",zhuanyezonghesuzhi.getId())
            .andNew()
            .eq("zhuanye_types", zhuanyezonghesuzhi.getZhuanyeTypes())
            ;

        logger.info("sql语句:"+queryWrapper.getSqlSegment());
        ZhuanyezonghesuzhiEntity zhuanyezonghesuzhiEntity = zhuanyezonghesuzhiService.selectOne(queryWrapper);
        if(zhuanyezonghesuzhiEntity==null){
            zhuanyezonghesuzhiService.updateById(zhuanyezonghesuzhi);//根据id更新
            return R.ok();
        }else {
            return R.error(511,"表中有相同数据");
        }
    }



    /**
    * 删除
    */
    @RequestMapping("/delete")
    public R delete(@RequestBody Integer[] ids){
        logger.debug("delete:,,Controller:{},,ids:{}",this.getClass().getName(),ids.toString());
        zhuanyezonghesuzhiService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }


    /**
     * 批量上传
     */
    @RequestMapping("/batchInsert")
    public R save( String fileName, HttpServletRequest request){
        logger.debug("batchInsert方法:,,Controller:{},,fileName:{}",this.getClass().getName(),fileName);
        Integer yonghuId = Integer.valueOf(String.valueOf(request.getSession().getAttribute("userId")));
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        try {
            List<ZhuanyezonghesuzhiEntity> zhuanyezonghesuzhiList = new ArrayList<>();//上传的东西
            Map<String, List<String>> seachFields= new HashMap<>();//要查询的字段
            Date date = new Date();
            int lastIndexOf = fileName.lastIndexOf(".");
            if(lastIndexOf == -1){
                return R.error(511,"该文件没有后缀");
            }else{
                String suffix = fileName.substring(lastIndexOf);
                if(!".xls".equals(suffix)){
                    return R.error(511,"只支持后缀为xls的excel文件");
                }else{
                    URL resource = this.getClass().getClassLoader().getResource("static/upload/" + fileName);//获取文件路径
                    File file = new File(resource.getFile());
                    if(!file.exists()){
                        return R.error(511,"找不到上传文件，请联系管理员");
                    }else{
                        List<List<String>> dataList = PoiUtil.poiImport(file.getPath());//读取xls文件
                        dataList.remove(0);//删除第一行，因为第一行是提示
                        for(List<String> data:dataList){
                            //循环
                            ZhuanyezonghesuzhiEntity zhuanyezonghesuzhiEntity = new ZhuanyezonghesuzhiEntity();
//                            zhuanyezonghesuzhiEntity.setZhuanyeTypes(Integer.valueOf(data.get(0)));   //专业 要改的
//                            zhuanyezonghesuzhiEntity.setSixiangdaodePingjun(data.get(0));                    //思想道德水平平均分 要改的
//                            zhuanyezonghesuzhiEntity.setXueyePingjun(data.get(0));                    //学业综合宿舍平均分 要改的
//                            zhuanyezonghesuzhiEntity.setShenxinjiankangPingjun(data.get(0));                    //身心健康平均分 要改的
//                            zhuanyezonghesuzhiEntity.setYishusuyangPingjun(data.get(0));                    //艺术素养平均分 要改的
//                            zhuanyezonghesuzhiEntity.setShehuizongheshijianPingjun(data.get(0));                    //社会综合实践平均分 要改的
//                            zhuanyezonghesuzhiEntity.setZhuanyezonghesuzhiContent("");//详情和图片
//                            zhuanyezonghesuzhiEntity.setInsertTime(date);//时间
//                            zhuanyezonghesuzhiEntity.setCreateTime(date);//时间
                            zhuanyezonghesuzhiList.add(zhuanyezonghesuzhiEntity);


                            //把要查询是否重复的字段放入map中
                        }

                        //查询是否重复
                        zhuanyezonghesuzhiService.insertBatch(zhuanyezonghesuzhiList);
                        return R.ok();
                    }
                }
            }
        }catch (Exception e){
            e.printStackTrace();
            return R.error(511,"批量插入数据异常，请联系管理员");
        }
    }






}
