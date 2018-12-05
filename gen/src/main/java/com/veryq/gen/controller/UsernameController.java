package com.veryq.gen.controller;

import com.veryq.gen.dao.Excelimportdao;
import com.veryqy.jooq.tables.pojos.Commodity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
// http://localhost:8080/user/hello

@CrossOrigin(origins = "*")
@RestController
public class UsernameController {

    private final
    Excelimportdao dao;
    private final
    ExcelImportService excelImportService;

    @Autowired
    public UsernameController(Excelimportdao dao, ExcelImportService excelImportService) {
        this.dao = dao;
        this.excelImportService = excelImportService;
    }

    @RequestMapping("/commodityquery")
    public List<Commodity> commodityquery() {
        return dao.commodityquery();
    }
}
