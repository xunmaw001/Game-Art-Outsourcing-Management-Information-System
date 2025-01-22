package com.entity.view;

import com.entity.LiuchengzhuizongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 流程追踪
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-29 16:14:52
 */
@TableName("liuchengzhuizong")
public class LiuchengzhuizongView  extends LiuchengzhuizongEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public LiuchengzhuizongView(){
	}
 
 	public LiuchengzhuizongView(LiuchengzhuizongEntity liuchengzhuizongEntity){
 	try {
			BeanUtils.copyProperties(this, liuchengzhuizongEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
