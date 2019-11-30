package org.linlinjava.litemall.db.service;

import org.linlinjava.litemall.db.dao.GameTreeMapper;
import org.linlinjava.litemall.db.domain.GameTree;
import org.linlinjava.litemall.db.domain.GameTreeExample;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

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


    public List<GameTree> queryByParent(String parent) {
        GameTreeExample example = new GameTreeExample();
        example.or().andTreeParentIdEqualTo(parent);
        return treeMapper.selectByExample(example);
    }


    public void deleteById(Integer id) {
        treeMapper.deleteByPrimaryKey(id);
    }
}
