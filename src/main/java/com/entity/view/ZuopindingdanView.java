package com.entity.view;

import com.entity.ZuopindingdanEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;

import java.io.Serializable;
 

/**
 * 作品订单
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2022-03-29 16:14:52
 */
@TableName("zuopindingdan")
public class ZuopindingdanView  extends ZuopindingdanEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ZuopindingdanView(){
	}
 
 	public ZuopindingdanView(ZuopindingdanEntity zuopindingdanEntity){
 	try {
			BeanUtils.copyProperties(this, zuopindingdanEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}
}
