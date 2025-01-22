package com.entity.view;

import com.entity.WaibaoyingzhengEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 外包应征
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-29 16:14:52
 */
@TableName("waibaoyingzheng")
public class WaibaoyingzhengView  extends WaibaoyingzhengEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public WaibaoyingzhengView(){
	}
 
 	public WaibaoyingzhengView(WaibaoyingzhengEntity waibaoyingzhengEntity){
 	try {
			BeanUtils.copyProperties(this, waibaoyingzhengEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
