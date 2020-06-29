package demo.demo_service;

import demo.demo_dao.BosUserModel;

import java.util.List;

/**
 * @Author tanghh
 * @Date 2020/6/28 15:11
 */
public interface BosUserService {
    /**
     * 查询所有人员数据
     */
    List<BosUserModel> listBosUserData();
}
