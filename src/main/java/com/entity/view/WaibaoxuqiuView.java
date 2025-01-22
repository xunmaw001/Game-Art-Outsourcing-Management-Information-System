package com.entity.view;

import com.entity.WaibaoxuqiuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 外包需求
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-29 16:14:52
 */
@TableName("waibaoxuqiu")
public class WaibaoxuqiuView  extends WaibaoxuqiuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WaibaoxuqiuView(){
	}
 
 	public WaibaoxuqiuView(WaibaoxuqiuEntity waibaoxuqiuEntity){
 	try {
			BeanUtils.copyProperties(this, waibaoxuqiuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
