package com.example.mybatisP.serviceImpl;

import com.example.mybatisP.entity.Dials;
import com.example.mybatisP.mapper.DialsMapper;
import com.example.mybatisP.service.IDialsService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 仪表 服务实现类
 * </p>
 *
 * @author zhengweihe
 * @since 2021-01-12
 */
@Service
public class DialsServiceImpl extends ServiceImpl<DialsMapper, Dials> implements IDialsService {

}
