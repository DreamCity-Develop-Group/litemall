package org.linlinjava.litemall.admin.web;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.linlinjava.litemall.admin.annotation.RequiresPermissionsDesc;
import org.linlinjava.litemall.core.util.ResponseUtil;
import org.linlinjava.litemall.core.validator.Order;
import org.linlinjava.litemall.core.validator.Sort;
import org.linlinjava.litemall.db.domain.GameLevel;
import org.linlinjava.litemall.db.domain.LitemallUser;
import org.linlinjava.litemall.db.service.GameLevelService;
import org.linlinjava.litemall.db.service.LitemallUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin/level")
@Validated
public class AdminLevelController {

    private final Log logger = LogFactory.getLog(AdminUserController.class);

    @Autowired
    private GameLevelService gameLevelService;

    @RequiresPermissions("admin:level:list")
    @RequiresPermissionsDesc(menu = {"用户管理", "级别管理"}, button = "查询")
    @GetMapping("/list")
    public Object list(String name, String key,
                       @RequestParam(defaultValue = "1") Integer page,
                       @RequestParam(defaultValue = "10") Integer limit,
                       @Sort @RequestParam(defaultValue = "create_time") String sort,
                       @Order @RequestParam(defaultValue = "desc") String order) {
        logger.info("查找级别");
        List<GameLevel> levelList = gameLevelService.querySelective(name,key,page,limit,sort,order);
        return ResponseUtil.okList(levelList);
    }
}
