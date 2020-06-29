package demo.demo_service.impl;

import demo.demo_dao.BosUserJPARepositoty;
import demo.demo_dao.BosUserModel;
import demo.demo_service.BosUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author tanghh
 * @Date 2020/6/28 15:12
 */
@Service
public class BosUserServiceImpl implements BosUserService {

    @Autowired
    private BosUserJPARepositoty bosUserJPARepositoty;
    /**
     * 查询所有的人员数据
     */
    @Override
    public List<BosUserModel> listBosUserData() {
     return bosUserJPARepositoty.findAll();
    }
}
