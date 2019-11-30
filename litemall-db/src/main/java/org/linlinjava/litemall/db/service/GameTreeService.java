package org.linlinjava.litemall.db.service;

import org.linlinjava.litemall.db.dao.GameTreeMapper;
import org.linlinjava.litemall.db.domain.GameRule;
import org.linlinjava.litemall.db.domain.GameTree;
import org.linlinjava.litemall.db.domain.GameTreeExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Wvv
 *
 */
@Service
public class GameTreeService {


    @Resource
    private GameTreeMapper treeMapper;

    public GameTree findById(Integer treeId) {
        return treeMapper.selectByPrimaryKey(treeId);
    }

    public GameTree findGameTreeById(Integer treeId) {
        GameTree tree = findById(treeId);
        return tree;
    }


    public void add(GameTree tree) {
        tree.setCreateTime(LocalDateTime.now());
        treeMapper.insertSelective(tree);
    }

    public int updateById(GameTree tree) {
        return treeMapper.updateByPrimaryKeySelective(tree);
    }


    public int count() {
        GameTreeExample example = new GameTreeExample();

        return (int) treeMapper.countByExample(example);
    }

    public List<GameTree> queryByUsername(String key) {
        GameTreeExample example = new GameTreeExample();
        return treeMapper.selectByExample(example);
    }

    public GameTree queryByPlayerId(String playerId) {
        GameTreeExample example = new GameTreeExample();
        example.or().andTreePlayerIdEqualTo(playerId);
        return treeMapper.selectOneByExample(example);
    }

    public GameTree getPlayerByRef(String ref) {
        GameTreeExample example = new GameTreeExample();
        example.or().andTreeRelationEqualTo(ref);
        return treeMapper.selectOneByExample(example);
    }


    public List<GameTree> queryByParent(String parent) {
        GameTreeExample example = new GameTreeExample();
        example.or().andTreeParentIdEqualTo(parent);
        return treeMapper.selectByExample(example);
    }


    public void deleteById(Integer id) {
        treeMapper.deleteByPrimaryKey(id);
    }

    public Map getAllParents(GameTree childTree) {
        Map<Integer, GameTree> parents = new HashMap<>();
        String relation = childTree.getTreeRelation();
        int length = (relation.length() + 1) / 7; //==>8

        for (int i = 0; i < length - 1; i++) {
            String parentRelation = relation.substring(0, 7 * (length - 1 - i) - 1);

            GameTree parent = getPlayerByRef(parentRelation);
            parents.put(i + 1, parent);
        }
        return parents;
    }

    public GameTree upgradeParent(GameTree parent, int childsSize,List<GameRule> rules){
        try {
            int stars = 0;

            for (GameRule rule : rules) {
                if ("OPT_NUM".equals(rule.getRuleOpt())) {
                    if (rule.getRuleRate().compareTo(new Double(childsSize)) != 1) {
                        stars = rule.getRuleLevel();
                    }
                }
            }
            if (stars > 0 && stars > parent.getTreeLevel()) {
                parent.setTreeLevel(stars);
            }
            return parent;
        } catch (Exception e) {
            return parent;
        }
    }
}
