package org.example.dao;

public interface VendingMachineAuditDao {

    public void writeAuditEntry(String entry) throws VendingMachinePersistenceException;
}
