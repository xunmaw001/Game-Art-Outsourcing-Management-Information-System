package com.controller;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

import com.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.annotation.IgnoreAuth;

import com.entity.LiuchengzhuizongEntity;
import com.entity.view.LiuchengzhuizongView;

import com.service.LiuchengzhuizongService;
import com.service.TokenService;
import com.utils.PageUtils;
import com.utils.R;
import com.utils.MD5Util;
import com.utils.MPUtil;
import com.utils.CommonUtil;

/**
 * 流程追踪
 * 后端接口
 * @author 
 * @email 
 * @date 2022-03-29 16:14:52
 */
@RestController
@RequestMapping("/liuchengzhuizong")
public class LiuchengzhuizongController {
    @Autowired
    private LiuchengzhuizongService liuchengzhuizongService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,LiuchengzhuizongEntity liuchengzhuizong, 
		HttpServletRequest request){

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			liuchengzhuizong.setYonghuming((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("gongsi")) {
			liuchengzhuizong.setZhanghao((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<LiuchengzhuizongEntity> ew = new EntityWrapper<LiuchengzhuizongEntity>();
		PageUtils page = liuchengzhuizongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, liuchengzhuizong), params), params));
        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
	@IgnoreAuth
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,LiuchengzhuizongEntity liuchengzhuizong, 
		HttpServletRequest request){
        EntityWrapper<LiuchengzhuizongEntity> ew = new EntityWrapper<LiuchengzhuizongEntity>();
		PageUtils page = liuchengzhuizongService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, liuchengzhuizong), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( LiuchengzhuizongEntity liuchengzhuizong){
       	EntityWrapper<LiuchengzhuizongEntity> ew = new EntityWrapper<LiuchengzhuizongEntity>();
      	ew.allEq(MPUtil.allEQMapPre( liuchengzhuizong, "liuchengzhuizong")); 
        return R.ok().put("data", liuchengzhuizongService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(LiuchengzhuizongEntity liuchengzhuizong){
        EntityWrapper< LiuchengzhuizongEntity> ew = new EntityWrapper< LiuchengzhuizongEntity>();
 		ew.allEq(MPUtil.allEQMapPre( liuchengzhuizong, "liuchengzhuizong")); 
		LiuchengzhuizongView liuchengzhuizongView =  liuchengzhuizongService.selectView(ew);
		return R.ok("查询流程追踪成功").put("data", liuchengzhuizongView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        LiuchengzhuizongEntity liuchengzhuizong = liuchengzhuizongService.selectById(id);
        return R.ok().put("data", liuchengzhuizong);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        LiuchengzhuizongEntity liuchengzhuizong = liuchengzhuizongService.selectById(id);
        return R.ok().put("data", liuchengzhuizong);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody LiuchengzhuizongEntity liuchengzhuizong, HttpServletRequest request){
    	liuchengzhuizong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(liuchengzhuizong);

        liuchengzhuizongService.insert(liuchengzhuizong);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody LiuchengzhuizongEntity liuchengzhuizong, HttpServletRequest request){
    	liuchengzhuizong.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(liuchengzhuizong);

        liuchengzhuizongService.insert(liuchengzhuizong);
        return R.ok();
    }

    /**
     * 修改
     */
    @RequestMapping("/update")
    public R update(@RequestBody LiuchengzhuizongEntity liuchengzhuizong, HttpServletRequest request){
        //ValidatorUtils.validateEntity(liuchengzhuizong);
        liuchengzhuizongService.updateById(liuchengzhuizong);//全部更新
        return R.ok();
    }
    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        liuchengzhuizongService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
    /**
     * 提醒接口
     */
	@RequestMapping("/remind/{columnName}/{type}")
	public R remindCount(@PathVariable("columnName") String columnName, HttpServletRequest request, 
						 @PathVariable("type") String type,@RequestParam Map<String, Object> map) {
		map.put("column", columnName);
		map.put("type", type);
		
		if(type.equals("2")) {
			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
			Calendar c = Calendar.getInstance();
			Date remindStartDate = null;
			Date remindEndDate = null;
			if(map.get("remindstart")!=null) {
				Integer remindStart = Integer.parseInt(map.get("remindstart").toString());
				c.setTime(new Date()); 
				c.add(Calendar.DAY_OF_MONTH,remindStart);
				remindStartDate = c.getTime();
				map.put("remindstart", sdf.format(remindStartDate));
			}
			if(map.get("remindend")!=null) {
				Integer remindEnd = Integer.parseInt(map.get("remindend").toString());
				c.setTime(new Date());
				c.add(Calendar.DAY_OF_MONTH,remindEnd);
				remindEndDate = c.getTime();
				map.put("remindend", sdf.format(remindEndDate));
			}
		}
		
		Wrapper<LiuchengzhuizongEntity> wrapper = new EntityWrapper<LiuchengzhuizongEntity>();
		if(map.get("remindstart")!=null) {
			wrapper.ge(columnName, map.get("remindstart"));
		}
		if(map.get("remindend")!=null) {
			wrapper.le(columnName, map.get("remindend"));
		}

		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("yonghu")) {
			wrapper.eq("yonghuming", (String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("gongsi")) {
			wrapper.eq("zhanghao", (String)request.getSession().getAttribute("username"));
		}

		int count = liuchengzhuizongService.selectCount(wrapper);
		return R.ok().put("count", count);
	}
	







}
