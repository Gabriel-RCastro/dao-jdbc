package model.dao;

import db.DB;
import model.dao.impl.SellerDaoImplJBDC;

public class DaoFactory {

    public static SellerDao createSellerDao() {
        return new SellerDaoImplJBDC(DB.getConnection());
    }
}
