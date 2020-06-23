     /* ICompanyService
      *
      * Version 1
      *
      * @author Nataliia Zviertseva, KhPI
      * COMPANY Service implementation
      */
package com.company;

import java.util.List;

public interface ICompanyService {
    Company getTopLevelParent(Company var1);
//@param Company var1, List<Company> var2
    long getEmployeeCountForCompanyAndChildren(Company var1, List<Company> var2);
}

