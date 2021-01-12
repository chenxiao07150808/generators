package com.chenxiao.generators.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMethod;
    import org.springframework.web.bind.annotation.RestController;
import com.alibaba.fastjson.JSON;
import com.dcy.constant.Constant;
import com.dcy.model.BootStrapTable;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chenxiao.generators.service.IBuildingService;
import com.chenxiao.generators.entity.Building;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author chenxiao
 * @since 2021-01-12
 */
@RestController
@Slf4j
@RequestMapping("/a/chenxiao.generators/building")
public class BuildingController {


@Autowired
public IBuildingService iBuildingService;

/**
 * 跳转列表页面
 * @param request
 * @param model
 * @return
 */
@RequestMapping(method = RequestMethod.GET, value = {"/buildingIndex"})
public String index(HttpServletRequest request,Model model){
    return"buildingListIndex";
    }

/**
 * 分页查询数据
 *
 * @param bootStrapTable  分页信息
 * @param building 查询条件
 * @return
 */
@ResponseBody
@GetMapping("/getBuildingPageList")
public Map<String, Object> getBuildingList(BootStrapTable<Building> bootStrapTable,Building building){
    Map<String, Object> result=new HashMap<String, Object>();
    try{
    result=bootStrapTable.setRows(iBuildingService.selectPage(bootStrapTable,building));
    }catch(Exception e){
    logger.error("getBuildingList -=- {}",e.toString());
    result.put(Constant.BOOTSTAP_TABLE_ROWS,new ArrayList<>());
    result.put(Constant.BOOTSTRAP_TABLE_TOTAL,0);
    }
    return result;
    }

/**
 * 跳转添加页面
 * @param request
 * @param response
 * @param model
 * @return
 */
@RequestMapping(method = RequestMethod.GET, value = "/buildingAdd")
public String buildingAdd(HttpServletRequest request,HttpServletResponse response,Model model){
    try{


    }catch(Exception ex){
    logger.error("buildingAdd -=- {}",ex.toString());
    }
    return"buildingAdd";
    }

/**
 * 跳转修改页面
 * @param request
 * @param id  实体ID
 * @return
 */
@RequestMapping(method = RequestMethod.GET, value = "/buildingUpdate")
public String buildingUpdate(HttpServletRequest request,Long id){
    try{
    Building building =iBuildingService.selectById(id);
    request.setAttribute("building",building);
    }catch(Exception ex){
    logger.error("buildingUpdate -=- {}",ex.toString());
    }
    return"buildingUpd";
    }

/**
 * 保存和修改公用的
 * @param building 传递的实体
 * @return 0 失败  1 成功
 */
@ResponseBody
@RequestMapping(method = RequestMethod.POST, value = "/buildingSave")
public int buildingSave(Building building){
    int count=0;
    try{
    count=iBuildingService.insertOrUpdate(building)?1:0;
    }catch(Exception e){
    logger.error("buildingSave -=- {}",e.toString());
    }
    return count;
    }

/**
 * 根据id删除对象
 * @param id  实体ID
 * @return 0 失败  1 成功
 */
@ResponseBody
@RequestMapping(method = RequestMethod.POST, value = "/buildingDelete")
public int buildingDelete(Long id){
    int count=0;
    try{
    count=iBuildingService.deleteById(id)?1:0;
    }catch(Exception e){
    logger.error("buildingDelete -=- {}",e.toString());
    }
    return count;
    }

/**
 * 批量删除对象
 * @param item 实体集合ID
 * @return  0 失败  1 成功
 */
@ResponseBody
@RequestMapping(method = RequestMethod.POST, value = "/buildingBatchDelete")
public int deleteBatchIds(String item){
    int count=0;
    try{
    List<Long> ids=(List<Long>)JSON.parse(item);
    count=iBuildingService.deleteBatchIds(ids)?1:0;
    }catch(Exception e){
    logger.error("buildingBatchDelete -=- {}",e.toString());
    }
    return count;
    }


    }