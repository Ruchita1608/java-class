package org.example;

import org.example.controller.DvdLibraryController;
import org.example.dao.DvdLibraryDao;
import org.example.dao.DvdLibraryDaoFileImpl;
import org.example.ui.DvdLibraryView;
import org.example.ui.UserIO;
import org.example.ui.UserIOConsoleImpl;

public class App {

    public static void main(String[] args) {
        //Dependency injection
        //Code below ensures that the App class configures, instantiates and assembles the classes in the application.
        //An object should not be responsible for directly instantiating the
        //the implementation of any of its member fields that might have more than
        //one implementation.
        //The App class acts as the application assembler, it chooses the implementations of the dependencies and
        //wires them together.
        UserIO myIo = new UserIOConsoleImpl();
        DvdLibraryView myView = new DvdLibraryView(myIo);
        DvdLibraryDao myDao = new DvdLibraryDaoFileImpl();
        DvdLibraryController controller = new DvdLibraryController(myDao, myView);

        controller.run();

    }
}
