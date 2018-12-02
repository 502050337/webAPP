package com.veryq.gen.Controller;

import com.veryq.gen.DAO.Excelimportdao;
import com.veryqy.jooq.tables.pojos.Commodity;
import com.veryqy.jooq.tables.pojos.User;
import org.jooq.DSLContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import static com.veryqy.jooq.Tables.USER;
// http://localhost:8080/user/hello


@RestController
public class UserController {

    @Autowired
    DSLContext ctx;
    @Autowired
    Excelimportdao dao;
    @Autowired
    ExcelImportService excelImportService;



    @GetMapping("/hello")
    @ResponseBody
    @Transactional
    public int hello(){


        ctx.insertInto(USER).columns(USER.USER_,USER.PASSWORD).values("qingtian1","123456").execute();
        com.veryqy.jooq.tables.User t1=USER;
        User user=ctx.select().from(t1) .fetchOne().into(User.class);
        ctx.update(USER).set(USER.USER.PASSWORD,"7777").where(USER.USER_.eq("qingtian")).execute();
        ctx.delete(USER).where(USER.USER_.eq("qingtian")).execute();
        System.out.println(user.getUser());

        return 0;
    }

    @GetMapping("/commodityquery")
    @ResponseBody
    public List<Commodity> commodityquery(){
        return dao.commodityquery();
    }
}
