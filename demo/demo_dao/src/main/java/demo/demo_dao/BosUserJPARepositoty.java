package demo.demo_dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * @Author: tanghh18
 * @Date: 2020/6/28 15:10
 */
public interface BosUserJPARepositoty extends JpaRepository<BosUserModel, Integer>, JpaSpecificationExecutor<BosUserModel> {

}
