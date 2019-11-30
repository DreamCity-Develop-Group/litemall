package org.linlinjava.litemall.db.service;

import org.linlinjava.litemall.db.dao.GameRuleItemMapper;
import org.linlinjava.litemall.db.dao.GameRuleMapper;
import org.linlinjava.litemall.db.dao.GameRuleMapper;
import org.linlinjava.litemall.db.domain.GameRule;
import org.linlinjava.litemall.db.domain.GameRuleExample;
import org.linlinjava.litemall.db.domain.GameRuleItem;
import org.linlinjava.litemall.db.domain.GameRuleItemExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

/**
 * @author Wvv
 *
 */
@Service
public class GameRuleService {


    @Resource
    private GameRuleMapper ruleMapper;
    @Resource
    private GameRuleItemMapper ruleItemMapper;

    public GameRule findById(Integer ruleId) {
        return ruleMapper.selectByPrimaryKey(ruleId);
    }

    public GameRuleItem getRuleItemByFlag(String flag){
        GameRuleItemExample example = new GameRuleItemExample();
        example.or().andItemFlagEqualTo(flag);
        return ruleItemMapper.selectOneByExample(example);
    }

    public  List<GameRule> getRulesByItem(Integer itemId){
        GameRuleExample example = new GameRuleExample();
        example.or().andRuleItemEqualTo(itemId);
        return ruleMapper.selectByExample(example);
    }

    public GameRule findGameRuleById(Integer ruleId) {
        GameRule tree = findById(ruleId);
        return tree;
    }


    public void add(GameRule tree) {
        tree.setCreateTime(LocalDateTime.now());
        ruleMapper.insertSelective(tree);
    }

    public int updateById(GameRule tree) {
        return ruleMapper.updateByPrimaryKeySelective(tree);
    }


    public int count() {
        GameRuleExample example = new GameRuleExample();

        return (int) ruleMapper.countByExample(example);
    }

    public List<GameRule> queryByUsername(String key) {
        GameRuleExample example = new GameRuleExample();
        return ruleMapper.selectByExample(example);
    }

    public void deleteById(Integer id) {
        ruleMapper.deleteByPrimaryKey(id);
    }
}
