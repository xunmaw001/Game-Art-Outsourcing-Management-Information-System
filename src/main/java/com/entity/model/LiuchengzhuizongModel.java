package com.entity.model;

import com.entity.LiuchengzhuizongEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import com.fasterxml.jackson.annotation.JsonFormat;
import java.util.Date;
import org.springframework.format.annotation.DateTimeFormat;
import java.io.Serializable;
 

/**
 * 流程追踪
 * 接收传参的实体类  
 *（实际开发中配合移动端接口开发手动去掉些没用的字段， 后端一般用entity就够用了） 
 * 取自ModelAndView 的model名称
 * @author 
 * @email 
 * @date 2022-03-29 16:14:52
 */
public class LiuchengzhuizongModel  implements Serializable {
	private static final long serialVersionUID = 1L;

	 			
	/**
	 * 作品名称
	 */
	
	private String zuopinmingcheng;
		
	/**
	 * 图片
	 */
	
	private String tupian;
		
	/**
	 * 用户名
	 */
	
	private String yonghuming;
		
	/**
	 * 用户姓名
	 */
	
	private String yonghuxingming;
		
	/**
	 * 流程追踪
	 */
	
	private String liuchengzhuizong;
		
	/**
	 * 操作时间
	 */
		
	@JsonFormat(locale="zh", timezone="GMT+8", pattern="yyyy-MM-dd HH:mm:ss")
	@DateTimeFormat 
	private Date caozuoshijian;
		
	/**
	 * 账号
	 */
	
	private String zhanghao;
		
	/**
	 * 公司名称
	 */
	
	private String gongsimingcheng;
				
	
	/**
	 * 设置：作品名称
	 */
	 
	public void setZuopinmingcheng(String zuopinmingcheng) {
		this.zuopinmingcheng = zuopinmingcheng;
	}
	
	/**
	 * 获取：作品名称
	 */
	public String getZuopinmingcheng() {
		return zuopinmingcheng;
	}
				
	
	/**
	 * 设置：图片
	 */
	 
	public void setTupian(String tupian) {
		this.tupian = tupian;
	}
	
	/**
	 * 获取：图片
	 */
	public String getTupian() {
		return tupian;
	}
				
	
	/**
	 * 设置：用户名
	 */
	 
	public void setYonghuming(String yonghuming) {
		this.yonghuming = yonghuming;
	}
	
	/**
	 * 获取：用户名
	 */
	public String getYonghuming() {
		return yonghuming;
	}
				
	
	/**
	 * 设置：用户姓名
	 */
	 
	public void setYonghuxingming(String yonghuxingming) {
		this.yonghuxingming = yonghuxingming;
	}
	
	/**
	 * 获取：用户姓名
	 */
	public String getYonghuxingming() {
		return yonghuxingming;
	}
				
	
	/**
	 * 设置：流程追踪
	 */
	 
	public void setLiuchengzhuizong(String liuchengzhuizong) {
		this.liuchengzhuizong = liuchengzhuizong;
	}
	
	/**
	 * 获取：流程追踪
	 */
	public String getLiuchengzhuizong() {
		return liuchengzhuizong;
	}
				
	
	/**
	 * 设置：操作时间
	 */
	 
	public void setCaozuoshijian(Date caozuoshijian) {
		this.caozuoshijian = caozuoshijian;
	}
	
	/**
	 * 获取：操作时间
	 */
	public Date getCaozuoshijian() {
		return caozuoshijian;
	}
				
	
	/**
	 * 设置：账号
	 */
	 
	public void setZhanghao(String zhanghao) {
		this.zhanghao = zhanghao;
	}
	
	/**
	 * 获取：账号
	 */
	public String getZhanghao() {
		return zhanghao;
	}
				
	
	/**
	 * 设置：公司名称
	 */
	 
	public void setGongsimingcheng(String gongsimingcheng) {
		this.gongsimingcheng = gongsimingcheng;
	}
	
	/**
	 * 获取：公司名称
	 */
	public String getGongsimingcheng() {
		return gongsimingcheng;
	}
			
}
