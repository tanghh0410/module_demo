package demo.demo_web;

import demo.demo_dao.BosUserModel;
import demo.demo_service.BosUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author tanghh
 * @Date 2020/6/28 15:21
 */
@RestController
public class DemoController {
   @Autowired
   private BosUserService bosUserService;

    @GetMapping(value = "/listAllBosUserData")
    public List<BosUserModel> listAllBosUserData(){
     return bosUserService.listBosUserData();
    }
}
