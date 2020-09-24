package model.dao;

import model.dao.impl.SellerDaoImplJBDC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoImplJBDC();
    }
}
