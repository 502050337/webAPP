package com.veryq.gen.controller;

import com.veryq.gen.dao.Excelimportdao;
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

    private final
    Excelimportdao dao;
    private final
    ExcelImportService excelImportService;

    @Autowired
    public UserController(Excelimportdao dao, ExcelImportService excelImportService) {
        this.dao = dao;
        this.excelImportService = excelImportService;
    }


    @GetMapping("/hello")
    @ResponseBody
    @Transactional
    public int hello() {


//        ctx.insertInto(USER).columns(USER.USER_, USER.PASSWORD).values("qingtian1", "123456").execute();
//        User user = ctx.select().from(USER).fetchOne().into(User.class);
//        ctx.update(USER).set(com.veryqy.jooq.tables.User.USER.PASSWORD, "7777").where(USER.USER_.eq("qingtian")).execute();
//        ctx.delete(USER).where(USER.USER_.eq("qingtian")).execute();
//        System.out.println(user.getUser());

        return 0;
    }

    @GetMapping("/commodityquery")
    @ResponseBody
    public List<Commodity> commodityquery() {
        return dao.commodityquery();
    }
}
