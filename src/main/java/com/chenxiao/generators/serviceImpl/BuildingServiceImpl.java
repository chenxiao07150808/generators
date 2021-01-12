package com.chenxiao.generators.serviceImpl;

import com.chenxiao.generators.entity.Building;
import com.chenxiao.generators.mapper.BuildingMapper;
import com.chenxiao.generators.service.IBuildingService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 楼座 服务实现类
 * </p>
 *
 * @author chenxiao
 * @since 2021-01-12
 */
@Service
public class BuildingServiceImpl extends ServiceImpl<BuildingMapper, Building> implements IBuildingService {

}
