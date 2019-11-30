package org.linlinjava.litemall.db.service;

import com.github.pagehelper.PageHelper;
import org.linlinjava.litemall.db.dao.GameLevelMapper;
import org.linlinjava.litemall.db.domain.GameLevel;
import org.linlinjava.litemall.db.domain.GameLevelExample;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.List;

@Service
public class GameLevelService {
    @Resource
    private GameLevelMapper levelMapper;

    public GameLevel findById(Integer levelId) {
        return levelMapper.selectByPrimaryKey(levelId);
    }

    public GameLevel findGameLevelById(Integer levelId) {
        GameLevel level = findById(levelId);
        return level;
    }


    public void add(GameLevel level) {
        level.setCreateTime(LocalDateTime.now());
        level.setUpdateTime(LocalDateTime.now());
        levelMapper.insertSelective(level);
    }

    public int updateById(GameLevel level) {
        level.setUpdateTime(LocalDateTime.now());
        return levelMapper.updateByPrimaryKeySelective(level);
    }

    public List<GameLevel> querySelective(String name, String key, Integer page, Integer size, String sort, String order) {
        GameLevelExample example = new GameLevelExample();
        GameLevelExample.Criteria criteria = example.createCriteria();

        if (!StringUtils.isEmpty(name)) {
            criteria.andNameLike("%" + name + "%");
        }
        if (!StringUtils.isEmpty(key)) {
            criteria.andKeyEqualTo(key);
        }
        criteria.andDeletedEqualTo(false);

        if (!StringUtils.isEmpty(sort) && !StringUtils.isEmpty(order)) {
            example.setOrderByClause(sort + " " + order);
        }

        PageHelper.startPage(page, size);
        return levelMapper.selectByExample(example);
    }

    public int count() {
        GameLevelExample example = new GameLevelExample();
        example.or().andDeletedEqualTo(false);

        return (int) levelMapper.countByExample(example);
    }

    public List<GameLevel> queryByUsername(String key) {
        GameLevelExample example = new GameLevelExample();
        example.or().andKeyEqualTo(key).andDeletedEqualTo(false);
        return levelMapper.selectByExample(example);
    }


    public List<GameLevel> queryByLevel(Integer level) {
        GameLevelExample example = new GameLevelExample();
        example.or().andLevelEqualTo(level).andDeletedEqualTo(false);
        return levelMapper.selectByExample(example);
    }


    public void deleteById(Integer id) {
        levelMapper.deleteByPrimaryKey(id);
    }
}
