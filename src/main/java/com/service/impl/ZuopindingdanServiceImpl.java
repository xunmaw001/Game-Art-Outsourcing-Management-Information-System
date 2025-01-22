package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.ZuopindingdanDao;
import com.entity.ZuopindingdanEntity;
import com.service.ZuopindingdanService;
import com.entity.vo.ZuopindingdanVO;
import com.entity.view.ZuopindingdanView;

@Service("zuopindingdanService")
public class ZuopindingdanServiceImpl extends ServiceImpl<ZuopindingdanDao, ZuopindingdanEntity> implements ZuopindingdanService {
	

    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<ZuopindingdanEntity> page = this.selectPage(
                new Query<ZuopindingdanEntity>(params).getPage(),
                new EntityWrapper<ZuopindingdanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<ZuopindingdanEntity> wrapper) {
		  Page<ZuopindingdanView> page =new Query<ZuopindingdanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<ZuopindingdanVO> selectListVO(Wrapper<ZuopindingdanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public ZuopindingdanVO selectVO(Wrapper<ZuopindingdanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<ZuopindingdanView> selectListView(Wrapper<ZuopindingdanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public ZuopindingdanView selectView(Wrapper<ZuopindingdanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}


}
