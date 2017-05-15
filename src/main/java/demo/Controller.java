package demo;

import demo.entity.UsersEntity;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2017/5/15/015.
 */
@org.springframework.stereotype.Controller
public class Controller {

    public Session getSession(){
        Configuration configuration = new Configuration();
        configuration.configure();
        SessionFactory ourSessionFactory;
        ourSessionFactory = configuration.buildSessionFactory();
        return ourSessionFactory.getCurrentSession();
    }


    @RequestMapping(value = "demo",method = RequestMethod.GET)
    @ResponseBody
    public void demo(@RequestParam String name,@RequestParam String major,@RequestParam String qq,@RequestParam String tel){
        Session session=getSession();
        Transaction transaction=session.beginTransaction();
        UsersEntity usersEntity=new UsersEntity();
        usersEntity.setName(name);
        usersEntity.setMajor(major);
        usersEntity.setQq(qq);
        usersEntity.setTel(tel);
        session.save(usersEntity);
        transaction.commit();

    }
}
