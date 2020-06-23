       /* Main
        *
        * Version 1
        *
        * @author Nataliia Zviertseva, KhPI
        * COMPANY Service implementation
        */
package com.company;

import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) throws Exception {
        //Create objects
        Company chef = new Company();
        chef.setEmployeesCount(6);
        chef.setName("chef");

        Company layer = new Company();
        layer.setParent(chef);
        layer.setName("layer");

        Company developer = new Company();
        developer.setParent(chef);
        developer.setEmployeesCount(4);
        developer.setName("developer");


        Company backEnd = new Company();
        backEnd.setParent(developer);
        backEnd.setEmployeesCount(1);
        backEnd.setName("backEnd");

        Company devOps = new Company();
        devOps.setParent(backEnd);
        devOps.setName("devOps");

        Company frontEnd = new Company();
        frontEnd.setParent(developer);
        frontEnd.setEmployeesCount(1);
        frontEnd.setName("frontEnd");

        Company design = new Company();
        design.setParent(frontEnd);
        design.setName("design");

        Company accounting = new Company();
        List<Company> companyList = Arrays.asList(chef, layer, developer, backEnd, devOps, frontEnd, design, accounting);

        CompanyServiceImpl service = new CompanyServiceImpl();

        System.out.println(service.getTopLevelParent(design));
        System.out.println("Number of employees is: "
                + service.getEmployeeCountForCompanyAndChildren(chef,companyList));
    }


}
