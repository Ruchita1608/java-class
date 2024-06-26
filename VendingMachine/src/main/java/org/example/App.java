package org.example;

import org.example.controller.VendingMachineController;
import org.example.dao.VendingMachineAuditDao;
import org.example.dao.VendingMachineAuditDaoFileImpl;
import org.example.dao.VendingMachineDao;
import org.example.dao.VendingMachineDaoFileImpl;
import org.example.service.VendingMachineServiceLayer;
import org.example.service.VendingMachineServiceLayerImpl;
import org.example.ui.UserIO;
import org.example.ui.UserIOConsoleImpl;
import org.example.ui.VendingMachineView;

public class App {
    public static void main(String[] args) {
        UserIO io = new UserIOConsoleImpl();
        VendingMachineView view = new VendingMachineView(io);
        VendingMachineAuditDao auditDao = new VendingMachineAuditDaoFileImpl();
        VendingMachineDao dao = new VendingMachineDaoFileImpl();
        VendingMachineServiceLayer service = new VendingMachineServiceLayerImpl(auditDao, dao);

        VendingMachineController controller = new VendingMachineController(view, service);

        controller.run();
    }
}
