package com.entity.view;

import com.entity.GongsiEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 公司
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-29 16:14:51
 */
@TableName("gongsi")
public class GongsiView  extends GongsiEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public GongsiView(){
	}
 
 	public GongsiView(GongsiEntity gongsiEntity){
 	try {
			BeanUtils.copyProperties(this, gongsiEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
